package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDenoisingImageResResult
 */
@lombok.Data
public final class GetDenoisingImageResResult  {

    /**
     * <p>降噪后的图片地址，根据输入时的地址决定返回值。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    /**
     * <p>是否发生降级，取值如下所示：</p>
     *
     *
     *
     * <p>- true：降级</p>
     *
     * <p>- false：未降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Demotion")
    private Boolean demotion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
