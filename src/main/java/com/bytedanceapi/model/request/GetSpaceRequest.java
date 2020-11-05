package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSpaceRequest {
    @JSONField(name = "Type")
    String type;
    @JSONField(name = "ProjectNames")
    String projectNames;
    @JSONField(name = "SpaceName")
    String spaceName;
}
