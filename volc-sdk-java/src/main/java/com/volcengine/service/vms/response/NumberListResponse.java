package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.NumberList;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class NumberListResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private NumberList result;
}
