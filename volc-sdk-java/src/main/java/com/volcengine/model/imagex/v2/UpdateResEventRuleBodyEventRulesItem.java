package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateResEventRuleBodyEventRulesItem
 */
@lombok.Data
public final class UpdateResEventRuleBodyEventRulesItem  {

    /**
     * <p>事件类型。取值如下所示：</p>
     *
     * <p>- `Upload`：上传文件</p>
     *
     * <p>- `Delete`：删除文件</p>
     *
     * <p>- `Mirror`：镜像回源</p>
     *
     * <p>- `Migrate`：数据迁移</p>
     *
     * <p>- `OffTrans`：离线转码（素材托管服务配置无效）</p>
     *
     * <p>- `TplStore`：模板持久化存储（素材托管服务配置无效）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EventType")
    private List<String> eventType;

    /**
     * <p>匹配规则的正则表达式。仅当资源的 `StoreKey` 匹配该正则表达式时触发事件通知。缺省情况下表示匹配所有资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MatchRule")
    private String matchRule;

    /**
     * <p>回调 URL，以 http:// 或 https:// 开头，需满足公网可访问。当事件触发时，会向该 URL 发送 HTTP POST 请求，body 为具体的事件信息。具体回调参数详见回调内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>规则启用状态，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
