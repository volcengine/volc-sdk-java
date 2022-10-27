package com.volcengine.example.rtc;


import com.volcengine.example.rtc.model.*;
import com.volcengine.model.request.ListIndicatorsRequest;
import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListIndicatorsResponse;
import com.volcengine.model.response.ListRoomsResponse;
import com.volcengine.service.IBaseService;


/**
 * The interface rtc service.
 */
public interface RtcService extends IBaseService {
    StartRecordResponse startRecord(StartRecordRequest startRecordRequest) throws Exception;

    StopRecordResponse stopRecord(StopRecordRequest stopRecordRequest) throws Exception;

    GetRecordTaskResponse getRecordTask(GetRecordTaskRequest getRecordTaskRequest) throws Exception;
}
