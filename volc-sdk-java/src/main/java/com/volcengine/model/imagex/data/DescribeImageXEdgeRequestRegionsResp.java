package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXEdgeRequestRegionsResp {
    @JSONField(name = "UserProvince")
    private List<String> userProvince;
    @JSONField(name = "UserCountry")
    private List<String> userCountry;
}
