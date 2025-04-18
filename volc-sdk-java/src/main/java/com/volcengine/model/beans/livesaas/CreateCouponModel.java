package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateCouponModel {
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Description")
    String Description;
    @JSONField(name = "ThirdPartyId")
    String ThirdPartyId;
    @JSONField(name = "Pic")
    String Pic;
    @JSONField(name = "OwnerSubAccountName")
    String OwnerSubAccountName;
}
