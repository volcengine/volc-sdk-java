package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.helper.VodUploadMediaProcessListener;
import com.volcengine.helper.VodUploadProgressListener;
import com.volcengine.model.beans.Functions;
import com.volcengine.model.beans.FunctionsWorkflowTemplate;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.VodUploadTemplate;
import com.volcengine.service.vod.model.request.VodUploadMediaRequest;
import com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class VodUploadMediaDemo {

    public static void main(String[] args) {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

        String space = "your space name";
        String filePath = "your file path";

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
        functionsList.add(snapShotFunc);

        Functions addOptionInfo = Functions.AddOptionInfoFunction("hls测试视频", "test", "素材测试，视频文件", 0, true);
        functionsList.add(addOptionInfo);


        List<String> impTemplateIds = new ArrayList<>();
        impTemplateIds.add("imp template id");
        FunctionsWorkflowTemplate impTemplate = new FunctionsWorkflowTemplate(impTemplateIds, "imp");

        List<String> transcodeTemplateIds = new ArrayList<>();
        transcodeTemplateIds.add("transcode template id");
        FunctionsWorkflowTemplate transcodeTemplate = new FunctionsWorkflowTemplate(transcodeTemplateIds,
                "transcode");

        List<FunctionsWorkflowTemplate> templates = new ArrayList<>();
        templates.add(impTemplate);
        templates.add(transcodeTemplate);
        Functions workflowFunc = Functions.StartWorkFlowFunction(templates);
        functionsList.add(workflowFunc);

        VodUploadMediaRequest vodUploadMediaRequest = VodUploadMediaRequest.newBuilder()
                .setSpaceName(space)
                .setFilePath(filePath)
                .setFileName("hello/vod/video.mp4")
                .setFunctions(JSON.toJSONString(functionsList))
                .setStorageClass(0)
                .build();
        // 需要进度条功能时添加相应 listener，如无需求，传 null 值即可
        VodUploadProgressListener listener = new VodUploadMediaProcessListener();

        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadMedia(vodUploadMediaRequest, listener);
            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodCommitUploadInfoResponse.toString());
            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getVid());
            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
