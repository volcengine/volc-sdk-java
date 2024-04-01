package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2024/03/26
 * @Description:
 */
@Data
public class AddQualificationResponse {

    private ResponseMetadata responseMetadata;

    private AddQualificationResult result;

    @Data
    public static class AddQualificationResult {
        /**
         * 资质编码
         */
        private String qualificationNo;
    }
}
