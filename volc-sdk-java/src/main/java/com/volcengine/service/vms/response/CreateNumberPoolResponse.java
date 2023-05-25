package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.CreateNumberPool;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
public class CreateNumberPoolResponse {
    private ResponseMetadata responseMetadata;

    private CreateNumberPool result;
}
