package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetActivityReservationRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "TelReserve")
    String TelReserve;
    @JSONField(name = "PageSize")
    Long PageSize;
    @JSONField(name = "Page")
    Long Page;
    @JSONField(name = "Source")
    Integer Source;
}