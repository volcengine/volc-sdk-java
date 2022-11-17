package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.MenuMsgAPI;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityMenuAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Menus")
    List<MenuMsgAPI> Menus;
}
