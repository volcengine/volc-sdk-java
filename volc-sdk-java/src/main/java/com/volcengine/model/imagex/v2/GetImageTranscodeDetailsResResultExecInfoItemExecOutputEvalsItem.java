package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsResResultExecInfoItemExecOutputEvalsItem
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResultExecInfoItemExecOutputEvalsItem  {

    /**
     * <p>当前阶段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private String phase;

    /**
     * <p>请提供具体的参数名字（Index）和类型（string），以便我为您生成参数描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Index")
    private Integer index;

    /**
     * <p>参数名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>参数值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private GetImageTranscodeDetailsResResultExecInfoItemExecOutputEvalsItemValue value;

    /**
     * <p>实例规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>参数格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
