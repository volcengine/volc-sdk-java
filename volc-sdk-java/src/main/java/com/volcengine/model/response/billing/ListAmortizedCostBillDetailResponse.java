package com.volcengine.model.response.billing;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListAmortizedCostBillDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<CostBillDetail> costBillDetailList;
        @JSONField(name = "Limit")
        int limit;
        @JSONField(name = "Offset")
        int offset;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class CostBillDetail {
        @JSONField(name = "CostID")
        private String costID;
        @JSONField(name = "AmortizedMonth")
        private String amortizedMonth;
        @JSONField(name = "AmortizedDay")
        private String amortizedDay;
        @JSONField(name = "BillPeriod")
        private String billPeriod;
        @JSONField(name = "BusiPeriod")
        private String busiPeriod;
        @JSONField(name = "PayerID")
        private String payerID;
        @JSONField(name = "PayerUserName")
        private String payerUserName;
        @JSONField(name = "PayerCustomerName")
        private String payerCustomerName;
        @JSONField(name = "SellerID")
        private String sellerID;
        @JSONField(name = "SellerUserName")
        private String sellerUserName;
        @JSONField(name = "SellerCustomerName")
        private String sellerCustomerName;
        @JSONField(name = "OwnerID")
        private String ownerID;
        @JSONField(name = "OwnerUserName")
        private String ownerUserName;
        @JSONField(name = "OwnerCustomerName")
        private String ownerCustomerName;
        @JSONField(name = "Product")
        private String product;
        @JSONField(name = "ProductZh")
        private String productZh;
        @JSONField(name = "BusinessMode")
        private String businessMode;
        @JSONField(name = "BillingMode")
        private String billingMode;
        @JSONField(name = "BillCategory")
        private String billCategory;
        @JSONField(name = "AmortizedType")
        private String amortizedType;
        @JSONField(name = "AmortizedBeginTime")
        private String amortizedBeginTime;
        @JSONField(name = "AmortizedEndTime")
        private String amortizedEndTime;
        @JSONField(name = "BillID")
        private String billID;
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
        @JSONField(name = "ExpenseBeginTime")
        private String expenseBeginTime;
        @JSONField(name = "ExpenseEndTime")
        private String expenseEndTime;
        @JSONField(name = "TradeTime")
        private String tradeTime;
        @JSONField(name = "Price")
        private String price;
        @JSONField(name = "PriceUnit")
        private String priceUnit;
        @JSONField(name = "Count")
        private String count;
        @JSONField(name = "Unit")
        private String unit;
        @JSONField(name = "UseDuration")
        private String useDuration;
        @JSONField(name = "UseDurationUnit")
        private String useDurationUnit;
        @JSONField(name = "OriginalBillAmount")
        private String originalBillAmount;
        @JSONField(name = "PreferentialBillAmount")
        private String preferentialBillAmount;
        @JSONField(name = "RoundAmount")
        private String roundAmount;
        @JSONField(name = "DiscountBillAmount")
        private String discountBillAmount;
        @JSONField(name = "CouponAmount")
        private String couponAmount;
        @JSONField(name = "PayableAmount")
        private String payableAmount;
        @JSONField(name = "DailyAmortizedCouponAmount")
        private String dailyAmortizedCouponAmount;
        @JSONField(name = "DailyAmortizedPayableAmount")
        private String dailyAmortizedPayableAmount;
        @JSONField(name = "Currency")
        private String currency;
        @JSONField(name = "Project")
        private String project;
        @JSONField(name = "Tag")
        private String tag;
        @JSONField(name = "SubjectName")
        private String subjectName;
    }
}
