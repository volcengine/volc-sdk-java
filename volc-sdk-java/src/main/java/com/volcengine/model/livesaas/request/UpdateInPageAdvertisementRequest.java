package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.InPageAdvertisement;
import lombok.Data;

import java.util.List;

@Data
public class UpdateInPageAdvertisementRequest {
    @JSONField(name = "ActivityId")
    private Long ActivityId;
    @JSONField(name = "IsEnable")
    private Integer IsEnable;
    @JSONField(name = "EnableFloating")
    private Boolean EnableFloating;
    @JSONField(name = "Advertisements")
    private List<InPageAdvertisement> Advertisements;
}
