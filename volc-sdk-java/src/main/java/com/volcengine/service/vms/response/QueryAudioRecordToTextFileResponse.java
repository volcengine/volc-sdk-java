package com.volcengine.service.vms.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class QueryAudioRecordToTextFileResponse {

    private ResponseMetadata responseMetadata;

    private List<QueryAudioRecordToTextFile> result;

    @Data
    public static class QueryAudioRecordToTextFile {

        private String callId;

        private String audioRecordToTextFileUrl;
    }
}
