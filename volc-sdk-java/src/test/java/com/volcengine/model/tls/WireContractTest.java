package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.QueryRequest;
import com.volcengine.model.tls.RequestCycle;
import com.volcengine.model.tls.request.CreateAlarmRequest;
import com.volcengine.model.tls.request.CreateIndexRequest;
import com.volcengine.model.tls.request.DescribeCheckpointRequest;
import com.volcengine.model.tls.request.DescribeCursorRequest;
import com.volcengine.model.tls.request.SearchLogsRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Wire-contract tests (Java side).
 *
 * 锁定 5 个核心接口序列化为 JSON body 的 top-level key 集合。query 字段（标 serialize=false）
 * 必须**不出现**在 body 中。Baseline 见 cospec/.../context/wire-baseline.json。
 */
public class WireContractTest {

    private static Set<String> bodyKeys(Object req) {
        JSONObject obj = JSON.parseObject(JSON.toJSONString(req));
        return new TreeSet<>(obj.keySet());
    }

    private static Set<String> set(String... keys) {
        return new TreeSet<>(Arrays.asList(keys));
    }

    @Test
    public void describeCursorRequest_bodyOnlyContainsFrom() {
        DescribeCursorRequest req = new DescribeCursorRequest("tid", 1, "begin");
        // topicId, shardId 标 serialize=false，body 只剩 From
        Assert.assertEquals(set("From"), bodyKeys(req));
    }

    @Test
    public void describeCheckpointRequest_bodyOnlyContainsConsumerGroupName() {
        DescribeCheckpointRequest req = new DescribeCheckpointRequest("pid", "tid", 1, "g1");
        Assert.assertEquals(set("ConsumerGroupName"), bodyKeys(req));
    }

    @Test
    public void searchLogsRequest_bodyContainsAllSpecKeys() {
        SearchLogsRequest req = new SearchLogsRequest();
        req.setTopicId("tid");
        req.setQuery("*");
        req.setStartTime(1L);
        req.setEndTime(2L);
        req.setLimit(20);
        req.setContext("");
        req.setSort("asc");
        req.setHighLight(false);
        req.setAccurateQuery(true);
        req.setOffset(0);
        req.setMustComplete(true);
        req.setRegionTopics(Collections.emptyList());

        Set<String> expected = set("AccurateQuery", "Context", "EndTime", "HighLight",
                "Limit", "MustComplete", "Offset", "Query", "RegionTopics", "Sort",
                "StartTime", "TopicId");
        Assert.assertEquals(expected, bodyKeys(req));
    }

    @Test
    public void createAlarmRequest_bodyContainsAllSpecKeys() {
        CreateAlarmRequest req = new CreateAlarmRequest();
        req.setAlarmName("a1");
        req.setProjectId("pid");
        req.setStatus(true);
        req.setQueryRequest(Collections.<QueryRequest>emptyList());
        req.setRequestCycle(new RequestCycle());
        req.setCondition("x>1");
        req.setTriggerPeriod(1);
        req.setAlarmPeriod(1);
        req.setAlarmNotifyGroup(Arrays.asList("g"));
        req.setUserDefineMsg("x");
        req.setSeverity("warn");
        req.setSendResolved(false);

        // expectation: 业务全集 15 字段；可选字段未设置则不出现是允许的（subset of allowed）。
        Set<String> got = bodyKeys(req);
        Set<String> allowed = new HashSet<>(Arrays.asList(
                "AlarmName", "AlarmNotifyGroup", "AlarmPeriod", "AlarmPeriodDetail",
                "Condition", "JoinConfigurations", "ProjectId", "QueryRequest",
                "RequestCycle", "SendResolved", "Severity", "Status",
                "TriggerConditions", "TriggerPeriod", "UserDefineMsg"));
        for (String k : got) {
            Assert.assertTrue("unexpected key in body: " + k, allowed.contains(k));
        }
        Set<String> required = new HashSet<>(Arrays.asList(
                "AlarmName", "ProjectId", "QueryRequest", "RequestCycle",
                "TriggerPeriod", "AlarmNotifyGroup"));
        Assert.assertTrue("missing required keys: " + required + " vs " + got,
                got.containsAll(required));
    }

    @Test
    public void createIndexRequest_bodyContainsExpectedKeys() {
        CreateIndexRequest req = new CreateIndexRequest("tid", null, null, null, 2048, true, true);
        Set<String> got = bodyKeys(req);
        Set<String> allowed = new HashSet<>(Arrays.asList(
                "EnableAutoIndex", "EnablePhraseIndex", "FullText", "KeyValue",
                "LogReduce", "LogReduceBlackList", "LogReduceWhiteList",
                "MaxTextLen", "TopicId", "UserInnerKeyValue"));
        for (String k : got) {
            Assert.assertTrue("unexpected key in body: " + k, allowed.contains(k));
        }
        Assert.assertTrue("missing TopicId", got.contains("TopicId"));
    }
}
