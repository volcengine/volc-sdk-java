package com.volcengine.model.tls.request;

import com.volcengine.model.tls.LogItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutLogsRequestV2 {
    private List<LogItem> logs;
    private String topicId;
    private String hashKey;
    private String compressType;
    private String path;
    private String source;

    /**
     *
     */
    public PutLogsRequestV2(List<LogItem> logs, String topicId) {
        this.logs = logs;
        this.topicId = topicId;
    }

    public PutLogsRequestV2(List<LogItem> logs, String topicId, String hashKey, String compressType) {
        this.logs = logs;
        this.topicId = topicId;
        this.hashKey = hashKey;
        this.compressType = compressType;
    }


}
