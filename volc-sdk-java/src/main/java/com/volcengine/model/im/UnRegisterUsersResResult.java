package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UnRegisterUsersResResult
 */
@lombok.Data
public final class UnRegisterUsersResResult  {

    /**
     * <p>注销失败的用户信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<UnRegisterUsersResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
