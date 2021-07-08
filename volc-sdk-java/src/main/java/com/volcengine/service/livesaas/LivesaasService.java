package com.volcengine.service.livesaas;

import com.volcengine.model.livesaas.request.*;
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

    /**
     * getActivityAPI
     *
     * @param deleteActivityAPIRequest CommonAPIRequest
     * @return DeleteActivityAPIResponse
     * @throws Exception the exception
     */
    DeleteActivityAPIResponse deleteActivityAPI(CommonAPIRequest deleteActivityAPIRequest) throws Exception;

    /**
     * getActivityBasicConfigAPI
     *
     * @param getActivityBasicConfigAPIRequest CommonAPIRequest
     * @return GetActivityBasicConfigAPIResponse
     * @throws Exception the exception
     */
    GetActivityBasicConfigAPIResponse getActivityBasicConfigAPI(CommonAPIRequest getActivityBasicConfigAPIRequest) throws Exception;

    /**
     * updateActivityBasicConfigAPI
     *
     * @param updateActivityBasicConfigAPIRequest UpdateActivityBasicConfigAPIRequest
     * @return UpdateActivityBasicConfigAPIResponse
     * @throws Exception the exception
     */
    UpdateActivityBasicConfigAPIResponse updateActivityBasicConfigAPI(UpdateActivityBasicConfigAPIRequest updateActivityBasicConfigAPIRequest) throws Exception;

    /**
     * UploadLibAPI
     *
     * @param uploadLibAPIRequest UploadLibAPIRequest
     * @return UploadLibAPIResponse
     * @throws Exception the exception
     */
    UploadLibAPIResponse uploadLibAPI(UploadLibAPIRequest uploadLibAPIRequest) throws Exception;

    /**
     * getActivityMenuAPI
     *
     * @param getActivityMenuAPIRequest GetActivityMenuAPIRequest
     * @return GetActivityMenuAPIResponse
     * @throws Exception the exception
     */
    GetActivityMenuAPIResponse getActivityMenuAPI(GetActivityMenuAPIRequest getActivityMenuAPIRequest) throws Exception;

    /**
     * updateActivityMenuAPI
     *
     * @param updateActivityMenuAPIRequest UpdateActivityMenuAPIRequest
     * @return UpdateActivityMenuAPIResponse
     * @throws Exception the exception
     */
    UpdateActivityMenuAPIResponse updateActivityMenuAPI(UpdateActivityMenuAPIRequest updateActivityMenuAPIRequest) throws Exception;

    /**
     * getActivityProductAPI
     *
     * @param getActivityProductAPIRequest CommonAPIRequest
     * @return GetActivityProductAPIResponse
     * @throws Exception the exception
     */
    GetActivityProductAPIResponse getActivityProductAPI(CommonAPIRequest getActivityProductAPIRequest) throws Exception;

    /**
     * updateActivityProductAPI
     *
     * @param updateActivityProductAPIRequest UpdateActivityProductAPIRequest
     * @return UpdateActivityProductAPIResponse
     * @throws Exception the exception
     */
    UpdateActivityProductAPIResponse updateActivityProductAPI(UpdateActivityProductAPIRequest updateActivityProductAPIRequest) throws Exception;

}
