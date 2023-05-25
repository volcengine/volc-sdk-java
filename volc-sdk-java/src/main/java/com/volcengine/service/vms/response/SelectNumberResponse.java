package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
public class SelectNumberResponse {
    private ResponseMetadata responseMetadata;

    private List<String> result;
}
