package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MultiPhotoPortraitSubmitTaskCreateAIModelRequest {
    
    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binary_data_base64;

    @JSONField(name = "image_urls")
    ArrayList<String> imageUrls;

    @JSONField(name = "primary_image_idx")
    Integer primaryImageIdx;

    @JSONField(name = "gender")
    String gender;

}