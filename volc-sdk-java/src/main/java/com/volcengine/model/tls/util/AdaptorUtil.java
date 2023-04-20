package com.volcengine.model.tls.util;

import com.volcengine.model.tls.LogContent;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.pb.PutLogRequest;

import java.util.List;

public class AdaptorUtil {
    private AdaptorUtil() {
    }

    // log item 转为 pb
    public static PutLogRequest.LogGroupList logItems2PbGroupList(String path, String source, List<LogItem> logs) {
        PutLogRequest.LogGroupList.Builder builder = PutLogRequest.LogGroupList.newBuilder();
        if (logs == null || logs.size() == 0) {
            return builder.build();
        }
        PutLogRequest.LogGroup group = logItems2PbGroup(path, source, logs);
        return builder.addLogGroups(group).build();
    }

    public static PutLogRequest.LogGroup logItems2PbGroup(String path, String source, List<LogItem> logs) {
        PutLogRequest.LogGroup.Builder groupBuilder = PutLogRequest.LogGroup.newBuilder();
        if (logs == null || logs.size() == 0) {
            return groupBuilder.build();
        }
        if (path != null) {
            groupBuilder.setFileName(path);
        }
        if (source != null) {
            groupBuilder.setSource(source);
        }
        for (LogItem item : logs) {
            groupBuilder.addLogs(logItem2PbLog(item));
        }
        return groupBuilder.build();
    }

    public static PutLogRequest.Log logItem2PbLog(LogItem item) {
        PutLogRequest.Log.Builder logBuilder = PutLogRequest.Log.newBuilder();
        logBuilder.setTime(item.getTime());
        List<LogContent> contents = item.getContents();
        if (contents != null && contents.size() > 0) {
            for (LogContent content : contents) {
                PutLogRequest.LogContent.Builder contentBuilder = PutLogRequest.LogContent.newBuilder();
                contentBuilder.setKey(content.getKey()).setValue(content.getValue());
                logBuilder.addContents(contentBuilder.build());
            }
        }
        return logBuilder.build();
    }


}
