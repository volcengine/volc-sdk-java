package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreatePackOrder {
    @JSONField(name = "Uid")
    String Uid;
    @JSONField(name = "DouyinId")
    String DouyinId;
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "EndMonthTime")
    String EndMonthTime;
    @JSONField(name = "IsRenew")
    Boolean IsRenew;
    @JSONField(name = "Province")
    String Province;
    @JSONField(name = "Source")
    String Source;
}