package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.request.CreateAlarmRequest;
import com.volcengine.model.tls.request.CreateIndexRequest;
import com.volcengine.model.tls.request.DescribeCheckpointRequest;
import com.volcengine.model.tls.request.DescribeCursorRequest;
import com.volcengine.model.tls.request.SearchLogsRequest;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Wire snapshot dumper for Java SDK.
 *
 * 由环境变量 WIRE_SNAPSHOT_OUT_DIR 指定输出目录；按 cospec/.../context/l2-fixtures.json 字面量构造 5 接口
 * 请求，输出到 ${WIRE_SNAPSHOT_OUT_DIR}/java.json，与 4 SDK 一致格式 {sdk, sdk_repo, interfaces}。
 *
 * Query / Body 字段的判定依据：JSONField(serialize=false) 的字段进 query；其余进 body。
 */
public class WireSnapshotDump {

    @Test
    public void dump() throws IOException {
        String outDir = System.getenv("WIRE_SNAPSHOT_OUT_DIR");
        org.junit.Assume.assumeNotNull(outDir);

        Map<String, Object> root = new LinkedHashMap<>();
        root.put("sdk", "java");
        root.put("sdk_repo", "volc-sdk-java");

        Map<String, Object> ifaces = new TreeMap<>();
        ifaces.put("DescribeCursor", snapshot(
                "POST", "/DescribeCursor",
                new DescribeCursorRequest("tid-cursor", 1, "begin")));

        DescribeCheckpointRequest dc = new DescribeCheckpointRequest("pid-ck", "tid-ck", 2, "g1");
        // path 直接引用 Const，避免 dump 字面量与 SDK 真实注册值漂移
        ifaces.put("DescribeCheckPoint", snapshot("POST", Const.DESCRIBE_CHECKPOINT, dc));

        SearchLogsRequest sl = new SearchLogsRequest();
        sl.setTopicId("tid-search");
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
        sl.setRegionTopics(Collections.emptyList());
        ifaces.put("SearchLogs", snapshot("POST", "/SearchLogs", sl));

        CreateIndexRequest ci = new CreateIndexRequest("tid-idx", null, null, null, 2048, true, true);
        ifaces.put("CreateIndex", snapshot("POST", "/CreateIndex", ci));

        CreateAlarmRequest ca = new CreateAlarmRequest();
        ca.setAlarmName("alarm-1");
        ca.setProjectId("pid-alarm");
        ca.setStatus(true);
        ca.setQueryRequest(Collections.<QueryRequest>emptyList());
        RequestCycle rc = new RequestCycle();
        rc.setType("Period");
        rc.setTime(5);
        ca.setRequestCycle(rc);
        ca.setCondition("x>1");
        ca.setTriggerPeriod(1);
        ca.setAlarmPeriod(5);
        ca.setAlarmNotifyGroup(Arrays.asList("g-1"));
        ca.setUserDefineMsg("msg");
        ca.setSeverity("warning");
        ca.setSendResolved(false);
        ifaces.put("CreateAlarm", snapshot("POST", "/CreateAlarm", ca));

        root.put("interfaces", ifaces);

        Path target = Paths.get(outDir, "java.json");
        Files.createDirectories(target.getParent());
        // 按 4 缩进 + sortField 输出。
        String json = JSON.toJSONString(root, com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat,
                com.alibaba.fastjson.serializer.SerializerFeature.SortField);
        Files.write(target, json.getBytes("UTF-8"));
        System.out.println("wire snapshot written: " + target);
    }

    /** 把请求对象拆成 query / body：JSONField(serialize=false) 的字段进 query。 */
    private static Map<String, Object> snapshot(String method, String path, Object req) {
        Map<String, Object> queryRaw = new TreeMap<>();
        // 反射收集 serialize=false 字段的实际值
        for (Field f : req.getClass().getDeclaredFields()) {
            JSONField a = f.getAnnotation(JSONField.class);
            if (a == null) continue;
            if (a.serialize()) continue;
            f.setAccessible(true);
            try {
                Object v = f.get(req);
                if (v != null) {
                    queryRaw.put(a.name(), String.valueOf(v));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        // body：FastJSON 序列化（serialize=false 的字段会被自动跳过）
        JSONObject body = JSON.parseObject(JSON.toJSONString(req));
        Map<String, Object> bodyMap = new TreeMap<>(body);

        Map<String, Object> snap = new LinkedHashMap<>();
        snap.put("method", method);
        snap.put("path", path);
        snap.put("query", queryRaw);
        snap.put("body", bodyMap);
        return snap;
    }
}
