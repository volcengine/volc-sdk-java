package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UpdateProductResourceBody
 */
@lombok.Data
public final class UpdateProductResourceBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>修改后，需订购的存储资源总容量，单位 GB。修改后的存储容量不能小于已使用的存储容量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyDataSize")
    private Integer applyDataSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
