package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVhostRecordPresetRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Type")
    String type;

}
