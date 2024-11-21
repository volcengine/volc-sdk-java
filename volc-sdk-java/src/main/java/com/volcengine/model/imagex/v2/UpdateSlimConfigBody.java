package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSlimConfigBody
 */
@lombok.Data
public final class UpdateSlimConfigBody  {

    /**
     * <p>是否开启集智瘦身，取值如下所示：</p>
     *
     * <p>- `true`：开启集智瘦身</p>
     *
     * <p>- `false`：关闭集智瘦身</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DoSlim")
    private Boolean doSlim;

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否关闭持久化。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：关闭</p>
     *
     * <p>- `false`：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DiscardSlimedFile")
    private Boolean discardSlimedFile;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
