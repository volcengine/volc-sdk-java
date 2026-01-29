package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.jws.HandlerChain;
import java.util.List;

/**
 * @author changke.233
 * @Date 2025/1/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryRiskDenyInfoRequest {
    @JSONField(name = "Mobile")
    private String mobile;

    @JSONField(name = "AccountRequestId")
    private String accountRequestId;

    @JSONField(name = "EncryptType")
    private Integer encryptType;
}
