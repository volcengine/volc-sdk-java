package com.volcengine.example.imp.job;

import com.volcengine.service.imp.IImpService;
import com.volcengine.service.imp.impl.ImpServiceImpl;
import com.volcengine.service.imp.model.request.*;
import com.volcengine.service.imp.model.response.*;


public class ImpKillJobDemo {

    public static void main(String[] args) throws Exception {
        IImpService impService = ImpServiceImpl.getInstance();

        // call below method if you don't set ak and sk
        impService.setAccessKey("your ak");
        impService.setSecretKey("your sk");

        try {
            ImpKillJobRequest.Builder killJobRequest = ImpKillJobRequest.newBuilder();
            killJobRequest.setJobId("your job id");

            ImpKillJobResponse resp = impService.KillJob(killJobRequest.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}