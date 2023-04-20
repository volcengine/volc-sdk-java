package com.volcengine.model.request.billing;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListAmortizedCostBillMonthlyRequest {
    @JSONField(name = "Limit")
    String limit;
    @JSONField(name = "Offset")
    String offset;
    @JSONField(name = "BillPeriod")
    String billPeriod;
    @JSONField(name = "AmortizedMonth")
    String amortizedMonth;
    @JSONField(name = "Product")
    String product;
    @JSONField(name = "InstanceNo")
    String instanceNo;
    @JSONField(name = "BillingMode")
    String billingMode;
    @JSONField(name = "BillCategory")
    String billCategory;
    @JSONField(name = "AmortizedType")
    String amortizedType;
    @JSONField(name = "IgnoreZero")
    String ignoreZero;
    @JSONField(name = "NeedRecordNum")
    String needRecordNum;
}
