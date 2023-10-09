package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class ModifyActivityMenusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ModifyActivityMenusResponseBody result;

    @Data
    public static class ModifyActivityMenusResponseBody {
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