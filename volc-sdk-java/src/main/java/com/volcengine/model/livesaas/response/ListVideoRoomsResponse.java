package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VideoRoomListForm;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListVideoRoomsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListVideoRoomsResponseBody result;

    @Data
    public static class ListVideoRoomsResponseBody {
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
        @JSONField(name = "VideoRooms")
        List<VideoRoomListForm> VideoRooms;
    }
}
