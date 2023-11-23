package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CreatePackOrder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CreateHostAcceleratePackOrderRequest {
    @JSONField(name = "CreateOrders")
    List<CreatePackOrder> CreateOrders;
}