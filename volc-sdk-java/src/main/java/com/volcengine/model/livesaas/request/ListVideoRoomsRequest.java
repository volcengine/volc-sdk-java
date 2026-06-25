package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVideoRoomsRequest {
    @JSONField(name = "SearchVideoRoomId")
    Long SearchVideoRoomId;
    @JSONField(name = "SearchVideoRoomName")
    String SearchVideoRoomName;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "SearchFollowerUserName")
    String SearchFollowerUserName;
    @JSONField(name = "SortBy")
    String SortBy;
    @JSONField(name = "SortOrder")
    String SortOrder;
}
