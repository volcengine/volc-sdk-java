package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListRecordPlanChannelsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RecordPlanChannels recordPlanChannels;

    @Data
    public static class RecordPlanChannels {
        @JSONField(name = "PageResult")
        PageResultResponse pageResult;
        @JSONField(name = "List")
        Map<String,List<RecordPlanChannel>> list;
    }

    @Data
    public static class RecordPlanChannel {
        @JSONField(name = "DeviceNSID")
        String deviceNSID;
        @JSONField(name = "ChannelID")
        String channelID;
        @JSONField(name = "StreamingType")
        String streamingType;
        @JSONField(name = "StreamID")
        String streamID;
        @JSONField(name = "StreamName")
        String streamName;
        @JSONField(name = "Resolution")
        String resolution;
        @JSONField(name = "PullUrls")
        String[] pullUrls;
    }
}
