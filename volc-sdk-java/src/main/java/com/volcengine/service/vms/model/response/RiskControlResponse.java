package com.volcengine.service.vms.model.response;

import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.business.NumberStatus;
import lombok.Data;

import java.util.List;

@Data
public class RiskControlResponse {

    private ResponseMetadata responseMetadata;

    private List<NumberStatus> result;
}
