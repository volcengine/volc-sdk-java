package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


import java.util.List;
import java.util.Map;

@Data
public class GetActivityMenuAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<MenuMsgAPI> result;

    @Data
    public static class MenuMsgAPI {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "Type")
        Integer Type;
        @JSONField(name = "Location")
        Integer Location;
    }
}