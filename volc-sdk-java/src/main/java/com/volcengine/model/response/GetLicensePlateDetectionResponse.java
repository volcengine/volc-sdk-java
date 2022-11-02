package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLicensePlateDetectionResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetLicensePlateDetectionResponseBean result;

    @Data
    static public class GetLicensePlateDetectionResponseBean {
        @JSONField(name = "Locations")
        private Location locations;
    }

    @Data
    static public class Location {
        @JSONField(name = "x1")
        private Integer x1;

        @JSONField(name = "x2")
        private Integer x2;

        @JSONField(name = "y1")
        private Integer y1;

        @JSONField(name = "y2")
        private Integer y2;
    }
}
