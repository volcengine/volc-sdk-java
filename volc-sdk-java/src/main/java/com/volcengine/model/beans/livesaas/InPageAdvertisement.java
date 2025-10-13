package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class InPageAdvertisement {
    @JSONField(name = "Id")
    private Long Id;
    @JSONField(name = "ImageUrl")
    private String ImageUrl;
    @JSONField(name = "HomeUrl")
    private String HomeUrl;
}
