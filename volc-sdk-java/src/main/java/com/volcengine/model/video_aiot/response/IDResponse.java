package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class IDResponse {
    //
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ID id;

    @Data
    public static class ID {
        @JSONField(name = "ID")
        String id;
    }


}
