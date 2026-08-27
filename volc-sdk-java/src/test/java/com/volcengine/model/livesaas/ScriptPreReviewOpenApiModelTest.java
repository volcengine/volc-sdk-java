package com.volcengine.model.livesaas;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.livesaas.request.CreateScriptPreReviewRequest;
import com.volcengine.model.livesaas.response.CreateScriptPreReviewResponse;
import com.volcengine.model.livesaas.response.DownloadScriptPreReviewReportResponse;
import com.volcengine.service.livesaas.LivesaasConfig;
import org.apache.http.NameValuePair;
import org.junit.Assert;
import org.junit.Test;

public class ScriptPreReviewOpenApiModelTest {

    @Test
    public void createScriptPreReviewRequestPreservesBodyFields() {
        CreateScriptPreReviewRequest request = JSON.parseObject("{"
                + "\"ProjectName\":\"project-1\","
                + "\"TaskName\":\"script pre-review\","
                + "\"ScenarioId\":1001,"
                + "\"Content\":\"script content\","
                + "\"CallbackURL\":\"https://callback.example.com/status\","
                + "\"Extra\":\"{\\\"source\\\":\\\"console\\\"}\","
                + "\"TagIds\":[7,8]"
                + "}", CreateScriptPreReviewRequest.class);

        JSONObject encoded = JSON.parseObject(JSON.toJSONString(request));
        Assert.assertEquals("project-1", encoded.getString("ProjectName"));
        Assert.assertEquals(Long.valueOf(1001), encoded.getLong("ScenarioId"));
        Assert.assertEquals("script content", encoded.getString("Content"));
        Assert.assertEquals(2, encoded.getJSONArray("TagIds").size());
    }

    @Test
    public void scriptPreReviewResponsesPreserveResultFields() {
        CreateScriptPreReviewResponse createResponse = JSON.parseObject("{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req-create\"},"
                + "\"Result\":{\"TaskId\":1001}"
                + "}", CreateScriptPreReviewResponse.class);
        Assert.assertEquals(Long.valueOf(1001), createResponse.getResult().getTaskId());

        DownloadScriptPreReviewReportResponse downloadResponse = JSON.parseObject("{"
                + "\"ResponseMetadata\":{\"RequestId\":\"req-download\"},"
                + "\"Result\":{\"DownloadURL\":\"https://example.com/report.xlsx\",\"ExpireTime\":1785480600}"
                + "}", DownloadScriptPreReviewReportResponse.class);
        Assert.assertEquals("https://example.com/report.xlsx", downloadResponse.getResult().getDownloadURL());
        Assert.assertEquals(Long.valueOf(1785480600), downloadResponse.getResult().getExpireTime());
    }

    @Test
    public void scriptPreReviewActionsUseExpectedConfig() {
        assertApiConfig(Const.CreateScriptPreReview, "POST");
        assertApiConfig(Const.DownloadScriptPreReviewReport, "GET");
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
}
