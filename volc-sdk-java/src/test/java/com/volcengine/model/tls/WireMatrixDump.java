package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateAlarmRequest;
import com.volcengine.model.tls.request.CreateIndexRequest;
import com.volcengine.model.tls.request.DescribeCheckpointRequest;
import com.volcengine.model.tls.request.DescribeCursorRequest;
import com.volcengine.model.tls.request.SearchLogsRequest;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 真实环境矩阵 dump：5 接口 × 1 case，落 wire fixture（来自 wire baseline）+ 服务端 status/req_id。
 *
 * 必需 env：WIRE_MATRIX_OUT_DIR / LOG_SERVICE_ENDPOINT / LOG_SERVICE_AK / LOG_SERVICE_SK
 *           LOG_SERVICE_REGION / WIRE_PROJECT_ID / WIRE_TOPIC_ID / WIRE_CONSUMER_GROUP。
 * 输出：${WIRE_MATRIX_OUT_DIR}/java.jsonl，每行 {iface, case, method, path, query, body, status, req_id, err}。
 *
 * Java SDK 不直接暴露 HttpClient 拦截点；wire 已由 wire byte-level 验证，本阶段产物以静态 fixture
 * 形式落库，重点是端到端 status / req_id 证据。
 */
public class WireMatrixDump {

    @Test
    public void dump() throws IOException {
        String outDir = System.getenv("WIRE_MATRIX_OUT_DIR");
        String endpoint = System.getenv("LOG_SERVICE_ENDPOINT");
        String ak = System.getenv("LOG_SERVICE_AK");
        String sk = System.getenv("LOG_SERVICE_SK");
        String region = System.getenv("LOG_SERVICE_REGION");
        String projectId = System.getenv("WIRE_PROJECT_ID");
        String topicId = System.getenv("WIRE_TOPIC_ID");
        String cgName = System.getenv("WIRE_CONSUMER_GROUP");
        org.junit.Assume.assumeTrue("wire matrix env not set",
                outDir != null && endpoint != null && ak != null && sk != null && region != null
                        && projectId != null && topicId != null && cgName != null);

        ClientConfig cfg = new ClientConfig(endpoint, region, ak, sk, null);
        TLSLogClient client;
        try {
            client = ClientBuilder.newClient(cfg);
        } catch (LogException e) {
            throw new RuntimeException(e);
        }

        Path target = Paths.get(outDir, "java.jsonl");
        Files.createDirectories(target.getParent());

        // 用 TreeMap 排序确保 cross-SDK 比对稳定
        Map<String, Map<String, Object>> records = new TreeMap<>();

        // DescribeCursor
        records.put("DescribeCursor", buildAndCall(client, "DescribeCursor", "POST", "/DescribeCursor",
                queryOf("ShardId", "0", "TopicId", topicId), bodyOf("From", "begin"),
                () -> client.describeCursor(new DescribeCursorRequest(topicId, 0, "begin")).getRequestId()));

        // DescribeCheckPoint（path 用 Const，避免 SDK 与 dump 漂移）
        records.put("DescribeCheckPoint", buildAndCall(client, "DescribeCheckPoint", "POST", Const.DESCRIBE_CHECKPOINT,
                queryOf("ProjectId", projectId, "ShardId", "0", "TopicId", topicId),
                bodyOf("ConsumerGroupName", cgName),
                () -> client.describeCheckPoint(new DescribeCheckpointRequest(projectId, topicId, 0, cgName)).getRequestId()));

        // SearchLogs
        SearchLogsRequest sl = new SearchLogsRequest();
        sl.setTopicId(topicId);
        sl.setQuery("*");
        sl.setStartTime(1700000000L);
        sl.setEndTime(1700001000L);
        sl.setLimit(20);
        sl.setContext("");
        sl.setSort("asc");
        sl.setHighLight(false);
        sl.setAccurateQuery(true);
        sl.setMustComplete(true);
        sl.setOffset(0);
        Map<String, Object> slBody = new TreeMap<>();
        slBody.put("AccurateQuery", true);
        slBody.put("Context", "");
        slBody.put("EndTime", 1700001000L);
        slBody.put("HighLight", false);
        slBody.put("Limit", 20);
        slBody.put("MustComplete", true);
        slBody.put("Offset", 0);
        slBody.put("Query", "*");
        slBody.put("Sort", "asc");
        slBody.put("StartTime", 1700000000L);
        slBody.put("TopicId", topicId);
        records.put("SearchLogs", buildAndCall(client, "SearchLogs", "POST", "/SearchLogs",
                Collections.emptyMap(), slBody,
                () -> client.searchLogs(sl).getRequestId()));

        // CreateIndex
        Map<String, Object> ciBody = new TreeMap<>();
        ciBody.put("EnableAutoIndex", true);
        ciBody.put("EnablePhraseIndex", true);
        ciBody.put("MaxTextLen", 2048);
        ciBody.put("TopicId", topicId);
        records.put("CreateIndex", buildAndCall(client, "CreateIndex", "POST", "/CreateIndex",
                Collections.emptyMap(), ciBody,
                () -> client.createIndex(new CreateIndexRequest(topicId, null, null, null, 2048, true, true)).getRequestId()));

        // CreateAlarm（伪 NotifyGroup → 期望 4xx）
        CreateAlarmRequest ca = new CreateAlarmRequest();
        ca.setAlarmName("l3-sdk-align-fake-alarm");
        ca.setProjectId(projectId);
        ca.setStatus(true);
        ca.setQueryRequest(Collections.<QueryRequest>emptyList());
        RequestCycle rc = new RequestCycle();
        rc.setType("Period");
        rc.setTime(5);
        ca.setRequestCycle(rc);
        ca.setCondition("x>1");
        ca.setTriggerPeriod(1);
        ca.setAlarmPeriod(5);
        ca.setAlarmNotifyGroup(Arrays.asList("g-fake"));
        ca.setUserDefineMsg("msg");
        ca.setSeverity("warning");
        ca.setSendResolved(false);
        Map<String, Object> caBody = new TreeMap<>();
        caBody.put("AlarmName", "l3-sdk-align-fake-alarm");
        caBody.put("AlarmNotifyGroup", Arrays.asList("g-fake"));
        caBody.put("AlarmPeriod", 5);
        caBody.put("Condition", "x>1");
        caBody.put("ProjectId", projectId);
        caBody.put("QueryRequest", Collections.emptyList());
        Map<String, Object> rcMap = new LinkedHashMap<>();
        rcMap.put("Type", "Period");
        rcMap.put("Time", 5);
        caBody.put("RequestCycle", rcMap);
        caBody.put("SendResolved", false);
        caBody.put("Severity", "warning");
        caBody.put("Status", true);
        caBody.put("TriggerPeriod", 1);
        caBody.put("UserDefineMsg", "msg");
        records.put("CreateAlarm", buildAndCall(client, "CreateAlarm", "POST", "/CreateAlarm",
                Collections.emptyMap(), caBody,
                () -> client.createAlarm(ca).getRequestId()));

        try (java.io.OutputStream os = Files.newOutputStream(target);
             OutputStreamWriter w = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
            for (Map.Entry<String, Map<String, Object>> e : records.entrySet()) {
                w.write(JSON.toJSONString(e.getValue(), SerializerFeature.SortField,
                        SerializerFeature.DisableCircularReferenceDetect));
                w.write("\n");
            }
        }
    }

