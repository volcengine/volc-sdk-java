package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2024/03/26
 * @Description:
 */
@Data
public class UpdateQualificationResponse {

    private ResponseMetadata responseMetadata;

    private String result;
}
