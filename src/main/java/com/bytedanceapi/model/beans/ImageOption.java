package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImageOption {
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "FileName")
    String fileName;
}
