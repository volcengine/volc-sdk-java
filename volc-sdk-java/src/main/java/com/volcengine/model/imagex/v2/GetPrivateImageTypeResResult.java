package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetPrivateImageTypeResResult
 */
@lombok.Data
public final class GetPrivateImageTypeResResult  {

    /**
     * <p>请求参数`Method`中包含`face`则返回该参数，取值如下所示：</p>
     *
     * <p>- 1： 包含人脸</p>
     *
     * <p>- 0： 不包含人脸</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Face")
    private Integer face;

    /**
     * <p>请求参数`Method`中包含`cloth`则返回该参数，取值如下所示：</p>
     *
     * <p>- 1： 包含衣物</p>
     *
     * <p>- 0： 不包含衣物</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cloth")
    private Integer cloth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
