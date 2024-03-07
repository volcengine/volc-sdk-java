package com.volcengine.model.maas.api.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateOrRefreshAPIKeyReq {
    @JSONField(name = "Ttl")
    Integer Ttl;
    @JSONField(name = "EndpointIdList")
    List<String> EndpointIdList;
}
