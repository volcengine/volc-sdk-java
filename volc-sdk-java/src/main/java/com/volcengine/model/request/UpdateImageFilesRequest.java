package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateImageFilesRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "Action")
    Integer action;
    @JSONField(name = "ImageUrls")
    List<String> imageUrls;
}
