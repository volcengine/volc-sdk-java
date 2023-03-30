package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.CdnOverviewResp;
import com.volcengine.model.imagex.data.ClientOverviewResp;
import com.volcengine.model.imagex.data.UploadOverviewResp;
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
