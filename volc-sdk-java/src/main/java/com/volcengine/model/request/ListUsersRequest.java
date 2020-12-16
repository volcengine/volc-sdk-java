package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListUsersRequest {
    @JSONField(name = "Limit")
    int limit;
    @JSONField(name = "Offset")
    int offset;

    public int getLimit() {
        if (this.limit == 0) {
            return 10;
        } else {
            return limit;
        }
    }


}
