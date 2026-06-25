package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteVideoRoomMediasRequest {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
    @JSONField(name = "MediaIds")
    List<Long> MediaIds;
}
