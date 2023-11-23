package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.TDPackOrder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UnsubscribeHostAcceleratePackOrderRequest {
    @JSONField(name = "TDOrders")
    List<TDPackOrder> TDOrders;
}