package com.volcengine.example.billing;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.billing.ListBillOverviewByProdRequest;
import com.volcengine.model.response.billing.ListBillOverviewByProdResponse;
import com.volcengine.service.billing.IBillingService;
import com.volcengine.service.billing.impl.BillingServiceImpl;

public class ListBillOverviewByProdDemo {
    public static void main(String[] args) {
        String testAk = "<Your AK>";
        String testSk = "<Your SK>";

        IBillingService billingService = BillingServiceImpl.getInstance();
        billingService.setAccessKey(testAk);
        billingService.setSecretKey(testSk);
        // list users
        try {
            ListBillOverviewByProdRequest listBillOverviewByProdRequest = new ListBillOverviewByProdRequest();
            listBillOverviewByProdRequest.setBillPeriod("2022-01");
            listBillOverviewByProdRequest.setLimit("10");
            listBillOverviewByProdRequest.setOffset("0");
            listBillOverviewByProdRequest.setProduct("");
            listBillOverviewByProdRequest.setBillingMode("");
            listBillOverviewByProdRequest.setBillCategoryParent("");
            listBillOverviewByProdRequest.setIgnoreZero("0");
            listBillOverviewByProdRequest.setNeedRecordNum("1");

            ListBillOverviewByProdResponse listBillOverviewByProdResponse = billingService.listBillOverviewByProd(listBillOverviewByProdRequest);
            System.out.println(JSON.toJSONString(listBillOverviewByProdResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
