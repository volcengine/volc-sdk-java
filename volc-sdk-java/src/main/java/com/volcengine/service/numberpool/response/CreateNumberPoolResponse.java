package com.volcengine.service.numberpool.response;

import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.numberpool.model.CreateNumberPool;
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
