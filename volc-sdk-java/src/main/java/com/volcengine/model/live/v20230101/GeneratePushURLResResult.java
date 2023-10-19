package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GeneratePushURLResResult
 */
@lombok.Data
public final class GeneratePushURLResResult  {

    /**
     * <p>RTMP 推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushURLList")
    private List<String> pushURLList;

    /**
     * <p>推流地址详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushURLListDetail")
    private List<GeneratePushURLResResultPushURLListDetailItem> pushURLListDetail;

    /**
     * <p>TS over SRT 推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TsOverSrtURLList")
    private List<String> tsOverSrtURLList;

    /**
     * <p>RTMP over SRT 推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RtmpOverSrtURLList")
    private List<String> rtmpOverSrtURLList;

    /**
     * <p>RTM 推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RtmURLList")
    private List<String> rtmURLList;

    /**
     * <p>网络传输推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WebTransportURLList")
    private List<String> webTransportURLList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
