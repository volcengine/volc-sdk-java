package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageMigrateTasksRespTaskSource {
    @JSONField(name = "Vendor")
    String vendor;

    @JSONField(name = "Region")
    String region;

    @JSONField(name = "Bucket")
    String bucket;

    /**
     * 用于迁移时的云厂商的访问密钥 AccessKey，推荐您迁移结束时删除该任务
     */
    @JSONField(name = "AK")
    String ak;

    /**
     * 用于迁移时的云厂商的访问密钥 SecretAccessKey，推荐您迁移结束时删除该任务
     */
    @JSONField(name = "SK")
    String sk;

    @JSONField(name = "Endpoint")
    String endpoint;

    @JSONField(name = "CdnHost")
    String cdnHost;

    @JSONField(name = "SkipHeader")
    Boolean skipHeader;

    @JSONField(name = "Prefix")
    List<String> prefix;

    @JSONField(name = "Regex")
    List<String> regex;

    @JSONField(name = "TimeStart")
    String timeStart;

    @JSONField(name = "TimeEnd")
    String timeEnd;
}

