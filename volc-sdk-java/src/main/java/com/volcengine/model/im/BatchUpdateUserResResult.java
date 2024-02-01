package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchUpdateUserResResult
 */
@lombok.Data
public final class BatchUpdateUserResResult {

    /**
     * <p>更新失败的用户信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<BatchUpdateUserResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
