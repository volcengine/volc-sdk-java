package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BindPortMappingRuleResResult
 */
@lombok.Data
public final class BindPortMappingRuleResResult  {

    /**
     * <p>设置成功实例 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessPodIdList")
    private List<String> successPodIdList;

    /**
     * <p>设置失败实例信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorPodInfoList")
    private List<com.volcengine.model.acep.v20231030.ResultErrorInfo> errorPodInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
