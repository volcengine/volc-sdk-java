package com.volcengine.example.imp.job;

import com.volcengine.service.imp.IImpService;
import com.volcengine.service.imp.impl.ImpServiceImpl;
import com.volcengine.service.imp.model.request.*;
import com.volcengine.service.imp.model.business.*;
import com.volcengine.service.imp.model.response.*;

public class ImpRetrieveJobDemo {

    public static void main(String[] args) throws Exception {
        IImpService impService = ImpServiceImpl.getInstance();

        // call below method if you don't set ak and sk
        impService.setAccessKey("your ak");
        impService.setSecretKey("your sk");

        try {
            ImpRetrieveJobRequest.Builder retrieveJobRequest = ImpRetrieveJobRequest.newBuilder();
            retrieveJobRequest.addJobIds("your job id 1");
            retrieveJobRequest.addJobIds("your job id 2");

            ImpRetrieveJobResponse resp = impService.RetrieveJob(retrieveJobRequest.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}