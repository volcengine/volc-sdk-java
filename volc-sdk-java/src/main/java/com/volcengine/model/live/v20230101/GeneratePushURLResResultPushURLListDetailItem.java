package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePushURLResResultPushURLListDetailItem
 */
@lombok.Data
public final class GeneratePushURLResResultPushURLListDetailItem  {

    /**
     * <p>推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>OBS 推流地址，例如，`rtmp://push.example.com/live/`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainApp")
    private String domainApp;

    /**
     * <p>OBS 推流名称，例如，`streamname1?volcTime=1675652376&volcSecret=c57d247c2f19b395b6ec9b182******7`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamSign")
    private String streamSign;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
