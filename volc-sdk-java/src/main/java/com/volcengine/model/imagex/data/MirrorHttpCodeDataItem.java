package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MirrorHttpCodeDataItem {
    @JSONField(name = "HttpCode")
    private String httpCode;
    @JSONField(name = "Data")
    private List<TSIntItem> data;
}
