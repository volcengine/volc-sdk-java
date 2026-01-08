package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TosShipperInfo {

    /** TOS 目标桶名称. */
    @JSONField(name = "Bucket")
    private String bucket;

    /** 对象前缀. */
    @JSONField(name = "Prefix")
    private String prefix;

    /** 单个文件最大大小，单位为 MB. */
    @JSONField(name = "MaxSize")
    private int maxSize;

    /** 导出间隔，单位为秒. */
    @JSONField(name = "Interval")
    private int interval;

    /** 压缩格式. */
    @JSONField(name = "Compress")
    private String compress;

    /** 分区格式. */
    @JSONField(name = "PartitionFormat")
    private String partitionFormat;
}
