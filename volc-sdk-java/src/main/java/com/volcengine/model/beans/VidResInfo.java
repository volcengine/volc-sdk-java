package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VidResInfo {
    @JSONField(name = "Vid")
    String    Vid;
    @JSONField(name = "Name")
    String    Name;
    @JSONField(name = "CoverImage")
    String    CoverImage;
}
