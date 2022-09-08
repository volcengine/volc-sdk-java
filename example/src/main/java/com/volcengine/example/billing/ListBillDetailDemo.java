package com.volcengine.example.billing;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.billing.ListBillDetailRequest;
import com.volcengine.model.response.billing.ListBillDetailResponse;
import com.volcengine.service.billing.IBillingService;
import com.volcengine.service.billing.impl.BillingServiceImpl;

public class ListBillDetailDemo {
    public static void main(String[] args) {
        String testAk = "<Your AK>";
        String testSk = "<Your SK>";

        IBillingService billingService = BillingServiceImpl.getInstance();
        billingService.setAccessKey(testAk);
        billingService.setSecretKey(testSk);
        // list users
        try {
            ListBillDetailRequest listBillDetailRequest = new ListBillDetailRequest();
            listBillDetailRequest.setBillPeriod("2022-01");
            listBillDetailRequest.setLimit("10");
            listBillDetailRequest.setOffset("0");
            listBillDetailRequest.setGroupTerm("0");
            listBillDetailRequest.setGroupPeriod("2");
            listBillDetailRequest.setProduct("");
            listBillDetailRequest.setBillingMode("");
            listBillDetailRequest.setBillCategory("");
            listBillDetailRequest.setInstanceNo("");
            listBillDetailRequest.setIgnoreZero("0");
            listBillDetailRequest.setNeedRecordNum("1");

            ListBillDetailResponse listBillDetailResponse = billingService.listBillDetail(listBillDetailRequest);
            System.out.println(JSON.toJSONString(listBillDetailResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
