package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageOCRV2BodyExtra
 */
@lombok.Data
public final class GetImageOCRV2BodyExtra  {

    /**
     * <p>默认为False，不开启Extra</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>算子名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MMServiceName")
    private String mMServiceName;

    /**
     * <p>算子版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MMServiceVersion")
    private String mMServiceVersion;

    /**
     * <p>算子的输入参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MMServiceInput")
    private String mMServiceInput;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
