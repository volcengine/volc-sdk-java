package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageFileKeyBody
 */
@lombok.Data
public final class UpdateImageFileKeyBody  {

    /**
     * <p>源文件名，即上传文件的存储 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriKey")
    private String oriKey;

    /**
     * <p>重命名后的文件名，存储 Key 详细命名规范请参看 [veImageX 存储 Key 通用字符规则](https://www.volcengine.com/docs/508/1458331)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstKey")
    private String dstKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