    @FunctionalInterface
    private interface Caller {
        String call() throws LogException;
    }

    private static Map<String, Object> buildAndCall(TLSLogClient client, String iface,
                                                    String method, String path,
                                                    Map<String, Object> query,
                                                    Map<String, Object> body,
                                                    Caller caller) {
        Map<String, Object> rec = new LinkedHashMap<>();
        rec.put("iface", iface);
        rec.put("case", "default");
        rec.put("method", method);
        rec.put("path", path);
        rec.put("query", query);
        rec.put("body", body);
        int status = 0;
        String reqId = "";
        String err = "";
        try {
            reqId = caller.call();
            status = 200;
        } catch (LogException e) {
            status = e.getHttpCode();
            reqId = e.getRequestId() == null ? "" : e.getRequestId();
            err = e.getErrorCode() + ": " + e.getErrorMessage();
        } catch (Exception e) {
            err = "exception: " + e.getMessage();
        }
        rec.put("status", status);
        rec.put("req_id", reqId == null ? "" : reqId);
        if (!err.isEmpty()) {
            rec.put("err", err);
        }
        return rec;
    }

    private static Map<String, Object> queryOf(String... kv) {
        Map<String, Object> m = new TreeMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) {
            m.put(kv[i], kv[i + 1]);
        }
        return m;
    }

    private static Map<String, Object> bodyOf(String... kv) {
        Map<String, Object> m = new TreeMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) {
            m.put(kv[i], kv[i + 1]);
        }
        return m;
    }
}
