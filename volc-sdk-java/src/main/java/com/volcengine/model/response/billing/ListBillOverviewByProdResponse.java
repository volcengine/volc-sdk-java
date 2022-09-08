package com.volcengine.model.response.billing;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListBillOverviewByProdResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<BillOverviewByProd> billOverviewByProdList;
        @JSONField(name = "Limit")
        int limit;
        @JSONField(name = "Offset")
        int offset;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class BillOverviewByProd {
        @JSONField(name = "BillPeriod")
        private String billPeriod;
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
        @JSONField(name = "BillCategoryParent")
        private String billCategoryParent;
        @JSONField(name = "OriginalBillAmount")
        private String originalBillAmount;
        @JSONField(name = "PreferentialBillAmount")
        private String preferentialBillAmount;
        @JSONField(name = "RoundBillAmount")
        private String roundBillAmount;
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
    }
}
