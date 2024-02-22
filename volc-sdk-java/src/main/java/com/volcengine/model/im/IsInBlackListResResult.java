package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * IsInBlackListResResult
 */
@lombok.Data
public final class IsInBlackListResResult  {

    /**
     * <p>校验结果。key 为 uid，value 为 true：在黑名单中。 value 为 false：不在黑名单中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsInBlackListInfos")
    private Map<String, Boolean> isInBlackListInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
