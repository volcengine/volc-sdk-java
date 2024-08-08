package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskBodyTaskCallbackCfg
 */
@lombok.Data
public final class CreateImageMigrateTaskBodyTaskCallbackCfg  {

    /**
     * <p>回调方法。仅支持取值为 `http`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>回调地址。`Method`取值`http`时，填写公网可访问的 URL 地址，任务结束将向该地址发送 HTTP POST 请求。具体回调参数请参考[回调内容](#回调参数)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Addr")
    private String addr;

    /**
     * <p>回调信息中是否包含具体迁移任务条目信息。取值如下所示：</p>
     *
     * <p>- `true`：包含。仅包含迁移成功的任务条目信息，迁移失败的任务列表请在迁移完成后调用 [ExportFailedMigrateTask](https://www.volcengine.com/docs/508/1261309) 接口获取。</p>
     *
     * <p>- `false`：（默认）不包含。</p>
     *
     * <p>:::warning</p>
     *
     * <p>若任务中包含的条目数量过多，会导致回调消息体过大，增加回调失败的风险。因此建议仅在任务中条目量级不超过十万时使用该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IncludeEntry")
    private Boolean includeEntry;

    /**
     * <p>任务维度自定义回调参数，最多可输入 1024 个任意类型字符，并在回调的 `CallbackArgs` 中返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackArgs")
    private String callbackArgs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
