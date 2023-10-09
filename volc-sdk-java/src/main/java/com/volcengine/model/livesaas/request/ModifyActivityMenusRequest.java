package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.MenuMsgNew;
import lombok.Data;

import java.util.List;

@Data
public class ModifyActivityMenusRequest {
    @JSONField(name = "Menus")
    List<MenuMsgNew> Menus;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}