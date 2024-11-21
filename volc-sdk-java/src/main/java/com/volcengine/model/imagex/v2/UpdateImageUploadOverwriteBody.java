package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageUploadOverwriteBody
 */
@lombok.Data
public final class UpdateImageUploadOverwriteBody  {

    /**
     * <p>是否开启重名覆盖上传，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadOverwrite")
    private Boolean uploadOverwrite;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
