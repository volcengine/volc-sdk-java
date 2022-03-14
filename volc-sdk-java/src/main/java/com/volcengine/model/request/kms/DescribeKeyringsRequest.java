package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeKeyringsRequest {
    @JSONField(name = "CurrentPage")
    int currentPage;
    @JSONField(name = "PageSize")
    int pageSize;
}
