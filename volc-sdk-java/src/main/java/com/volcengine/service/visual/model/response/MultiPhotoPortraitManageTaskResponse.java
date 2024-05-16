package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MultiPhotoPortraitManageTaskResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    MultiPhotoPortraitManageTaskResponseData data;
    @Data
    public static class MultiPhotoPortraitManageTaskResponseData {
        @JSONField(name = "success")
        boolean success;
    }
}
