package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImagePSDetectionResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImagePSDetectionResponseBean result;

    @Data
    static public class GetImagePSDetectionResponseBean {
        @JSONField(name = "ElaImage")
        private List<Byte> elaImage;

        @JSONField(name = "NaImage")
        private List<Byte> naImage;

        @JSONField(name = "HeImage")
        private List<Byte> heImage;

        @JSONField(name = "Score")
        private Double score;

        @JSONField(name = "Label")
        private Integer label;
    }
}
