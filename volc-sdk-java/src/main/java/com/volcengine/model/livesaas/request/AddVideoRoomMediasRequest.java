package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VideoRoomVidInfo;
import lombok.Data;

import java.util.List;

@Data
public class AddVideoRoomMediasRequest {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
    @JSONField(name = "VideoVids")
    List<VideoRoomVidInfo> VideoVids;
}
