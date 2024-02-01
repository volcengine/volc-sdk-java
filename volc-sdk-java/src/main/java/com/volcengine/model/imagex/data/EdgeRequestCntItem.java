package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class EdgeRequestCntItem {
    @JSONField(name = "DataType")
    private String dataType;
    @JSONField(name = "DomainName")
    private String domainName;
    @JSONField(name = "Data")
    private List<TSIntItem> data;
}
