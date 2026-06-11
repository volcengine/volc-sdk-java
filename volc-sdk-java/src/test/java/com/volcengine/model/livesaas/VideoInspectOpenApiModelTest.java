package com.volcengine.model.livesaas;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.livesaas.request.CreateVideoTaskRequest;
import com.volcengine.model.livesaas.response.CreateVideoTaskResponse;
import com.volcengine.model.livesaas.response.GetMergedReportResponse;
import com.volcengine.model.livesaas.response.GetReportResponse;
import com.volcengine.model.livesaas.response.GetVideoReportResponse;
import com.volcengine.model.livesaas.response.GetVideoTaskResponse;
import com.volcengine.service.livesaas.LivesaasConfig;
import org.apache.http.NameValuePair;
import org.junit.Assert;
import org.junit.Test;

public class VideoInspectOpenApiModelTest {

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
        Assert.assertFalse(custom.containsKey("EndTime"));
        Assert.assertFalse(custom.containsKey("AbsoluteEndTime"));

        JSONObject system = machine.getJSONArray("SystemSensitiveResults").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(60), system.getLong("StartTime"));
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

    private void assertVideoReportFields(String encodedJson) {
        JSONObject encoded = JSON.parseObject(encodedJson);
        JSONArray ruleDetails = encoded.getJSONObject("Result").getJSONArray("RuleResultDetails");
        JSONObject machine = ruleDetails.getJSONObject(0).getJSONObject("MachineDetails");

        JSONObject text = machine.getJSONArray("AnalysisTexts").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(65), text.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(66), text.getLong("EndTime"));
        Assert.assertFalse(text.containsKey("AbsoluteStartTime"));
        Assert.assertFalse(text.containsKey("AbsoluteEndTime"));

        JSONObject image = machine.getJSONArray("AnalysisImages").getJSONObject(0);
        Assert.assertEquals(Long.valueOf(67), image.getLong("StartTime"));
        Assert.assertEquals(Long.valueOf(68), image.getLong("EndTime"));
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
                + "\"Description\":\"analysis text desc\""
                + "}],"
                + "\"AnalysisImages\":[{"
                + "\"MessageId\":6,"
                + "\"ImageURLs\":[\"https://example.com/analysis.png\"],"
                + "\"Type\":\"analysis-image-type\","
                + "\"StartTime\":67,"
                + "\"EndTime\":68,"
                + "\"AbsoluteStartTime\":1744016867,"
                + "\"AbsoluteEndTime\":1744016878,"
                + "\"Description\":\"analysis image desc\""
                + "}],"
                + "\"CustomSensitiveResults\":[{"
                + "\"MessageId\":1,"
                + "\"SensitiveWord\":\"word\","
                + "\"Text\":\"text\","
                + "\"StartTime\":60,"
                + "\"EndTime\":61,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016871"
                + "}],"
                + "\"SystemSensitiveResults\":[{"
                + "\"MessageId\":2,"
                + "\"Text\":\"text\","
                + "\"StartTime\":60,"
                + "\"EndTime\":62,"
                + "\"AbsoluteStartTime\":1744016860,"
                + "\"AbsoluteEndTime\":1744016872"
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
