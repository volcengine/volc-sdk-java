package com.volcengine.service.sercretnumber;

import com.volcengine.service.sercretnumber.model.request.QueryAudioRecordFileUrlRequest;
import com.volcengine.service.sercretnumber.model.request.QueryAudioRecordToTextFileRequest;
import com.volcengine.service.sercretnumber.model.request.QueryCallRecordRequest;
import com.volcengine.service.sercretnumber.model.response.QueryAudioRecordFileUrlResponse;
import com.volcengine.service.sercretnumber.model.response.QueryAudioRecordToTextFileResponse;
import com.volcengine.service.sercretnumber.model.response.QueryCallRecordMsgResponse;

public interface IDataCenterService {

    QueryCallRecordMsgResponse queryCallRecordMsg(QueryCallRecordRequest request) throws Exception;

    QueryAudioRecordFileUrlResponse queryAudioRecordFileUrl(QueryAudioRecordFileUrlRequest request) throws Exception;

    QueryAudioRecordToTextFileResponse queryAudioRecordToTextFile(QueryAudioRecordToTextFileRequest request) throws Exception;
}
