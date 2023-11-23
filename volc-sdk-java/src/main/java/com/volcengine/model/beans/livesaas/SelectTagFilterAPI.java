package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SelectTagFilterAPI  {
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "Value")
    List<java.lang.String> Value;
}