package com.volcengine.service.sercretnumber.model.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class QueryAudioRecordFileUrlResponse {

    private ResponseMetadata responseMetadata;

    private List<QueryAudioRecordFileUrlData> result;

    @Data
    public static class QueryAudioRecordFileUrlData {

        private String audioRecordFileUrl;

        private String audioRecordLeftFileUrl;

        private String audioRecordRightFileUrl;
    }
}
