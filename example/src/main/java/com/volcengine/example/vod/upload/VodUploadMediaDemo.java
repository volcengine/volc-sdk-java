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
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

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
