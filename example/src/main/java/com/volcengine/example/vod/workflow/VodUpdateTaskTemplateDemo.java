// Code generated by protoc-gen-volcengine-sdk
// source: updateTaskTemplate
// DO NOT EDIT!

package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodUpdateTaskTemplateDemo {

    public static void main(String[] args) throws Exception {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodUpdateTaskTemplateRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodUpdateTaskTemplateRequest.newBuilder();
			reqBuilder.setTemplateId("your TemplateId");
			reqBuilder.setName("your Name");
			reqBuilder.setDescription("your Description");
			reqBuilder.setTaskType("your TaskType");
			com.volcengine.service.vod.model.business.TranscodeVideoTaskParams.Builder transcodeVideoTaskParamsBuilder = com.volcengine.service.vod.model.business.TranscodeVideoTaskParams.newBuilder();
			reqBuilder.setTranscodeVideoTaskParams(transcodeVideoTaskParamsBuilder);
			com.volcengine.service.vod.model.business.ByteHDTaskParams.Builder byteHDTaskParamsBuilder = com.volcengine.service.vod.model.business.ByteHDTaskParams.newBuilder();
			reqBuilder.setByteHDTaskParams(byteHDTaskParamsBuilder);
			com.volcengine.service.vod.model.business.TranscodeAudioTaskParams.Builder transcodeAudioTaskParamsBuilder = com.volcengine.service.vod.model.business.TranscodeAudioTaskParams.newBuilder();
			reqBuilder.setTranscodeAudioTaskParams(transcodeAudioTaskParamsBuilder);
			com.volcengine.service.vod.model.business.SnapshotTaskParams.Builder snapshotTaskParamsBuilder = com.volcengine.service.vod.model.business.SnapshotTaskParams.newBuilder();
			reqBuilder.setSnapshotTaskParams(snapshotTaskParamsBuilder);
			
            com.volcengine.service.vod.model.response.VodUpdateTaskTemplateResponse resp = vodService.updateTaskTemplate(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}