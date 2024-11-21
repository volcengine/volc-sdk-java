package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateBatchProcessTaskBody
 */
@lombok.Data
public final class CreateBatchProcessTaskBody  {

    /**
     * <p>指定服务下待批量处理的资源链接信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BatchingInfo")
    private List<CreateBatchProcessTaskBodyBatchingInfoItem> batchingInfo;

    /**
     * <p>回调内容格式。默认为空，若需指定`CallbackBody`时，也需同时指定`CallbackBodyType`的值。取值如下所示：</p>
     *
     *
     *
     * <p>- `application/json`</p>
     *
     * <p>- `application/x-www-form-urlencoded`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBodyType")
    private String callbackBodyType;

    /**
     * <p>自定义回调内容，取值需要符合`CallbackBodyType`指定格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBody")
    private String callbackBody;

    /**
     * <p>回调地址，用于接收返回的回调信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
