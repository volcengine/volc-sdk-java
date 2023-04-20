package com.volcengine.service.billing;

import com.volcengine.model.request.billing.*;
import com.volcengine.model.response.billing.*;
import com.volcengine.service.IBaseService;

/**
 * The interface Iam service.
 */
public interface IBillingService extends IBaseService {
    /**
     * List Bill.
     *
     * @param listBillRequest the list bill request
     * @return the list bill response
     * @throws Exception the exception
     */
    ListBillResponse listBill(ListBillRequest listBillRequest) throws Exception;

    /**
     * List BillDetail.
     *
     * @param listBillDetailRequest the list bill detail request
     * @return the list bill detail response
     * @throws Exception the exception
     */
    ListBillDetailResponse listBillDetail(ListBillDetailRequest listBillDetailRequest) throws Exception;

    /**
     * List BillOverviewByProd.
     *
     * @param listBillOverviewByProdRequest the list bill overview by prod request
     * @return the list bill overview by prod response
     * @throws Exception the exception
     */
    ListBillOverviewByProdResponse listBillOverviewByProd(ListBillOverviewByProdRequest listBillOverviewByProdRequest) throws Exception;

    /**
     * List AmortizedCostBillDetail.
     *
     * @param listAmortizedCostBillDetailRequest the list cost bill detail request
     * @return the list cost bill detail response
     * @throws Exception the exception
     */
    ListAmortizedCostBillDetailResponse listAmortizedCostBillDetail(ListAmortizedCostBillDetailRequest listAmortizedCostBillDetailRequest) throws Exception;

    /**
     * List AmortizedCostBillMonthly.
     *
     * @param listAmortizedCostBillMonthlyRequest the list cost bill monthly request
     * @return the list cost bill monthly response
     * @throws Exception the exception
     */
    ListAmortizedCostBillMonthlyResponse listAmortizedCostBillMonthly(ListAmortizedCostBillMonthlyRequest listAmortizedCostBillMonthlyRequest) throws Exception;
}
