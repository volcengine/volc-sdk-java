package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXServiceQualityResp {
    @JSONField(name = "FailureRate")
    private Double failureRate;
    @JSONField(name = "UploadData")
    private UploadOverviewResp uploadData;
    @JSONField(name = "CdnData")
    private CdnOverviewResp cdnData;
    @JSONField(name = "ClientData")
    private ClientOverviewResp clientData;
}
