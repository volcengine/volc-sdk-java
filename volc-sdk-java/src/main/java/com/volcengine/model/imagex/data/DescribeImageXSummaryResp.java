package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXSummaryResp {
    @JSONField(name = "StorageData")
    private SummaryFloatItem storageData;
    @JSONField(name = "CdnBandwidthData")
    private SummaryFloatItem cdnBandwidthData;
    @JSONField(name = "cdnTrafficData")
    private SummaryIntItem cdnTrafficData;
    @JSONField(name = "requestCntData")
    private SummaryIntItem requestCntData;
    @JSONField(name = "BaseOpData")
    private SummaryIntItem baseOpData;
}
