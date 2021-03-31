package com.volcengine.service.livesaas;

import com.volcengine.model.livesaas.request.CommonAPIRequest;
import com.volcengine.model.livesaas.request.CreateActivityAPIRequest;
import com.volcengine.model.livesaas.request.GetAdvertisementDataAPIRequest;
import com.volcengine.model.livesaas.response.*;
import com.volcengine.service.IBaseService;

/**
 * The interface Vedit service.
 */
public interface LivesaasService extends IBaseService {

    /**
     * createActivityAPI
     *
     * @param createActivityAPIRequest CreateActivityAPIRequest
     * @return CreateActivityAPIResponse
     * @throws Exception the exception
     */
    CreateActivityAPIResponse createActivityAPI(CreateActivityAPIRequest createActivityAPIRequest) throws Exception;

    /**
     * getActivityAPI
     *
     * @param getActivityAPIRequest CommonAPIRequest
     * @return GetActivityAPIResponse
     * @throws Exception the exception
     */
    GetActivityAPIResponse getActivityAPI(CommonAPIRequest getActivityAPIRequest) throws Exception;

    /**
     * getStreamsAPI
     *
     * @param getStreamsAPIRequest CommonAPIRequest
     * @return GetStreamsAPIResponse
     * @throws Exception the exception
     */
    GetStreamsAPIResponse getStreamsAPI(CommonAPIRequest getStreamsAPIRequest) throws Exception;

    /**
     * getAdvertisementDataAPI
     *
     * @param getAdvertisementDataAPIRequest GetAdvertisementDataAPIRequest
     * @return GetAdvertisementDataAPIResponse
     * @throws Exception the exception
     */
    GetAdvertisementDataAPIResponse getAdvertisementDataAPI(GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest) throws Exception;

    /**
     * getRealTimeOnlineNumberAPI
     *
     * @param getRealTimeOnlineNumberAPIRequest GetRealTimeOnlineNumberAPIRequest
     * @return GetRealTimeOnlineNumberAPIResponse
     * @throws Exception the exception
     */
    GetRealTimeOnlineNumberAPIResponse getRealTimeOnlineNumberAPI(CommonAPIRequest getRealTimeOnlineNumberAPIRequest) throws Exception;

}
