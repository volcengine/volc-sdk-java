package com.volcengine.model.response.billing;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListBillDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<BillDetail> billDetailList;
        @JSONField(name = "Limit")
        int limit;
        @JSONField(name = "Offset")
        int offset;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class BillDetail {
        @JSONField(name = "BillPeriod")
        private String billPeriod;
        @JSONField(name = "ExpenseDate")
        private String expenseDate;
        @JSONField(name = "PayerID")
        private String payerID;
        @JSONField(name = "PayerUserName")
        private String payerUserName;
        @JSONField(name = "PayerCustomerName")
        private String payerCustomerName;
        @JSONField(name = "OwnerID")
        private String ownerID;
        @JSONField(name = "OwnerUserName")
        private String ownerUserName;
        @JSONField(name = "OwnerCustomerName")
        private String ownerCustomerName;
        @JSONField(name = "BusinessMode")
        private String businessMode;
        @JSONField(name = "Product")
        private String product;
        @JSONField(name = "ProductZh")
        private String productZh;
        @JSONField(name = "BillingMode")
        private String billingMode;
        @JSONField(name = "ExpenseBeginTime")
        private String expenseBeginTime;
        @JSONField(name = "ExpenseEndTime")
        private String expenseEndTime;
        @JSONField(name = "UseDuration")
        private String useDuration;
        @JSONField(name = "UseDurationUnit")
        private String useDurationUnit;
        @JSONField(name = "TradeTime")
        private String tradeTime;
        @JSONField(name = "BillID")
        private String billID;
        @JSONField(name = "BillCategory")
        private String billCategory;
        @JSONField(name = "InstanceNo")
        private String instanceNo;
        @JSONField(name = "InstanceName")
        private String instanceName;
        @JSONField(name = "ConfigName")
        private String configName;
        @JSONField(name = "Element")
        private String element;
        @JSONField(name = "Region")
        private String region;
        @JSONField(name = "Zone")
        private String zone;
        @JSONField(name = "Factor")
        private String factor;
        @JSONField(name = "ExpandField")
        private String expandField;
        @JSONField(name = "Price")
        private String price;
        @JSONField(name = "PriceUnit")
        private String priceUnit;
        @JSONField(name = "Count")
        private String count;
        @JSONField(name = "Unit")
        private String unit;
        @JSONField(name = "DeductionCount")
        private String deductionCount;
        @JSONField(name = "OriginalBillAmount")
        private String originalBillAmount;
        @JSONField(name = "PreferentialBillAmount")
        private String preferentialBillAmount;
        @JSONField(name = "DiscountBillAmount")
        private String discountBillAmount;
        @JSONField(name = "CouponAmount")
        private String couponAmount;
        @JSONField(name = "PayableAmount")
        private String payableAmount;
        @JSONField(name = "PaidAmount")
        private String paidAmount;
        @JSONField(name = "UnpaidAmount")
        private String unpaidAmount;
        @JSONField(name = "Currency")
        private String currency;
    }
}
