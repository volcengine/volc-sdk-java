package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VidInfo  {
    @JSONField(name = "Vid")
    java.lang.String Vid;
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "CoverImage")
    java.lang.String CoverImage;
}