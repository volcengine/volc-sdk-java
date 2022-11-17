package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class OCRVatInvoiceResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    VatInvoiceData data;

    @Data
    public static class VatInvoiceData {
        
        @JSONField(name = "license_main")
        MainInfo licenseMain;
    }

    @Data
    public static class MainInfo {
        @JSONField(name = "invoice_code")
        String invoiceCode;

        @JSONField(name = "invoice_name")
        String invoiceName;

        @JSONField(name = "machine_num")
        String machineNum;

        @JSONField(name = "check_code")
        String checkCode;

        @JSONField(name = "sheet_name")
        String sheetName;

        @JSONField(name = "invoice_no")
        String invoiceNo;

        @JSONField(name = "typed_invoice_code")
        String typedInvoiceCode;

        @JSONField(name = "typed_invoice_no")
        String typedInvoiceNo;

        @JSONField(name = "invoice_date")
        String invoiceDate;

        @JSONField(name = "buyer_name")
        String buyerName;

        @JSONField(name = "buyer_taxpayer_no")
        String buyerTaxpayerNo;

        @JSONField(name = "buyer_address_phone")
        String buyerAddressPhone;

        @JSONField(name = "buyer_account")
        String buyerAccount;

        @JSONField(name = "total_price")
        String totalPrice;

        @JSONField(name = "total_tax")
        String totalTax;

        @JSONField(name = "big_total_price_and_tax")
        String bigTotalPriceAndTax;

        @JSONField(name = "total_price_and_tax")
        String totalPriceAndTax;

        @JSONField(name = "seller_name")
        String sellerName;

        @JSONField(name = "seller_taxpayer")
        String sellerTaxpayerNo;

        @JSONField(name = "seller_address_phone")
        String sellerAddressPhone;

        @JSONField(name = "seller_account")
        String sellerAccount;

        @JSONField(name = "beizhu")
        String beizhu;

        @JSONField(name = "payee")
        String payee;

        @JSONField(name = "reviewer")
        String reviewer;

        @JSONField(name = "drawer")
        String drawer;

        @JSONField(name = "is_sealed")
        String isSealed;

        @JSONField(name = "seller_name_in_seal")
        String sellerNameInSeal;

        @JSONField(name = "seller_taxpayer_no_in_seal")
        String sellerTaxpayerNoInSeal;

        @JSONField(name = "is_secret_out_bound")
        String isSecretOutBound;

        @JSONField(name = "invoice_special_seal")
        String invoiceSpecialSeal;

        @JSONField(name = "sub_type")
        String subType;

        @JSONField(name = "entry")
        List<EntryInfo> entry;
    }
    
    @Data
    public static class EntryInfo {
        @JSONField(name = "entry_name")
        String entryName;

        @JSONField(name = "xinghao")
        String xinghao;

        @JSONField(name = "unit")
        String unit;

        @JSONField(name = "quantity")
        String quantity;

        @JSONField(name = "unit_price")
        String unitPrice;

        @JSONField(name = "price_amount")
        String priceAmount;

        @JSONField(name = "tax_rate")
        String taxRate;

        @JSONField(name = "tax_amount")
        String taxAmount;

    }
}