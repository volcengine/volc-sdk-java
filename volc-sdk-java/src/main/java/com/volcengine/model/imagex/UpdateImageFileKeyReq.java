package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateImageFileKeyReq {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "OriKey")
    String oriKey;

    @JSONField(name = "DstKey")
    String dstKey;
}
