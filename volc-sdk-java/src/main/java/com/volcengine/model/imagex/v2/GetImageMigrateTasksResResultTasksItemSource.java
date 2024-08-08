package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMigrateTasksResResultTasksItemSource
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItemSource  {

    /**
     * <p>源服务商</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vendor")
    private String vendor;

    /**
     * <p>指定迁移结束时间点，为迁移结束当地服务器时间。表示仅迁移该时间段内新增或变更的文件。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeEnd")
    private String timeEnd;

    /**
     * <p>指定迁移开始时间点，为迁移开始当地服务器时间。表示仅迁移该时间段内新增或变更的文件。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStart")
    private String timeStart;

    /**
     * <p>迁移正则表达式列表</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Regex")
    private List<String> regex;

    /**
     * <p>迁移前缀列表</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private List<String> prefix;

    /**
     * <p>是否丢弃源 Header，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：丢弃源 Header</p>
     *
     * <p>- `false`：不丢弃源 Header</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipHeader")
    private Boolean skipHeader;

    /**
     * <p>迁移源云服务商 CDN 域名</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnHost")
    private String cdnHost;

    /**
     * <p>源 Endpoint</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>Secret Key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SK")
    private String sK;

    /**
     * <p>Access Key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AK")
    private String aK;

    /**
     * <p>源 bucket</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>源 bucket 地区</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
