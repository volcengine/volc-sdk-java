package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * AddBlackListResResult
 */
@lombok.Data
public final class AddBlackListResResult  {

    /**
     * <p>添加黑名单失败的用户信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<AddBlackListResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
