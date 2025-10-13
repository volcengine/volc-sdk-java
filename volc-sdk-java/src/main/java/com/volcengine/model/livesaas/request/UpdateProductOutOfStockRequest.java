package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateProductOutOfStockRequest {
    @JSONField(name = "ActivityId")
    private Long activityId;
    
    @JSONField(name = "ProductIds")
    private List<Long> productIds;
    
    @JSONField(name = "OutOfStock")
    private Integer outOfStock;
}