package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageServiceResResultEventRulesItem
 */
@lombok.Data
public final class GetImageServiceResResultEventRulesItem  {

    /**
     * <p>规则 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>事件类型。取值如下所示：</p>
     *
     *
     *
     * <p>- `Upload`：上传文件</p>
     *
     * <p>- `Delete`：删除文件</p>
     *
     * <p>- `Mirror`：镜像回源</p>
     *
     * <p>- `Migrate`：数据迁移</p>
     *
     * <p>- `OffTrans`：离线转码（仅图像处理服务可配置）</p>
     *
     * <p>- `TplStore`：模板持久化存储（仅图像处理服务可配置）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EventType")
    private List<String> eventType;

    /**
     * <p>匹配规则的正则表达式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MatchRule")
    private String matchRule;

    /**
     * <p>事件触发时接收回调的回调 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>规则是否被启用，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
