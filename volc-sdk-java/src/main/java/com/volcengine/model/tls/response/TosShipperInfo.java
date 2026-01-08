package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TosShipperInfo {
    @JSONField(name = SHIPPER_BUCKET)
    private String bucket;

    @JSONField(name = SHIPPER_PREFIX)
    private String prefix;

    @JSONField(name = SHIPPER_MAX_SIZE)
    private Integer maxSize;

    @JSONField(name = SHIPPER_COMPRESS)
    private String compress;

    @JSONField(name = SHIPPER_INTERVAL)
    private Integer interval;

    @JSONField(name = SHIPPER_PARTITION_FORMAT)
    private String partitionFormat;
}