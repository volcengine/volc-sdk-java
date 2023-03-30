package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.App;
import lombok.Data;

import java.util.List;

@Data
public class GetImageXQueryAppsResp {
    @JSONField(name = "Apps")
    private List<App> apps;
}
