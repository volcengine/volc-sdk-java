package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TosSourceInfo {
    @JSONField(name = BUCKET)
    private String bucket;
    
    @JSONField(name = PREFIX)
    private String prefix;
    
    @JSONField(name = REGION)
    private String region;
    
    @JSONField(name = COMPRESS_TYPE)
    private String compressType;
}