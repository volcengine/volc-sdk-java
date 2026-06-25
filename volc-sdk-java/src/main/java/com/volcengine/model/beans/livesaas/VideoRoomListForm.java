package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoRoomListForm {
    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
    @JSONField(name = "AccountId")
    Long AccountId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "ViewUrl")
    String ViewUrl;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "ViewUrlNameSpace")
    String ViewUrlNameSpace;
    @JSONField(name = "VideoRoomClassification")
    Integer VideoRoomClassification;
}
