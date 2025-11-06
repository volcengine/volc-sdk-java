package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.CreateAXGGroupData;
import lombok.Data;

@Data
public class CreateAXGGroupResponse {
    private ResponseMetadata responseMetadata;
    private CreateAXGGroupData result;
}
