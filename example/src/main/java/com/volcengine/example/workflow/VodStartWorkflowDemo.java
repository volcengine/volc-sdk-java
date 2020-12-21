package com.volcengine.example.workflow;

import com.volcengine.model.vod.business.WorkflowParams;
import com.volcengine.model.vod.request.VodStartWorkflowRequest;
import com.volcengine.model.vod.response.VodStartWorkflowResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class VodStartWorkflowDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        WorkflowParams inputParams = WorkflowParams.newBuilder().build();

        VodStartWorkflowRequest vodStartWorkflowRequest = VodStartWorkflowRequest.newBuilder()
                .setVid("your vid")
                .setInput(inputParams)
                .setTemplateId("your template_id")
                .setPriority(0)
                .setCallbackArgs("your callback_args")
                .build();

        try {
            VodStartWorkflowResponse vodStartWorkflowResponse = vodService.StartWorkflow(vodStartWorkflowRequest);
            if (vodStartWorkflowResponse.getResponseMetadata().hasError()) {
                System.out.println(vodStartWorkflowResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodStartWorkflowResponse.toString());
            System.out.println(vodStartWorkflowResponse.getResult().getRunId());
            System.out.println(vodStartWorkflowResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
