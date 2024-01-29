package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryDimsRes
 */
@lombok.Data
public final class GetImageXQueryDimsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageXQueryDimsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageXQueryDimsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
