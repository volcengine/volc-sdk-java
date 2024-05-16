package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class MultiPhotoPortraitDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        //提交【分身生成】任务
        MultiPhotoPortraitSubmitTaskCreateAIModelRequest request=new MultiPhotoPortraitSubmitTaskCreateAIModelRequest();
        request.setReqKey("multi_photo_portrait_submit_task_create_ai_model");
        ArrayList<String> imageUrls=new ArrayList<>();
        imageUrls.add("");
        request.setImageUrls(imageUrls);
        request.setPrimaryImageIdx(0);
        request.setGender("male");
        try {
            MultiPhotoPortraitSubmitTaskCreateAIModelResponse response = visualService.multiPhotoPortraitSubmitTaskCreateAIModel(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //提交【图片生成】任务
//        MultiPhotoPortraitSubmitTaskGenerateImageRequest request=new MultiPhotoPortraitSubmitTaskGenerateImageRequest();
//        request.setReqKey("multi_photo_portrait_submit_task_generate_image");
//        ArrayList<String> styles=new ArrayList<>();
//        styles.add("");
//        request.setModelId("");
//        request.setStyles(styles);
//        request.setGender("male");
//        try {
//            MultiPhotoPortraitSubmitTaskGenerateImageResponse response = visualService.multiPhotoPortraitSubmitTaskGenerateImage(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //查询任务
//        MultiPhotoPortraitGetTaskResultRequest request=new MultiPhotoPortraitGetTaskResultRequest();
//        request.setReqKey("multi_photo_portrait_get_task_result");
//        request.setTaskId("");
//        request.setTaskType(0);
//        try {
//            MultiPhotoPortraitGetTaskResultResponse response = visualService.multiPhotoPortraitGetTaskResult(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //管理任务
//        MultiPhotoPortraitManageTaskRequest request=new MultiPhotoPortraitManageTaskRequest();
//        request.setReqKey("multi_photo_portrait_manage_task");
//        request.setManageType("");
//        request.setTaskId("");
//        request.setTaskType(1);
//        request.setModelId("");
//        try {
//            MultiPhotoPortraitManageTaskResponse response = visualService.multiPhotoPortraitManageTask(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
