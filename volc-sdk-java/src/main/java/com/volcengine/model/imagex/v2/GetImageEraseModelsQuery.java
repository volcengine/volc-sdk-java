package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEraseModelsQuery
 */
@lombok.Data
public final class GetImageEraseModelsQuery  {

    /**
     * <p>模型。默认取值为`0`。</p>
     *
     * <p>* 0：自动检测并擦除模型列表。</p>
     *
     * <p>* 1：指定区域擦除模型列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
