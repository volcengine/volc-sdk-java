package com.volcengine.model.livesaas;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.livesaas.request.CreateTaskRequest;
import com.volcengine.model.livesaas.request.CreateVideoTaskRequest;
import com.volcengine.model.livesaas.request.ListTasksRequest;
import com.volcengine.model.livesaas.request.SubmitAuditRequest;
import com.volcengine.model.livesaas.response.CreateVideoTaskResponse;
import com.volcengine.model.livesaas.response.GetMergedReportResponse;
import com.volcengine.model.livesaas.response.GetReportResponse;
import com.volcengine.model.livesaas.response.GetTaskResponse;
import com.volcengine.model.livesaas.response.GetVideoReportResponse;
import com.volcengine.model.livesaas.response.GetVideoTaskResponse;
import com.volcengine.model.livesaas.response.ListTasksResponse;
import com.volcengine.service.livesaas.LivesaasConfig;
import org.apache.http.NameValuePair;
import org.junit.Assert;
import org.junit.Test;

public class VideoInspectOpenApiModelTest {

    @Test
    public void liveInspectTaskModelsPreserveMuteFields() {
        CreateTaskRequest createRequest = JSON.parseObject("{\"MuteEnabled\":true}", CreateTaskRequest.class);
        Assert.assertTrue(JSON.parseObject(JSON.toJSONString(createRequest)).getBooleanValue("MuteEnabled"));

        ListTasksRequest listRequest = JSON.parseObject("{\"MuteEnabledOnly\":true}", ListTasksRequest.class);
        Assert.assertTrue(JSON.parseObject(JSON.toJSONString(listRequest)).getBooleanValue("MuteEnabledOnly"));

        GetTaskResponse getTaskResponse = JSON.parseObject("{\"Result\":{\"MuteEnabled\":true}}", GetTaskResponse.class);
        Assert.assertTrue(JSON.parseObject(JSON.toJSONString(getTaskResponse))
                .getJSONObject("Result").getBooleanValue("MuteEnabled"));

        ListTasksResponse listTasksResponse = JSON.parseObject(
                "{\"Result\":{\"TaskDetails\":[{\"MuteEnabled\":true}]}}", ListTasksResponse.class);
        Assert.assertTrue(JSON.parseObject(JSON.toJSONString(listTasksResponse))
                .getJSONObject("Result").getJSONArray("TaskDetails").getJSONObject(0)
                .getBooleanValue("MuteEnabled"));
    }

    @Test
    public void optionalMuteFieldsRemainAbsentWhenOmitted() {
        JSONObject createTaskWithoutMute = JSON.parseObject(JSON.toJSONString(
                JSON.parseObject("{}", CreateTaskRequest.class)));
        Assert.assertFalse(createTaskWithoutMute.containsKey("MuteEnabled"));

        JSONObject createTaskWithMuteDisabled = JSON.parseObject(JSON.toJSONString(
                JSON.parseObject("{\"MuteEnabled\":false}", CreateTaskRequest.class)));
        Assert.assertTrue(createTaskWithMuteDisabled.containsKey("MuteEnabled"));
        Assert.assertFalse(createTaskWithMuteDisabled.getBooleanValue("MuteEnabled"));

        JSONObject listTasksWithoutMuteFilter = JSON.parseObject(JSON.toJSONString(
                JSON.parseObject("{}", ListTasksRequest.class)));
        Assert.assertFalse(listTasksWithoutMuteFilter.containsKey("MuteEnabledOnly"));

        JSONObject getTaskWithoutMute = JSON.parseObject(JSON.toJSONString(
                JSON.parseObject("{\"Result\":{}}", GetTaskResponse.class)))
                .getJSONObject("Result");
        Assert.assertFalse(getTaskWithoutMute.containsKey("MuteEnabled"));

        JSONObject listTasksWithoutMute = JSON.parseObject(JSON.toJSONString(JSON.parseObject(
                "{\"Result\":{\"TaskDetails\":[{}]}}", ListTasksResponse.class)))
                .getJSONObject("Result").getJSONArray("TaskDetails").getJSONObject(0);
        Assert.assertFalse(listTasksWithoutMute.containsKey("MuteEnabled"));

        JSONObject submitAuditWithoutRecovery = JSON.parseObject(JSON.toJSONString(JSON.parseObject(
                "{\"AuditSource\":\"LIVE\",\"OperationType\":\"INTERRUPTION\"}",
                SubmitAuditRequest.class)));
        Assert.assertFalse(submitAuditWithoutRecovery.containsKey("AutoRecoverSeconds"));

        String legacyReportJson = "{\"Result\":{\"RuleResultDetails\":[{\"MachineDetails\":{"
                + "\"CustomSensitiveResults\":[{\"MessageId\":1}],"
                + "\"SystemSensitiveResults\":[{\"MessageId\":2}]}}]}}";
        assertLegacyReportMuteFieldsRemainAbsent(JSON.toJSONString(
                JSON.parseObject(legacyReportJson, GetReportResponse.class)));
        assertLegacyReportMuteFieldsRemainAbsent(JSON.toJSONString(
                JSON.parseObject(legacyReportJson, GetMergedReportResponse.class)));
    }

