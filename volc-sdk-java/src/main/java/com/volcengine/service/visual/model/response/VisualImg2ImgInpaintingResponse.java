package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualImg2ImgInpaintingResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    Img2ImgInpaintingResponseData data;
    @Data
    public static class Img2ImgInpaintingResponseData {

        @JSONField(name = "binary_data_base64")
        ArrayList<String> binaryDataBase64;
    }
}
