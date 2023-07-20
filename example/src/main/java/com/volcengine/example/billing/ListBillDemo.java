package com.volcengine.example.billing;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.billing.ListBillRequest;
import com.volcengine.model.response.billing.ListBillResponse;
import com.volcengine.service.billing.IBillingService;
import com.volcengine.service.billing.impl.BillingServiceImpl;

public class ListBillDemo {
    public static void main(String[] args) {
        String testAk = "<Your AK>";
        String testSk = "<Your SK>";

        IBillingService billingService = BillingServiceImpl.getInstance();
        billingService.setAccessKey(testAk);
        billingService.setSecretKey(testSk);
        try {
            ListBillRequest listBillRequest = new ListBillRequest();
            listBillRequest.setBillPeriod("2022-01");
            listBillRequest.setLimit("10");
            listBillRequest.setOffset("0");
            listBillRequest.setProduct("");
            listBillRequest.setBillingMode("");
            listBillRequest.setBillCategoryParent("");
            listBillRequest.setPayStatus("");
            listBillRequest.setIgnoreZero("0");
            listBillRequest.setNeedRecordNum("1");

            ListBillResponse listBillResponse = billingService.listBill(listBillRequest);
            System.out.println(JSON.toJSONString(listBillResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
