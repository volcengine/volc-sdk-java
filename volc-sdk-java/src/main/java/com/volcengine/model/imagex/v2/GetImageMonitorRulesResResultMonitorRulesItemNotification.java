package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMonitorRulesResResultMonitorRulesItemNotification
 */
@lombok.Data
public final class GetImageMonitorRulesResResultMonitorRulesItemNotification  {

    /**
     * <p>通知方式，仅支持取值 `http_callback`，表示回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mode")
    private List<String> mode;

    /**
     * <p>通知内容模板，模板中变量格式为 `$Name$`。Name 取值如下所示：</p>
     *
     *
     *
     * <p>- `报警名称`</p>
     *
     * <p>- `报警级别`</p>
     *
     * <p>- `报警App`</p>
     *
     * <p>- `报警平台`</p>
     *
     * <p>- `报警时间`</p>
     *
     * <p>- `报警内容`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>告警通知标题</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>沉默周期，单位为分钟。告警发生后，若未恢复正常，则会间隔一个沉默周期后再次重复发送一次告警通知。取值如下所示：</p>
     *
     *
     *
     * <p>- `0`</p>
     *
     * <p>- `30`</p>
     *
     * <p>- `60`</p>
     *
     * <p>- `360`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SilentDur")
    private Integer silentDur;

    /**
     * <p>回调地址，`Mode` 包含 `http_callback`时，为必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
