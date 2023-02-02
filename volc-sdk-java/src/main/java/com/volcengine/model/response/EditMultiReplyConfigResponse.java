package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/12/12
 * @Description:
 */
@Data
public class EditMultiReplyConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    String result;
}
