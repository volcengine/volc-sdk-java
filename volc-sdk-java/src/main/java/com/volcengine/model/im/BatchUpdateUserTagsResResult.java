package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchUpdateUserTagsResResult
 */
@lombok.Data
public final class BatchUpdateUserTagsResResult  {

    /**
     * <p>更新失败的用户信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<BatchUpdateUserTagsResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
