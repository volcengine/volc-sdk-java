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

    /**
     * <p>生成地址对应匹配到的鉴权类型。取值为空表示当前域名未配置 URL 鉴权。</p>
     *
     * <p>- `TypeA`：A 类型。</p>
     *
     * <p>- `TypeB`：B 类型。</p>
     *
     * <p>- `TypeC`：C 类型。</p>
     *
     * <p>- `TypeCustom`：自定义类型。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>更多有关 A、B、C 类型鉴权的信息，详见[配置 URL 鉴权](https://www.volcengine.com/docs/6469/1274178)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthType")
    private String authType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
