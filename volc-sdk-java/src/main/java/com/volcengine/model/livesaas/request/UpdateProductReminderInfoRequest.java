package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdateProductReminderInfoRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ProductId")
    Long ProductId;
    @JSONField(name = "ReminderType")
    Integer ReminderType;
    @JSONField(name = "HotSale")
    String HotSale;
    @JSONField(name = "Stock")
    String Stock;
}
