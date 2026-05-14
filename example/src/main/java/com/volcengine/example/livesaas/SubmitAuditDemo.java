package com.volcengine.example.livesaas;

import com.volcengine.model.livesaas.request.SubmitAuditRequest;
import com.volcengine.model.livesaas.response.SubmitAuditResponse;
import com.volcengine.service.livesaas.LivesaasService;
import com.volcengine.service.livesaas.impl.LivesaasServiceImpl;

public class SubmitAuditDemo {

    public static void main(String[] args) {
        LivesaasService livesaasService = LivesaasServiceImpl.getInstance();
        livesaasService.setAccessKey("your-ak");
        livesaasService.setSecretKey("your-sk");

        SubmitAuditRequest request = new SubmitAuditRequest();
        request.setProjectName("your-project");
        request.setTaskId(12345L);
        request.setAuditSource("LIVE");
        // request.setAuditStatus("APPROVED");
        request.setAuditComment("直播内容合规，通过审核");
        request.setOperationType("WARNING");
        request.setMarkTime(5000L);

        try {
            SubmitAuditResponse response = livesaasService.submitAudit(request);
            System.out.println("AuditId: " + response.getResult().getAuditId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
