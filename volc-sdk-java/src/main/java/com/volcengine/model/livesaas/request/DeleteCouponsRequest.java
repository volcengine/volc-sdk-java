package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Coupon;
import lombok.Data;

import java.util.List;

@Data
public class DeleteCouponsRequest {
    @JSONField(name = "Ids")
    List<Long> Ids;
}