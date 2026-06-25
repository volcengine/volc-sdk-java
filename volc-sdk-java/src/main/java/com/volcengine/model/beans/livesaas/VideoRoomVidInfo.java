package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoRoomVidInfo {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "VodCoverImg")
    String VodCoverImg;
    @JSONField(name = "MediaLibraryVideoId")
    Long MediaLibraryVideoId;
}
