package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVideoRoomMedia {
    @JSONField(name = "Duration")
    Integer Duration;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "OnlineStatus")
    Integer OnlineStatus;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "MediaId")
    Long MediaId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "SourceType")
    Integer SourceType;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
}
