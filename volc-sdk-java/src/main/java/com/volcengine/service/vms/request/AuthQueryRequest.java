package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthQueryRequest {

    /**
     * 手机号
     * AES加密
     */
    private String phone;
}
