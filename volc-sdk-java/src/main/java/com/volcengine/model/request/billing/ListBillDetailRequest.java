package com.volcengine.model.request.billing;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListBillDetailRequest {
    @JSONField(name = "Limit")
    String limit;
    @JSONField(name = "Offset")
    String offset;
    @JSONField(name = "BillPeriod")
    String billPeriod;
    @JSONField(name = "GroupTerm")
    String groupTerm;
    @JSONField(name = "GroupPeriod")
    String groupPeriod;
    @JSONField(name = "Product")
    String product;
    @JSONField(name = "BillingMode")
    String billingMode;
    @JSONField(name = "BillCategory")
    String billCategory;
    @JSONField(name = "InstanceNo")
    String instanceNo;
    @JSONField(name = "IgnoreZero")
    String ignoreZero;
    @JSONField(name = "NeedRecordNum")
    String needRecordNum;
}
