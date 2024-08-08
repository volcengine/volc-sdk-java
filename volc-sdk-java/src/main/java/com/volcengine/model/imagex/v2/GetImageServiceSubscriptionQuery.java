package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceSubscriptionQuery
 */
@lombok.Data
public final class GetImageServiceSubscriptionQuery  {

    /**
     * <p>附加组件类型，取值AI获取服务端智能处理开通情况。默认返回ImageX服务开通情况</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddOnType")
    private String addOnType;

    /**
     * <p>附加组件ID，获取指定附加组件的开通情况。默认返回ImageX服务开通情况</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddOnId")
    private String addOnId;

    /**
     * <p>附加组件英文标识，获取指定附加组件的开通情况。默认返回ImageX服务开通情况。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddOnKey")
    private String addOnKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
