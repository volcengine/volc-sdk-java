package com.volcengine.example.billing;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.billing.ListAmortizedCostBillDetailRequest;
import com.volcengine.model.response.billing.ListAmortizedCostBillDetailResponse;
import com.volcengine.service.billing.IBillingService;
import com.volcengine.service.billing.impl.BillingServiceImpl;

public class ListCostBillDetailDemo {
    public static void main(String[] args) {
        String testAk = "<Your AK>";
        String testSk = "<Your SK>";

        IBillingService billingService = BillingServiceImpl.getInstance();
        billingService.setAccessKey(testAk);
        billingService.setSecretKey(testSk);
        // list cost bill detail
        try {
            ListAmortizedCostBillDetailRequest listAmortizedCostBillDetailRequest = new ListAmortizedCostBillDetailRequest();
            listAmortizedCostBillDetailRequest.setBillPeriod("");
            listAmortizedCostBillDetailRequest.setAmortizedMonth("2023-04");
            listAmortizedCostBillDetailRequest.setAmortizedDay("");
            listAmortizedCostBillDetailRequest.setProduct("");
            listAmortizedCostBillDetailRequest.setInstanceNo("");
            listAmortizedCostBillDetailRequest.setBillingMode("");
            listAmortizedCostBillDetailRequest.setBillCategory("");
            listAmortizedCostBillDetailRequest.setAmortizedType("");
            listAmortizedCostBillDetailRequest.setIgnoreZero("0");
            listAmortizedCostBillDetailRequest.setNeedRecordNum("1");
            listAmortizedCostBillDetailRequest.setOffset("0");
            listAmortizedCostBillDetailRequest.setLimit("10");

            ListAmortizedCostBillDetailResponse listAmortizedCostBillDetailResponse = billingService.listAmortizedCostBillDetail(listAmortizedCostBillDetailRequest);
            System.out.println(JSON.toJSONString(listAmortizedCostBillDetailResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
