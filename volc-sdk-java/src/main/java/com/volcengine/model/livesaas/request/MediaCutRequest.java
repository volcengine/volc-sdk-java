package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MediaCutRequest {
    @JSONField(name = "MediaName")
    String MediaName;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;

}
