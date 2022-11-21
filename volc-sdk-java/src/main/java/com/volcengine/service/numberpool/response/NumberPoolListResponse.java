package com.volcengine.service.numberpool.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.numberpool.model.NumberPoolList;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class NumberPoolListResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private NumberPoolList result;
}
