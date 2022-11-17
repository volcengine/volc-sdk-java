package com.volcengine.service.imp.impl;

import com.volcengine.service.imp.IImpService;
import com.volcengine.service.imp.model.business.InputPath;
import com.volcengine.service.imp.model.request.ImpKillJobRequest;
import com.volcengine.service.imp.model.request.ImpRetrieveJobRequest;
import com.volcengine.service.imp.model.request.ImpSubmitJobRequest;
import com.volcengine.service.imp.model.response.ImpKillJobResponse;
import com.volcengine.service.imp.model.response.ImpRetrieveJobResponse;
import com.volcengine.service.imp.model.response.ImpSubmitJobResponse;
import junit.framework.TestCase;
import org.junit.Test;

public class ImpServiceImplTest extends TestCase {

    @Test
    public void testSubmitJob() {
        IImpService impService = ImpServiceImpl.getInstance();

        // call below method if you don't set ak and sk
        impService.setAccessKey("your ak");
        impService.setSecretKey("your sk");

        try {
            InputPath.Builder input = InputPath.newBuilder();
            input.setType("VOD");
            input.setVodSpaceName("your space name");
            input.setFileId("your file id");

            ImpSubmitJobRequest.Builder submitJobRequest = ImpSubmitJobRequest.newBuilder();
            submitJobRequest.setInputPath(input.build());
            submitJobRequest.setTemplateId("your template id");
            submitJobRequest.setCallbackArgs("your call back args");
            submitJobRequest.setEnableLowPriority("false");

            ImpSubmitJobResponse resp =  impService.SubmitJob(submitJobRequest.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRetrieveJob() {
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

    @Test
    public void testKillJob() {
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