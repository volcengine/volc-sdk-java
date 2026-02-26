package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImageItem {
    @JSONField(name = "DataId")
    String dataId;

    @JSONField(name = "URL")
    String url;
}