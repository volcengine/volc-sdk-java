package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ImageItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateImageTaskRequest {
    @JSONField(name = "TaskName")
    String taskName;
    @JSONField(name = "Images")
    List<ImageItem> images;
    @JSONField(name = "CallbackURL")
    String callbackURL;
    @JSONField(name = "Extra")
    String extra;
}