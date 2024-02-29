package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetAdvertisementDataDetailAPIRequest extends PageRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Channel")
    String Channel;
    @JSONField(name = "PageAdvertiseTypes")
    String PageAdvertiseTypes;
    @JSONField(name = "PageToken")
    String PageToken;
    @JSONField(name = "SortField")
    String SortField;
    @JSONField(name = "SortMode")
    String SortMode;
}
