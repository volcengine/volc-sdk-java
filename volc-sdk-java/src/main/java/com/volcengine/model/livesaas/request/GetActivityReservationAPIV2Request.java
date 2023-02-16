package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetActivityReservationAPIV2Request {
    @JSONField(name = "TelReserve")
    String TelReserve;
    @JSONField(name = "PageSize")
    Long PageSize;
    @JSONField(name = "Page")
    Long Page;
    @JSONField(name = "Channel")
    String Channel;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}