package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.UpdatePackOrder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateHostAcceleratePackOrderRequest {
    @JSONField(name = "UpdateOrders")
    List<UpdatePackOrder> UpdateOrders;
}