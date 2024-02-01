package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageOCRV2ResResultExtra
 */
@lombok.Data
public final class GetImageOCRV2ResResultExtra  {

    /**
     * <p>算子服务处理状态，0: 成功 -1: 图片载入失败 -2: 图片检测失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>状态对应信息， 0: 成功 -1: 图片载入失败 -2: 图片检测失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>算子服务返回的json序列化结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private String info;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
