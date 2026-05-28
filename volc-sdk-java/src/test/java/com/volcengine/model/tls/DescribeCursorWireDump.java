package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeCursorRequest;
import com.volcengine.model.tls.response.DescribeCursorResponse;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 真实环境贯通用例（DescribeCursor，3 case：begin/end/from_ts）。
 *
 * 必需 env：WIRE_MATRIX_OUT_DIR / LOG_SERVICE_ENDPOINT / LOG_SERVICE_AK / LOG_SERVICE_SK
 *           LOG_SERVICE_REGION / WIRE_TOPIC_ID。缺一即 skip。
 * 输出：${WIRE_MATRIX_OUT_DIR}/java.jsonl，每行 {case, method, path, query, body, status, req_id, err}。
 *
 * Java SDK 不直接暴露 HttpClient 拦截点；wire 字段由 wire 已经 byte-level 验证过，本阶段重点是
 * 端到端 status=200 与 req_id 落库，作为"服务端实际接受 Java SDK 真实请求"的证据。
 */
public class DescribeCursorWireDump {

    @Test
    public void dump() throws IOException {
        String outDir = System.getenv("WIRE_MATRIX_OUT_DIR");
        String endpoint = System.getenv("LOG_SERVICE_ENDPOINT");
        String ak = System.getenv("LOG_SERVICE_AK");
        String sk = System.getenv("LOG_SERVICE_SK");
        String region = System.getenv("LOG_SERVICE_REGION");
        String topicId = System.getenv("WIRE_TOPIC_ID");
        org.junit.Assume.assumeTrue("wire matrix env not set",
                outDir != null && endpoint != null && ak != null && sk != null && region != null && topicId != null);

        ClientConfig cfg = new ClientConfig(endpoint, region, ak, sk, null);
        TLSLogClient client;
        try {
            client = ClientBuilder.newClient(cfg);
        } catch (LogException e) {
            throw new RuntimeException(e);
        }

        Path target = Paths.get(outDir, "java.jsonl");
        Files.createDirectories(target.getParent());
        try (java.io.OutputStream os = Files.newOutputStream(target);
             OutputStreamWriter w = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
            String[][] cases = new String[][]{
                    {"begin", "begin"},
                    {"end", "end"},
                    {"from_ts", String.valueOf(System.currentTimeMillis() / 1000 - 3600)}
            };
            // 写 jsonl，case 按字母序排序保持 cross-SDK 对齐
            Arrays.sort(cases, (a, b) -> a[0].compareTo(b[0]));
            for (String[] c : cases) {
                Map<String, Object> rec = new LinkedHashMap<>();
                rec.put("case", c[0]);
                rec.put("method", "POST");
                rec.put("path", "/DescribeCursor");
                Map<String, String> q = new LinkedHashMap<>();
                q.put("ShardId", "0");
                q.put("TopicId", topicId);
                rec.put("query", q);
                Map<String, String> body = new LinkedHashMap<>();
                body.put("From", c[1]);
                rec.put("body", body);

                DescribeCursorRequest req = new DescribeCursorRequest(topicId, 0, c[1]);
                int status = 0;
                String reqId = "";
                String err = "";
                try {
                    DescribeCursorResponse resp = client.describeCursor(req);
                    status = 200;
                    reqId = resp.getRequestId();
                } catch (LogException e) {
                    status = e.getHttpCode();
                    reqId = e.getRequestId() == null ? "" : e.getRequestId();
                    err = e.getErrorCode() + ": " + e.getErrorMessage();
                }
                rec.put("status", status);
                rec.put("req_id", reqId == null ? "" : reqId);
                if (!err.isEmpty()) {
                    rec.put("err", err);
                }
                w.write(JSON.toJSONString(rec, SerializerFeature.DisableCircularReferenceDetect));
                w.write("\n");
            }
        }
    }
}
