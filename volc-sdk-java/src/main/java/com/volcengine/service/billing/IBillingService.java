package com.volcengine.service.billing;

import com.volcengine.model.request.billing.ListBillDetailRequest;
import com.volcengine.model.request.billing.ListBillOverviewByProdRequest;
import com.volcengine.model.request.billing.ListBillRequest;
import com.volcengine.model.response.billing.ListBillDetailResponse;
import com.volcengine.model.response.billing.ListBillOverviewByProdResponse;
import com.volcengine.model.response.billing.ListBillResponse;
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
}
