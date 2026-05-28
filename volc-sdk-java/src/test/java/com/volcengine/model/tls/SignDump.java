package com.volcengine.model.tls;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.auth.impl.SignerV4Impl;
import com.volcengine.model.Credentials;
import com.volcengine.model.RequestParam;
import com.volcengine.model.SignRequest;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.TreeMap;

/**
 * Sign 头部 dump：基于固定 fixture 调用 SignerV4Impl，输出 Authorization 等签名头到文件。
 * 不发起任何 HTTP 请求；签名因 Date 固定而具有确定性，便于跨 SDK 比对。
 *
 * 入参：cospec/.../l4-snapshots/fixture.json
 * 出参：cospec/.../l4-snapshots/sign-java.txt
 */
public class SignDump {
    private static final String FIXTURE_RELATIVE_PATH =
            "cospec/changes/check-tls-sdk-contract-alignment/context/l4-snapshots/fixture.json";

    public static void main(String[] args) throws Exception {
        String fixtureOverride = firstNonEmpty(
                System.getProperty("sign.fixturePath"),
                System.getenv("SIGN_FIXTURE_PATH"),
                System.getProperty("l4.fixturePath"),
                System.getenv("L4_FIXTURE_PATH"));
        Path fixturePath = resolveFixturePath(
                fixtureOverride,
                firstNonEmpty(System.getProperty("sign.repoRoot"), System.getProperty("l4.repoRoot")),
                Paths.get("").toAbsolutePath());
        if (fixturePath == null || !Files.exists(fixturePath)) {
            System.err.println("sign fixture not found; set sign.fixturePath or SIGN_FIXTURE_PATH to run dump");
            return;
        }

        Path outPath = resolveOutputPath(firstNonEmpty(
                System.getProperty("sign.outDir"),
                System.getenv("SIGN_OUT_DIR"),
                System.getProperty("l4.outDir"),
                System.getenv("L4_OUT_DIR")));

        ObjectMapper mapper = new ObjectMapper();
        JsonNode fx = mapper.readTree(fixturePath.toFile());

        String ak = fx.get("ak").asText();
        String sk = fx.get("sk").asText();
        String region = fx.get("region").asText();
        String service = fx.get("service").asText();
        String method = fx.get("method").asText();
        String host = fx.get("host").asText();
        String path = fx.get("path").asText();
        String body = fx.get("body").asText();
        String contentType = fx.get("content_type").asText();
        String xDate = fx.get("x_date").asText();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = sdf.parse(xDate);

        // 按 key 字典序排好，确保确定性
        TreeMap<String, String> sortedQuery = new TreeMap<>();
        JsonNode queryNode = fx.get("query");
        if (queryNode != null && queryNode.isObject()) {
            Iterator<String> it = queryNode.fieldNames();
            while (it.hasNext()) {
                String k = it.next();
                sortedQuery.put(k, queryNode.get(k).asText());
            }
        }
        List<NameValuePair> queryList = new ArrayList<>();
        for (java.util.Map.Entry<String, String> e : sortedQuery.entrySet()) {
            queryList.add(new BasicNameValuePair(e.getKey(), e.getValue()));
        }

        Header[] headers = new Header[]{new BasicHeader("Content-Type", contentType)};

        RequestParam rp = RequestParam.builder()
                .isSignUrl(false)
                .body(body.getBytes(StandardCharsets.UTF_8))
                .host(host)
                .path(path)
                .method(method)
                .date(date)
                .queryList(queryList)
                .headers(headers)
                .build();

        Credentials creds = new Credentials();
        creds.setAccessKeyID(ak);
        creds.setSecretAccessKey(sk);
        creds.setRegion(region);
        creds.setService(service);

        SignRequest signRequest = new SignerV4Impl().getSignRequest(rp, creds);

        TreeMap<String, String> out = new TreeMap<>();
        out.put("Authorization", nullToEmpty(signRequest.getAuthorization()));
        out.put("ContentType", nullToEmpty(signRequest.getContentType()));
        out.put("Host", nullToEmpty(signRequest.getHost()));
        out.put("XContentSha256", nullToEmpty(signRequest.getXContentSha256()));
        out.put("XDate", nullToEmpty(signRequest.getXDate()));

        Files.createDirectories(outPath.getParent());
        try (java.io.OutputStream os = Files.newOutputStream(outPath);
             OutputStreamWriter w = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
            for (java.util.Map.Entry<String, String> e : out.entrySet()) {
                w.write(e.getKey());
                w.write(": ");
                w.write(e.getValue());
                w.write("\n");
            }
        }

        // 同时打印到 stdout，便于日志观察
        for (java.util.Map.Entry<String, String> e : out.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println("Output: " + outPath);
        // 防止 unused 引用被 IDE 警告剔除
        Collections.emptyList();
    }

    private static String nullToEmpty(String s) {
        return s == null ? "" : s;
    }

    static Path resolveFixturePath(String fixtureOverride, String repoRoot, Path startDir) {
        if (isNotEmpty(fixtureOverride)) {
            return Paths.get(fixtureOverride).toAbsolutePath().normalize();
        }
        if (isNotEmpty(repoRoot)) {
            return Paths.get(repoRoot, FIXTURE_RELATIVE_PATH).toAbsolutePath().normalize();
        }

        Path dir = startDir.toAbsolutePath().normalize();
        while (dir != null) {
            Path candidate = dir.resolve(FIXTURE_RELATIVE_PATH);
            if (Files.exists(candidate)) {
                return candidate;
            }
            dir = dir.getParent();
        }
        return null;
    }

    static Path resolveOutputPath(String outDirOverride) throws IOException {
        Path outDir;
        if (isNotEmpty(outDirOverride)) {
            outDir = Paths.get(outDirOverride).toAbsolutePath().normalize();
            Files.createDirectories(outDir);
        } else {
            outDir = Files.createTempDirectory("sign-dump-java-");
        }
        return outDir.resolve("sign-java.txt");
    }

    private static String firstNonEmpty(String... values) {
        for (String value : values) {
            if (isNotEmpty(value)) {
                return value;
            }
        }
        return null;
    }

    private static boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
