package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageXQueryRegionsResp {
    @JSONField(name = "Province")
    private List<String> province;
    @JSONField(name = "Country")
    private List<String> country;
}
