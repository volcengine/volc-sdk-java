package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAIDetailsResResultExecInfoItemExecInput
 */
@lombok.Data
public final class GetImageAIDetailsResResultExecInfoItemExecInput  {

    /**
     * <p>图片 URL 或 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectKey")
    private String objectKey;

    /**
     * <p>数据类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `uri`：指定 ServiceId 下存储 URI。</p>
     *
     * <p>- `url`：公网可访问的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataType")
    private String dataType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
