package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeForbiddenStreamGroupByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeForbiddenStreamGroupByPageResResultStreamInfoListItem  {

    /**
     * <p>禁推流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>禁推流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>禁推流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>禁推流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>禁推流的主流和备流详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ForbiddenInfoDetails")
    private List<DescribeForbiddenStreamGroupByPageResResultStreamInfoListItemForbiddenInfoDetailsItem> forbiddenInfoDetails;

    /**
     * <p>禁推流被禁推的开始时间。遵循 RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>禁推流结束禁推的时间。遵循 RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
