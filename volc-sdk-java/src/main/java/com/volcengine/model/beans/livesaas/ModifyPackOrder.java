package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ModifyPackOrder {
    @JSONField(name = "OrderId")
    String OrderId;
    @JSONField(name = "OldUid")
    String OldUid;
    @JSONField(name = "NewUid")
    String NewUid;
    @JSONField(name = "NewDouyinId")
    String NewDouyinId;
    @JSONField(name = "NewNickname")
    Boolean NewNickname;
    @JSONField(name = "ExecuteTime")
    String ExecuteTime;
}