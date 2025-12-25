package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

/**
 * BackendConfig 定义 Trace 实例后端存储相关配置。
 */
@Data
@NoArgsConstructor
public class BackendConfig {

    /**
     * 数据的保存时间，单位为天，取值范围为 1~3650。
     */
    @JSONField(name = TTL)
    private Integer ttl;

    /**
     * shard 的最大分裂个数。
     */
    @JSONField(name = MAX_SPLIT_PARTITIONS)
    private Integer maxSplitPartitions;

    /**
     * 是否开启自动分裂。
     */
    @JSONField(name = AUTO_SPLIT)
    private Boolean autoSplit;

    /**
     * 是否开启冷热存储，默认 false。
     */
    @JSONField(name = ENABLE_HOT_TTL)
    private Boolean enableHotTtl;

    /**
     * 热数据的保存时间，单位为天。
     */
    @JSONField(name = HOT_TTL)
    private Integer hotTtl;

    /**
     * 冷数据的保存时间，单位为天。
     */
    @JSONField(name = COLD_TTL)
    private Integer coldTtl;

    /**
     * 归档数据的保存时间，单位为天。
     */
    @JSONField(name = ARCHIVE_TTL)
    private Integer archiveTtl;
}
