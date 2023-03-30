package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.SdkVerItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXClientSdkVerByTimeResp {
    @JSONField(name = "SdkVerData")
    private List<SdkVerItem> sdkVerData;
}
