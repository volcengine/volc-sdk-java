package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VodReorderMediaIdIndex;
import lombok.Data;

import java.util.List;

@Data
public class ReorderVideoRoomMediasRequest {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
    @JSONField(name = "VodReorderIndex")
    List<VodReorderMediaIdIndex> VodReorderIndex;
}
