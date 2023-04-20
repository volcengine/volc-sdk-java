package com.volcengine.example.billing;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.billing.ListAmortizedCostBillMonthlyRequest;
import com.volcengine.model.response.billing.ListAmortizedCostBillMonthlyResponse;
import com.volcengine.service.billing.IBillingService;
import com.volcengine.service.billing.impl.BillingServiceImpl;

public class ListCostBillMonthlyDemo {
    public static void main(String[] args) {
        String testAk = "<Your AK>";
        String testSk = "<Your SK>";

        IBillingService billingService = BillingServiceImpl.getInstance();
        billingService.setAccessKey(testAk);
        billingService.setSecretKey(testSk);
        // list cost bill monthly
        try {
            ListAmortizedCostBillMonthlyRequest listAmortizedCostBillMonthlyRequest = new ListAmortizedCostBillMonthlyRequest();
            listAmortizedCostBillMonthlyRequest.setBillPeriod("");
            listAmortizedCostBillMonthlyRequest.setAmortizedMonth("2023-04");
            listAmortizedCostBillMonthlyRequest.setProduct("");
            listAmortizedCostBillMonthlyRequest.setInstanceNo("");
            listAmortizedCostBillMonthlyRequest.setBillingMode("");
            listAmortizedCostBillMonthlyRequest.setBillCategory("");
            listAmortizedCostBillMonthlyRequest.setAmortizedType("");
            listAmortizedCostBillMonthlyRequest.setIgnoreZero("0");
            listAmortizedCostBillMonthlyRequest.setNeedRecordNum("1");
            listAmortizedCostBillMonthlyRequest.setOffset("0");
            listAmortizedCostBillMonthlyRequest.setLimit("10");

            ListAmortizedCostBillMonthlyResponse listAmortizedCostBillMonthlyResponse = billingService.listAmortizedCostBillMonthly(listAmortizedCostBillMonthlyRequest);
            System.out.println(JSON.toJSONString(listAmortizedCostBillMonthlyResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
