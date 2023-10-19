package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStreamQuotaConfigBodyQuotaDetailListItem
 */
@lombok.Data
public final class UpdateStreamQuotaConfigBodyQuotaDetailListItem  {

    /**
     * <p>拉流域名的带宽限额配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Domain` 为拉流域名时，本参数为必选参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthConfig")
    private UpdateStreamQuotaConfigBodyQuotaDetailListItemBandwidthConfig bandwidthConfig;

    /**
     * <p>推流域名的推流路数限额配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Domain` 为推流域名时，本参数为必选参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamConfig")
    private UpdateStreamQuotaConfigBodyQuotaDetailListItemStreamConfig streamConfig;

    /**
     * <p>超过限额时返回的错误码，默认值为 `403`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    /**
     * <p>超过限额时返回的错误信息，默认值为 `forbid`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
