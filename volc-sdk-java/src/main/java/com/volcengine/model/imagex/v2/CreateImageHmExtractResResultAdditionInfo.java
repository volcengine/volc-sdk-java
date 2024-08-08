package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmExtractResResultAdditionInfo
 */
@lombok.Data
public final class CreateImageHmExtractResResultAdditionInfo  {

    /**
     * <p>水印类型，返回值固定为 `date`，表示日期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HmType")
    private String hmType;

    /**
     * <p>生成周期所对应的起始与结束时间段，固定为 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HmDateInfo")
    private CreateImageHmExtractResResultAdditionInfoHmDateInfo hmDateInfo;

    /**
     * <p>所提取的水印背景图层的生成周期，从 0 开始，表示处于生成的第一周内。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HmCode")
    private Integer hmCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
