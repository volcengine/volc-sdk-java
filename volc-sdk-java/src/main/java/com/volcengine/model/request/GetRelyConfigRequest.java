package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2023/01/04
 * @Description:
 */
@Data
public class GetRelyConfigRequest {

    @JSONField(name = "SubAccount")
    private String subAccount;
}
