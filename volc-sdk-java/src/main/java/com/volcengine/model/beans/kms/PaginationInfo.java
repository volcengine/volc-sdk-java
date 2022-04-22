package com.volcengine.model.beans.kms;

import com.alibaba.fastjson.annotation.JSONField;

public class PaginationInfo {
    @JSONField(name = "TotalCount")
    int totalCount;
    @JSONField(name = "PageSize")
    int pageSize;
    @JSONField(name = "CurrentPage")
    int currentPage;
    @JSONField(name = "Count")
    int count;
}
