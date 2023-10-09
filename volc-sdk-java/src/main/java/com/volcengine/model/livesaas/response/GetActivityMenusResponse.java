package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetActivityMenusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityMenusResponseBody result;

    @Data
    public static class GetActivityMenusResponseBody {
        @JSONField(name = "Menus")
        List<MenuMsgNew> Menus;
    }

    @Data
    public static class MenuMsgNew {
        @JSONField(name = "ToolId")
        Long ToolId;
        @JSONField(name = "Location")
        Integer Location;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "Type")
        Integer Type;
    }
}