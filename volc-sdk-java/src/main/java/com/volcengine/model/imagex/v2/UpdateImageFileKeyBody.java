package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageFileKeyBody
 */
@lombok.Data
public final class UpdateImageFileKeyBody  {

    /**
     * <p>源文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriKey")
    private String oriKey;

    /**
     * <p>重命名后的文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstKey")
    private String dstKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
