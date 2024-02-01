package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetUrlFetchTaskQuery
 */
@lombok.Data
public final class GetUrlFetchTaskQuery  {

    /**
     * <p>异步任务 ID，您可通过调用 [FetchImageUrl](https://www.volcengine.com/docs/508/68807)接口获取该 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
