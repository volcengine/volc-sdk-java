package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SiteActivityTagNew  {
    @JSONField(name = "Value")
    List<java.lang.String> Value;
    @JSONField(name = "Index")
    Integer Index;
}