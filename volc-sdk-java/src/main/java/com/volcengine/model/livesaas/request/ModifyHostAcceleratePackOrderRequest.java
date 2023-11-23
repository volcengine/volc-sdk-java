package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ModifyPackOrder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ModifyHostAcceleratePackOrderRequest {
    @JSONField(name = "ModifyOrders")
    List<ModifyPackOrder> ModifyOrders;
}