package com.volcengine.service.numberpool.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
public class UpdateNumberPoolResponse {
    private ResponseMetadata responseMetadata;

    private Boolean result;
}
