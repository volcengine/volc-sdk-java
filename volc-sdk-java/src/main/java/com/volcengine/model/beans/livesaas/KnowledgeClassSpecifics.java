package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class KnowledgeClassSpecifics {
    @JSONField(name = "VideoVids")
    List<VideoRoomVidInfo> VideoVids;
    @JSONField(name = "KnowledgeClassName")
    String KnowledgeClassName;
}
