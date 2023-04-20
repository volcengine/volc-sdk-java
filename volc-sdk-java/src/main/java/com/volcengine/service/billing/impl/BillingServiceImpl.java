package com.volcengine.service.billing.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.billing.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.billing.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.billing.BillingConfig;
import com.volcengine.service.billing.IBillingService;


public class BillingServiceImpl extends BaseServiceImpl implements IBillingService {

    private BillingServiceImpl() {
        super(BillingConfig.serviceInfo, BillingConfig.apiInfoList);
    }

    public static IBillingService getInstance() {
        return new BillingServiceImpl();
    }

    @Override
    public ListBillResponse listBill(ListBillRequest listBillRequest) throws Exception {
        RawResponse response = query(Const.ListBill, Utils.mapToPairList(Utils.paramsToMap(listBillRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListBillResponse.class);
    }

    @Override
    public ListBillDetailResponse listBillDetail(ListBillDetailRequest listBillDetailRequest) throws Exception {
        RawResponse response = query(Const.ListBillDetail, Utils.mapToPairList(Utils.paramsToMap(listBillDetailRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListBillDetailResponse.class);
    }

    @Override
    public ListBillOverviewByProdResponse listBillOverviewByProd(ListBillOverviewByProdRequest listBillOverviewByProdRequest) throws Exception {
        RawResponse response = query(Const.ListBillOverviewByProd, Utils.mapToPairList(Utils.paramsToMap(listBillOverviewByProdRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListBillOverviewByProdResponse.class);
    }

    @Override
    public ListAmortizedCostBillDetailResponse listAmortizedCostBillDetail(ListAmortizedCostBillDetailRequest listAmortizedCostBillDetailRequest) throws Exception {
        RawResponse response = query(Const.ListAmortizedCostBillDetail, Utils.mapToPairList(Utils.paramsToMap(listAmortizedCostBillDetailRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAmortizedCostBillDetailResponse.class);
    }

    @Override
    public ListAmortizedCostBillMonthlyResponse listAmortizedCostBillMonthly(ListAmortizedCostBillMonthlyRequest listAmortizedCostBillMonthlyRequest) throws Exception {
        RawResponse response = query(Const.ListAmortizedCostBillMonthly, Utils.mapToPairList(Utils.paramsToMap(listAmortizedCostBillMonthlyRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListAmortizedCostBillMonthlyResponse.class);
    }
}