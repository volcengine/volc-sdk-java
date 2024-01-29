package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorage
 */
@lombok.Data
public final class GetImageServiceResResultStorage  {

    /**
     * <p>存储 Bucket 名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BktName")
    private String bktName;

    /**
     * <p>保存时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TTL")
    private Long tTL;

    /**
     * <p>是否支持任意文件格式上传，取值如下所示：</p>
     *
     * <p>- `true`：支持</p>
     *
     * <p>- `false`：不支持</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllTypes")
    private Boolean allTypes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
