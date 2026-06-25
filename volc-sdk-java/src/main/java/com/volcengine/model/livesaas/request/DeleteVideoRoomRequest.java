package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteVideoRoomRequest {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
}
