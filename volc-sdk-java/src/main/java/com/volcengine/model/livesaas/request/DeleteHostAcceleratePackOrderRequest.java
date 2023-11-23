package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.DeletePackOrder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DeleteHostAcceleratePackOrderRequest {
    @JSONField(name = "DeleteOrders")
    List<DeletePackOrder> DeleteOrders;
}