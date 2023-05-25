package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.NumberStatus;
import lombok.Data;

import java.util.List;

@Data
public class RiskControlResponse {

    private ResponseMetadata responseMetadata;

    private List<NumberStatus> result;
}
