package com.volcengine.example.contentSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ImageRiskResultRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.response.AsyncRiskDetectionResponse;
import com.volcengine.model.response.ImageRiskDetectionResponse;
import com.volcengine.model.response.TextRiskResponse;
import com.volcengine.model.response.VideoRiskResultResponse;
import com.volcengine.service.contentSecurity.ContentSecurityService;
import com.volcengine.service.contentSecurity.impl.ContentSecurityServiceImpl;

public class ContentSecurityDemo {
    public static void main(String[] args) {
        ContentSecurityService contentSecurityService = ContentSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        contentSecurityService.setAccessKey("AK");
        contentSecurityService.setSecretKey("SK");
        // async video risk detection
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(3332);
            riskDetectionRequest.setService("video_risk");
            riskDetectionRequest.setParameters("{\"operate_time\": 1617960951, \"ip\": \"127.0.0.9\", \"did\":1357924680, \"url\": \"\", \"data_id\": \"123\", \"account_id\": \"2000000409\"}");

            AsyncRiskDetectionResponse riskDetectionResponse = contentSecurityService.AsyncVideoRisk(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // video risk result
        try {
            ImageRiskResultRequest request = new ImageRiskResultRequest();
            request.setAppId(3332);
            request.setService("video_risk");
            request.setDataId("123");

            VideoRiskResultResponse riskResultResponse = contentSecurityService.VideoResult(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // async image risk detection
        try {
            RiskDetectionRequest request = new RiskDetectionRequest();
            request.setAppId(3332);
            request.setService("image_content_risk");
            request.setParameters("{\"operate_time\": 1617960951, \"ip\": \"127.0.0.9\", \"did\":1357924680, \"url\": \"\", \"data_id\": \"image123\", \"account_id\": \"2000000409\"}");

            AsyncRiskDetectionResponse riskResultResponse = contentSecurityService.AsyncImageRisk(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // image risk result
        try {
            ImageRiskResultRequest request = new ImageRiskResultRequest();
            request.setAppId(3332);
            request.setService("image_content_risk");
            request.setDataId("image123");

            ImageRiskDetectionResponse riskResultResponse = contentSecurityService.ImageRiskResult(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // image risk detection
        try {
            RiskDetectionRequest request = new RiskDetectionRequest();
            request.setAppId(3332);
            request.setService("image_content_risk");
            request.setParameters("{\"operate_time\": 1617960951, \"ip\": \"127.0.0.9\", \"did\":1357924680, \"url\": \"\", \"data_id\": \"image_123\", \"account_id\": \"2000000409\"}");

            ImageRiskDetectionResponse riskResultResponse = contentSecurityService.ImageRiskDetection(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // text risk detection
        try {
            RiskDetectionRequest request = new RiskDetectionRequest();
            request.setAppId(3332);
            request.setService("text_risk");
            request.setParameters("{\"operate_time\": 1617960951, \"text\": \"加我微信WX，看涩黄片\"}");

            TextRiskResponse riskResultResponse = contentSecurityService.TextRisk(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // async video live risk detection
        try {
            RiskDetectionRequest request = new RiskDetectionRequest();
            request.setAppId(3332);
            request.setService("video_live_risk");
            request.setParameters("{}");

            AsyncRiskDetectionResponse riskResultResponse = contentSecurityService.AsyncLiveVideoRisk(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // video live result
        try {
            ImageRiskResultRequest request = new ImageRiskResultRequest();
            request.setAppId(3332);
            request.setService("video_live_risk");
            request.setDataId("image123");

            VideoRiskResultResponse riskResultResponse = contentSecurityService.VideoLiveResult(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // async audio live risk detection
        try {
            RiskDetectionRequest request = new RiskDetectionRequest();
            request.setAppId(3332);
            request.setService("audio_live_risk");
            request.setParameters("{}");

            AsyncRiskDetectionResponse riskResultResponse = contentSecurityService.AsyncLiveAudioRisk(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // audio live result
        try {
            ImageRiskResultRequest request = new ImageRiskResultRequest();
            request.setAppId(3332);
            request.setService("audio_live_risk");
            request.setDataId("image123");

            GetAudioRiskResponse riskResultResponse = contentSecurityService.AudioLiveResult(request);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
