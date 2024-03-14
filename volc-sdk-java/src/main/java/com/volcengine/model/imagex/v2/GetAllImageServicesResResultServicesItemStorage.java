package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageServicesResResultServicesItemStorage
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItemStorage  {

    /**
     * <p>存储 Bucket 名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BktName")
    private String bktName;

    /**
     * <p>是否支持任意文件格式上传，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllTypes")
    private Boolean allTypes;

    /**
     * <p>保存时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TTL")
    private Long tTL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