    @Test
    public void submitAuditRequestPreservesAutoRecoverSeconds() {
        SubmitAuditRequest request = JSON.parseObject(
                "{\"AuditSource\":\"LIVE\",\"OperationType\":\"INTERRUPTION\",\"AutoRecoverSeconds\":-1}",
                SubmitAuditRequest.class);

        JSONObject encoded = JSON.parseObject(JSON.toJSONString(request));
        Assert.assertEquals(Integer.valueOf(-1), encoded.getInteger("AutoRecoverSeconds"));
        assertApiConfig(Const.SubmitAudit, "POST");
    }

    @Test
    public void createVideoTaskRequestPreservesUrlSourcePayload() {
        String json = "{"
                + "\"ProjectName\":\"project-1\","
                + "\"TaskName\":\"URL task\","
                + "\"ScenarioId\":1001,"
                + "\"SourceType\":4,"
                + "\"TaskItems\":[{"
                + "\"Url\":\"https://example.com/video.m3u8\","
                + "\"VideoName\":\"video.m3u8\""
                + "}],"
                + "\"CallbackURL\":\"https://callback.example.com/inspect\","
                + "\"Extra\":\"{\\\"biz_id\\\":\\\"abc\\\"}\","
                + "\"TagIds\":[7],"
                + "\"SpecifiableRuleArgs\":[{"
                + "\"RuleId\":88,"
                + "\"OcrTextRecognitionArgs\":{\"PresetText\":\"forbidden text\"},"
                + "\"OcrScrollingSubtitlesArgs\":{\"PresetSubtitles\":\"forbidden subtitles\"},"
                + "\"PresetScriptArgs\":{\"PresetScript\":\"standard script\"}"
                + "}]"
                + "}";

        CreateVideoTaskRequest request = JSON.parseObject(json, CreateVideoTaskRequest.class);
        JSONObject encoded = JSON.parseObject(JSON.toJSONString(request));

        Assert.assertEquals("project-1", encoded.getString("ProjectName"));
        Assert.assertEquals(Integer.valueOf(4), encoded.getInteger("SourceType"));
        JSONObject item = encoded.getJSONArray("TaskItems").getJSONObject(0);
        Assert.assertEquals("https://example.com/video.m3u8", item.getString("Url"));
        Assert.assertEquals("video.m3u8", item.getString("VideoName"));

        JSONObject rule = encoded.getJSONArray("SpecifiableRuleArgs").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(88), rule.getLong("RuleId"));
        Assert.assertEquals("forbidden text", rule.getJSONObject("OcrTextRecognitionArgs").getString("PresetText"));
        Assert.assertEquals("forbidden subtitles", rule.getJSONObject("OcrScrollingSubtitlesArgs").getString("PresetSubtitles"));
        Assert.assertEquals("standard script", rule.getJSONObject("PresetScriptArgs").getString("PresetScript"));
    }

    @Test
    public void createVideoTaskResponsePreservesSuccessAndFailureDetails() {
        CreateVideoTaskResponse response = JSON.parseObject("{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req\"},"
                + "\"Result\":{"
                + "\"TotalCount\":2,"
                + "\"SuccessCount\":1,"
                + "\"FailedCount\":1,"
                + "\"SuccessTasks\":[{\"Index\":0,\"SourceId\":\"example.com/a.mp4\",\"TaskId\":100}],"
                + "\"FailedTasks\":[{\"Index\":1,\"SourceId\":\"example.com/b.mp4\",\"ErrorCode\":\"InvalidURL\",\"ErrorMessage\":\"invalid video url\"}]"
                + "}"
                + "}", CreateVideoTaskResponse.class);

        JSONObject result = JSON.parseObject(JSON.toJSONString(response)).getJSONObject("Result");
        Assert.assertEquals(Integer.valueOf(2), result.getInteger("TotalCount"));
        Assert.assertEquals(Long.valueOf(100), result.getJSONArray("SuccessTasks").getJSONObject(0).getLong("TaskId"));
        Assert.assertEquals("InvalidURL", result.getJSONArray("FailedTasks").getJSONObject(0).getString("ErrorCode"));
    }

    @Test
    public void getVideoTaskResponsePreservesVideoInfo() {
        GetVideoTaskResponse response = JSON.parseObject("{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req\"},"
                + "\"Result\":{"
                + "\"TaskId\":100,"
                + "\"TaskName\":\"video task\","
                + "\"ProjectName\":\"project-1\","
                + "\"TaskType\":1,"
                + "\"Status\":4,"
                + "\"VideoInfo\":{"
                + "\"Vid\":\"v0c7\","
                + "\"VideoURL\":\"https://example.com/video.mp4\","
                + "\"VideoName\":\"video.mp4\","
                + "\"SourceType\":4,"
                + "\"SourceTaskId\":0"
                + "}"
                + "}"
                + "}", GetVideoTaskResponse.class);

        JSONObject videoInfo = JSON.parseObject(JSON.toJSONString(response)).getJSONObject("Result").getJSONObject("VideoInfo");
        Assert.assertEquals("v0c7", videoInfo.getString("Vid"));
        Assert.assertEquals("https://example.com/video.mp4", videoInfo.getString("VideoURL"));
        Assert.assertEquals(Integer.valueOf(4), videoInfo.getInteger("SourceType"));
    }

    @Test
    public void reportResponsesPreserveEnhancedMachineDetails() {
        assertEnhancedReportFields(JSON.toJSONString(JSON.parseObject(reportJson(), GetReportResponse.class)));
        assertEnhancedReportFields(JSON.toJSONString(JSON.parseObject(mergedReportJson(), GetMergedReportResponse.class)));
        assertVideoReportFields(JSON.toJSONString(JSON.parseObject(reportJson(), GetVideoReportResponse.class)));
    }

    @Test
    public void videoInspectActionsUseExpectedConfig() {
        assertApiConfig(Const.ListVideoScenarios, "GET");
        assertApiConfig(Const.GetVideoScenario, "GET");
        assertApiConfig(Const.CreateVideoTask, "POST");
        assertApiConfig(Const.EndVideoTask, "POST");
        assertApiConfig(Const.ListVideoTasks, "POST");
        assertApiConfig(Const.GetVideoTask, "GET");
        assertApiConfig(Const.GetVideoReport, "GET");
        assertApiConfig(Const.SubmitVideoAudit, "POST");
    }

    private void assertEnhancedReportFields(String encodedJson) {
        JSONObject encoded = JSON.parseObject(encodedJson);
        JSONArray ruleDetails = encoded.getJSONObject("Result").getJSONArray("RuleResultDetails");
        JSONObject machine = ruleDetails.getJSONObject(0).getJSONObject("MachineDetails");

        JSONObject text = machine.getJSONArray("AnalysisTexts").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(65), text.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(66), text.getLong("EndTime"));
        Assert.assertEquals(Long.valueOf(1744016876), text.getLong("AbsoluteEndTime"));
        Assert.assertEquals("analysis-text-type", text.getString("Type"));

        JSONObject image = machine.getJSONArray("AnalysisImages").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(67), image.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(68), image.getLong("EndTime"));
        Assert.assertEquals(Long.valueOf(1744016878), image.getLong("AbsoluteEndTime"));
        Assert.assertEquals("analysis-image-type", image.getString("Type"));

        JSONObject custom = machine.getJSONArray("CustomSensitiveResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), custom.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(31), custom.getLong("AuditID"));
        Assert.assertEquals("FULL_HIT", custom.getString("MuteExecutionStatus"));
        Assert.assertEquals(Long.valueOf(1000), custom.getJSONObject("MuteExecutionDetail").getLong("BeginPtsMs"));
        Assert.assertEquals(Long.valueOf(2000), custom.getJSONObject("MuteExecutionDetail").getLong("EndPtsMs"));
        Assert.assertEquals(Long.valueOf(1744016871000L), custom.getJSONObject("MuteExecutionDetail").getLong("OccurredAt"));
        Assert.assertEquals("", custom.getJSONObject("MuteExecutionDetail").getString("Reason"));
        Assert.assertFalse(custom.containsKey("EndTime"));
        Assert.assertFalse(custom.containsKey("AbsoluteEndTime"));

        JSONObject system = machine.getJSONArray("SystemSensitiveResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), system.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(32), system.getLong("AuditID"));
        Assert.assertEquals("PENDING", system.getString("MuteExecutionStatus"));
        Assert.assertFalse(system.containsKey("EndTime"));
        Assert.assertFalse(system.containsKey("AbsoluteEndTime"));

        JSONObject ocr = machine.getJSONArray("OCRTextRecognitionResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(63), ocr.getLong("EndTime"));
        Assert.assertEquals(Long.valueOf(1744016873), ocr.getLong("AbsoluteEndTime"));
        Assert.assertEquals("ocr-type", ocr.getString("Type"));

        JSONObject subtitle = machine.getJSONArray("OCRBottomSubtitleResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(64), subtitle.getLong("EndTime"));
        Assert.assertEquals(Long.valueOf(1744016874), subtitle.getLong("AbsoluteEndTime"));
        Assert.assertEquals("subtitle-type", subtitle.getString("Type"));
    }

    private void assertLegacyReportMuteFieldsRemainAbsent(String encodedJson) {
        JSONObject machine = JSON.parseObject(encodedJson).getJSONObject("Result")
                .getJSONArray("RuleResultDetails").getJSONObject(0).getJSONObject("MachineDetails");
        for (String resultName : new String[]{"CustomSensitiveResults", "SystemSensitiveResults"}) {
            JSONObject result = machine.getJSONArray(resultName).getJSONObject(0);
            Assert.assertFalse(result.containsKey("AuditID"));
            Assert.assertFalse(result.containsKey("MuteExecutionStatus"));
            Assert.assertFalse(result.containsKey("MuteExecutionDetail"));
        }
    }

    private void assertVideoReportFields(String encodedJson) {
        JSONObject encoded = JSON.parseObject(encodedJson);
        JSONArray ruleDetails = encoded.getJSONObject("Result").getJSONArray("RuleResultDetails");
        JSONObject ruleDetail = ruleDetails.getJSONObject(0);
        Assert.assertEquals("PRICING_ANALYSIS", ruleDetail.getString("RuleSubType"));
        Assert.assertEquals(Integer.valueOf(1), ruleDetail.getJSONObject("RuleData").getInteger("TotalCount"));
        JSONObject machine = ruleDetails.getJSONObject(0).getJSONObject("MachineDetails");

        JSONObject text = machine.getJSONArray("AnalysisTexts").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(65), text.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(66), text.getLong("EndTime"));
        Assert.assertEquals("Series 3", text.getJSONObject("DetailData").getString("RelatedVehicleModel"));
        Assert.assertFalse(text.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(text.containsKey("AbsoluteEndTime"));

        JSONObject image = machine.getJSONArray("AnalysisImages").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(67), image.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(68), image.getLong("EndTime"));
        Assert.assertEquals(Integer.valueOf(60), image.getJSONObject("DetailData").getInteger("DurationSeconds"));
        Assert.assertFalse(image.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(image.containsKey("AbsoluteEndTime"));

        JSONObject custom = machine.getJSONArray("CustomSensitiveResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), custom.getLong("StartTime"));
        Assert.assertFalse(custom.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(custom.containsKey("AbsoluteEndTime"));

        JSONObject system = machine.getJSONArray("SystemSensitiveResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), system.getLong("StartTime"));
        Assert.assertFalse(system.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(system.containsKey("AbsoluteEndTime"));

        JSONObject ocr = machine.getJSONArray("OCRTextRecognitionResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), ocr.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(63), ocr.getLong("EndTime"));
        Assert.assertFalse(ocr.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(ocr.containsKey("AbsoluteEndTime"));

        JSONObject subtitle = machine.getJSONArray("OCRBottomSubtitleResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), subtitle.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(64), subtitle.getLong("EndTime"));
        Assert.assertFalse(subtitle.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(subtitle.containsKey("AbsoluteEndTime"));
    }

    private void assertApiConfig(String action, String method) {
        ApiInfo apiInfo = LivesaasConfig.apiInfoList.get(action);
        Assert.assertNotNull(apiInfo);
        Assert.assertEquals(method, apiInfo.getMethod());
        Assert.assertEquals("/", apiInfo.getPath());
        Assert.assertEquals(action, getQueryValue(apiInfo, "Action"));
        Assert.assertEquals("2024-08-01", getQueryValue(apiInfo, "Version"));
    }

    private String getQueryValue(ApiInfo apiInfo, String name) {
        for (NameValuePair pair : apiInfo.getQuery()) {
            if (name.equals(pair.getName())) {
                return pair.getValue();
            }
        }
        return null;
    }

    private String reportJson() {
        return "{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req\"},"
                + "\"Result\":{"
                + "\"TaskDetail\":{\"TaskId\":100,\"TaskName\":\"task\",\"ProjectName\":\"project-1\"},"
                + "\"TaskResult\":{\"Cost\":10},"
                + "\"RuleResultDetails\":[" + ruleResultJson() + "]"
                + "}"
                + "}";
    }

    private String mergedReportJson() {
        return "{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req\"},"
                + "\"Result\":{"
                + "\"TaskDetails\":[{\"TaskId\":100,\"TaskName\":\"task\",\"ProjectName\":\"project-1\"}],"
                + "\"TaskResult\":{\"Cost\":10},"
                + "\"RuleResultDetails\":[" + ruleResultJson() + "]"
                + "}"
                + "}";
    }

    private String ruleResultJson() {
        return "{"
                + "\"RuleId\":88,"
                + "\"RuleName\":\"rule\","
                + "\"RuleType\":5,"
                + "\"RuleSubType\":\"PRICING_ANALYSIS\","
                + "\"RuleData\":{\"TotalCount\":1},"
                + "\"MachineDetails\":{"
                + "\"MachineType\":5,"
                + "\"AnalysisTexts\":[{"
                + "\"MessageId\":5,"
                + "\"Text\":\"analysis text\","
                + "\"Type\":\"analysis-text-type\","
                + "\"StartTime\":65,"
                + "\"EndTime\":66,"
                + "\"AbsoluteStartTime\":1744016865,"
                + "\"AbsoluteEndTime\":1744016876,"
                + "\"Description\":\"analysis text desc\","
                + "\"DetailData\":{\"RelatedVehicleModel\":\"Series 3\"}"
                + "}],"
                + "\"AnalysisImages\":[{"
                + "\"MessageId\":6,"
                + "\"ImageURLs\":[\"https://example.com/analysis.png\"],"
                + "\"Type\":\"analysis-image-type\","
                + "\"StartTime\":67,"
                + "\"EndTime\":68,"
                + "\"AbsoluteStartTime\":1744016867,"
                + "\"AbsoluteEndTime\":1744016878,"
                + "\"Description\":\"analysis image desc\","
                + "\"DetailData\":{\"DurationSeconds\":60}"
                + "}],"
                + "\"CustomSensitiveResults\":[{"
                + "\"MessageId\":1,"
                + "\"SensitiveWord\":\"word\","
                + "\"Text\":\"text\","
                + "\"StartTime\":60,"
                + "\"EndTime\":61,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016871,"
                + "\"AuditID\":31,"
                + "\"MuteExecutionStatus\":\"FULL_HIT\","
                + "\"MuteExecutionDetail\":{"
                + "\"BeginPtsMs\":1000,"
                + "\"EndPtsMs\":2000,"
                + "\"OccurredAt\":1744016871000,"
                + "\"Reason\":\"\"}"
                + "}],"
                + "\"SystemSensitiveResults\":[{"
                + "\"MessageId\":2,"
                + "\"Text\":\"text\","
                + "\"StartTime\":60,"
                + "\"EndTime\":62,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016872,"
                + "\"AuditID\":32,"
                + "\"MuteExecutionStatus\":\"PENDING\""
                + "}],"
                + "\"OCRTextRecognitionResults\":[{"
                + "\"MessageId\":3,"
                + "\"ImageURLs\":[\"https://example.com/ocr.png\"],"
                + "\"StartTime\":60,"
                + "\"EndTime\":63,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016873,"
                + "\"Description\":\"ocr desc\","
                + "\"Type\":\"ocr-type\""
                + "}],"
                + "\"OCRBottomSubtitleResults\":[{"
                + "\"MessageId\":4,"
                + "\"ImageURLs\":[\"https://example.com/subtitle.png\"],"
                + "\"StartTime\":60,"
                + "\"EndTime\":64,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016874,"
                + "\"Description\":\"subtitle desc\","
                + "\"Type\":\"subtitle-type\""
                + "}]"
                + "}"
                + "}";
    }
}
