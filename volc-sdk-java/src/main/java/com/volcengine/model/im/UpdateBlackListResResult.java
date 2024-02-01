package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UpdateBlackListResResult
 */
@lombok.Data
public final class UpdateBlackListResResult  {

    /**
     * <p>更新失败的黑名单用户信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<UpdateBlackListResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
