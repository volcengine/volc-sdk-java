package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SetVideoPublishStatusRequest {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Vid")
    String vid;
    @JSONField(name = "Status")
    String status;
}
