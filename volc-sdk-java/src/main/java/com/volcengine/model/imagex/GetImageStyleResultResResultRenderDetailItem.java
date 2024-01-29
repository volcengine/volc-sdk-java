package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleResultResResultRenderDetailItem
 */
@lombok.Data
public final class GetImageStyleResultResResultRenderDetailItem  {

    /**
     * <p>渲染失败的要素 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Element")
    private String element;

    /**
     * <p>渲染失败的原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
