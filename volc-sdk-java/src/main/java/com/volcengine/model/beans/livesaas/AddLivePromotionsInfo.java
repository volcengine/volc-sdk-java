package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddLivePromotionsInfo  {
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "PushUrl")
    java.lang.String PushUrl;
}