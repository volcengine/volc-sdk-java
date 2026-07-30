package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ProductCardUrl {
    @JSONField(name = "Default")
    String Default;
    @JSONField(name = "UAList")
    List<String> UAList;
    @JSONField(name = "MiniApp")
    String MiniApp;
}
