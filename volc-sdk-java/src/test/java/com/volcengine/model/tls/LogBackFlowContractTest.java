package com.volcengine.model.tls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.request.CreateLogBackFlowTaskRequest;
import com.volcengine.model.tls.request.DescribeLogBackFlowTasksRequest;
import com.volcengine.model.tls.request.ModifyLogBackFlowTaskRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LogBackFlowContractTest {
    @Test
    public void createDoesNotRequireRetiredQueryParams() {
        CreateLogBackFlowTaskRequest request = new CreateLogBackFlowTaskRequest();
        request.setTaskName("backflow-task");
        request.setBackFlowStartTime(1L);
        request.setLogBackFlowTaskSource(validSource());
        LogBackFlowETLTaskInfo etl = new LogBackFlowETLTaskInfo();
        etl.setScript("f_set(\"key\", \"value\")");
        etl.setTargetResources(Arrays.asList(new TargetResource("target", "target-topic", "cn-beijing")));
        request.setEtlTaskInfo(etl);

        Assert.assertTrue("current service makes QueryParams optional", request.CheckValidation());
        JSONObject body = JSON.parseObject(JSON.toJSONString(request));
        Assert.assertTrue(body.containsKey("ETLTaskInfo"));
        Assert.assertFalse(body.containsKey("QueryParams"));
        Assert.assertFalse(body.containsKey("ScheduleSqlTaskInfo"));

        request.setQueryParams(new LogBackFlowQueryParams());
        Assert.assertFalse("QueryParams.Fields is required when QueryParams is present",
                request.CheckValidation());
        request.setQueryParams(null);
        request.getLogBackFlowTaskSource().getLogBackFlowTaskTopicSource().setProjectId("");
        Assert.assertFalse("source ProjectId must be non-empty", request.CheckValidation());
    }

    @Test
    public void retiredScheduleSqlRequestFieldIsRejectedAndNeverSerialized() {
        CreateLogBackFlowTaskRequest request = new CreateLogBackFlowTaskRequest();
        request.setScheduleSqlTaskInfo(new LogBackFlowScheduleSqlTaskInfo());
        Assert.assertFalse(request.CheckValidation());
        Assert.assertFalse(JSON.parseObject(JSON.toJSONString(request)).containsKey("ScheduleSqlTaskInfo"));
    }

    @Test
    public void describeUsesStringStatusAndEtlTaskId() {
        DescribeLogBackFlowTasksRequest request = new DescribeLogBackFlowTasksRequest();
        request.setStatus(Const.LOG_BACK_FLOW_STATUS_DONE);
        request.setEtlTaskId("etl-task-id");
        Assert.assertTrue(request.CheckValidation());
        Assert.assertEquals(Const.LOG_BACK_FLOW_STATUS_DONE, request.getStatus());
        Assert.assertEquals("etl-task-id", request.getEtlTaskId());
    }

    @Test
    public void modifyValidatesEtlQueryCouplingAndShipperExclusivity() {
        ModifyLogBackFlowTaskRequest request = new ModifyLogBackFlowTaskRequest();
        request.setTaskId("task-id");
        request.setQueryParams(new LogBackFlowQueryParams());
        Assert.assertFalse(request.CheckValidation());

        LogBackFlowETLTaskInfo etl = new LogBackFlowETLTaskInfo();
        etl.setScript("script");
        etl.setTargetResources(Arrays.asList(new TargetResource("target", "topic", "cn-beijing")));
        request.setEtlTaskInfo(etl);
        Assert.assertFalse("empty QueryParams.Fields must be rejected", request.CheckValidation());

        request.setQueryParams(null);
        request.setShipperToTosInfo(new LogBackFlowShipperToTosInfo());
        request.setShipperToAgentLoopInfo(new LogBackFlowShipperToAgentLoopInfo());
        Assert.assertFalse(request.CheckValidation());
    }

    @Test
    public void describeResponseKeepsCurrentAndLegacyTaskDetails() {
        String raw = "{\"TaskId\":\"task-id\","
                + "\"ETLTaskInfo\":{\"Script\":\"script\",\"TargetResources\":[{\"Alias\":\"target\",\"TopicId\":\"topic\"}]},"
                + "\"ShipperToAgentLoopInfo\":{\"EvaluationSetShipperInfo\":{\"WorkspaceId\":\"workspace\"}},"
                + "\"ScheduleSqlTaskInfo\":{\"DestTopicID\":\"legacy-topic\"},"
                + "\"RelaTasksInfo\":{\"ETLTaskId\":\"etl-id\",\"ETLTaskName\":\"etl-name\"}}";
        LogBackFlowTaskInfo task = JSON.parseObject(raw, LogBackFlowTaskInfo.class);
        Assert.assertEquals("script", task.getEtlTaskInfo().getScript());
        Assert.assertEquals("workspace", task.getShipperToAgentLoopInfo()
                .getEvaluationSetShipperInfo().getWorkspaceId());
        Assert.assertEquals("legacy-topic", task.getScheduleSqlTaskInfo().getDestTopicId());
        Assert.assertEquals("etl-id", task.getRelaTasksInfo().getEtlTaskId());
    }

    @Test
    public void queryFilterKeepsLegacyAndMixedValues() {
        LogBackFlowQueryFilter legacy = new LogBackFlowQueryFilter();
        legacy.setValues(Arrays.asList("error", "warn"));
        Assert.assertEquals(Arrays.asList("error", "warn"), legacy.getValues());
        Assert.assertEquals(Arrays.asList("error", "warn"),
                JSON.parseObject(JSON.toJSONString(legacy)).getJSONArray("Values"));

        LogBackFlowQueryFilter mixed = new LogBackFlowQueryFilter();
        mixed.setValuesAny(Arrays.<Object>asList(1, "error"));
        JSONObject wire = JSON.parseObject(JSON.toJSONString(mixed));
        Assert.assertEquals(1, wire.getJSONArray("Values").getInteger(0).intValue());
        Assert.assertEquals("error", wire.getJSONArray("Values").getString(1));

        LogBackFlowQueryFilter decoded = JSON.parseObject(
                "{\"Values\":[1,\"error\"]}", LogBackFlowQueryFilter.class);
        Assert.assertEquals(1, ((Number) decoded.getValuesAny().get(0)).intValue());
        Assert.assertEquals("error", decoded.getValuesAny().get(1));
    }

    @Test
    public void tosUnsetNumericDefaultsAreNotSerializedAsExplicitZero() {
        TosShipperInfo tos = new TosShipperInfo();
        tos.setBucket("bucket");

        JSONObject body = JSON.parseObject(JSON.toJSONString(tos));
        Assert.assertFalse("unset MaxSize=0 is rejected by log-service", body.containsKey("MaxSize"));
        Assert.assertFalse("unset Interval=0 is rejected by log-service", body.containsKey("Interval"));
    }

    private static LogBackFlowTaskSource validSource() {
        LogBackFlowTaskTopicSource topic = new LogBackFlowTaskTopicSource();
        topic.setProjectId("project-id");
        topic.setTopicId("source-topic-id");
        LogBackFlowTaskSource source = new LogBackFlowTaskSource();
        source.setSourceType("Topic");
        source.setLogBackFlowTaskTopicSource(topic);
        return source;
    }
}
