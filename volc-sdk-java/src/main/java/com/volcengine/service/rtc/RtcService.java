package com.volcengine.service.rtc;


import com.volcengine.model.request.ListIndicatorsRequest;
import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListIndicatorsResponse;
import com.volcengine.model.response.ListRoomsResponse;
import com.volcengine.service.IBaseService;


/**
 * The interface rtc service.
 */
public interface RtcService extends IBaseService {
    
    
    ListRoomsResponse listRooms(ListRoomsRequest listRoomsRequest) throws Exception;
    
    
    ListIndicatorsResponse listIndicators(ListIndicatorsRequest listIndicatorsRequest) throws Exception;
    
}
