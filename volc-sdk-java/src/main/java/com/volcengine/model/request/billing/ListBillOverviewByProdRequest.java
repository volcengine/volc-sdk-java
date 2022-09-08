package com.volcengine.model.request.billing;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListBillOverviewByProdRequest {
    @JSONField(name = "Limit")
    String limit;
    @JSONField(name = "Offset")
    String offset;
    @JSONField(name = "BillPeriod")
    String billPeriod;
    @JSONField(name = "Product")
    String product;
    @JSONField(name = "BillingMode")
    String billingMode;
    @JSONField(name = "BillCategoryParent")
    String billCategoryParent;
    @JSONField(name = "IgnoreZero")
    String ignoreZero;
    @JSONField(name = "NeedRecordNum")
    String needRecordNum;
}
