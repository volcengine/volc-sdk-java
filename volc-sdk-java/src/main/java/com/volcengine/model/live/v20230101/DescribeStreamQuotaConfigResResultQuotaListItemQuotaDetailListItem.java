package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItem
 */
@lombok.Data
public final class DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItem  {

    /**
     * <p>拉流域名的带宽限额配置信息。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Domain` 为拉流域名时返回。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthConfig")
    private DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemBandwidthConfig bandwidthConfig;

    /**
     * <p>推流域名的推流路数限额配置信息。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Domain` 为推流域名时返回。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamConfig")
    private DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemStreamConfig streamConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
