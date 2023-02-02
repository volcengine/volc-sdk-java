package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/12/12
 * @Description:
 */
@Data
public class InsertSubAccountRequest {
    @JSONField(name = "SubAccountName")
    private String subAccountName;

    @JSONField(name = "Desc")
    private String desc;
}
