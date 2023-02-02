package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/12/12
 * @Description:
 */
@Data
public class EditMultiReplyConfigRequest {
    private String subAccount;

    @JSONField(name = "MoUrl")
    private String moUrl;

    @JSONField(name = "ReportUrl")
    private String reportUrl;

    @JSONField(name = "SignatureUrl")
    private String signatureUrl;

    @JSONField(name = "TemplateUrl")
    private String templateUrl;

    @JSONField(name = "ClickUrl")
    private String clickUrl;
}
