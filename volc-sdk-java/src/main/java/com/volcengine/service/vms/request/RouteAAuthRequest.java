package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteAAuthRequest {
    /**
     * 请求唯一id
     */
    private String requestId;

    /**
     * 证件类型
     */
    private Integer idType;


    /**
     * 姓名 AES加密
     */
    private String name;

    /**
     * 号码，AES加密
     */
    private String phoneNumber;

    /**
     * 证件号，AES加密
     */
    private String idNumber;

    /**
     * 现场照片，文件二进制Base64编码后，AES加密
     */
    private String photo;
}
