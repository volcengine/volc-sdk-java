package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageOCRV2ResResultExtraOutput
 */
@lombok.Data
public final class GetImageOCRV2ResResultExtraOutput  {

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
     * <p>算子服务返回的结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private Map<String, Object> info;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
