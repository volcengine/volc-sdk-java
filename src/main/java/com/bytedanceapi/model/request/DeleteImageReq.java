package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteImageReq {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "StoreUris")
    List<String> storeUris;
}
