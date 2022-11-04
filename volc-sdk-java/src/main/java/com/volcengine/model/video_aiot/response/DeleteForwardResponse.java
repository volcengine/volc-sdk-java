package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteForwardResponse {
    @JSONField(name = "Success")
    String[] success;
    @JSONField(name = "Failed")
    String[] failed;
}
