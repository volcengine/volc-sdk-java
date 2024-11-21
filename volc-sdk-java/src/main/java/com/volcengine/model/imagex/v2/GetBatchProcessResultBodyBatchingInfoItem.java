package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetBatchProcessResultBodyBatchingInfoItem
 */
@lombok.Data
public final class GetBatchProcessResultBodyBatchingInfoItem  {

    /**
     * <p>批处理能力，取值如下所示：</p>
     *
     * <p>- `meta`：获取资源元信息</p>
     *
     * <p>- `preload`：源站图片预热</p>
     *
     * <p>:::warning</p>
     *
     * <p>如需批量预热源站图片，请 [提交工单](https://console.volcengine.com/ticket/createTicketV2/?step=3&Service=rtc&FlowKey=NGnOHeWkbeCrEAkrNvjT)联系技术支持开启。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>指定服务下待批处理资源的可访问 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
