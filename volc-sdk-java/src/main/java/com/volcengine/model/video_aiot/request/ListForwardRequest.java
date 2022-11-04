package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListForwardRequest {
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;
    @JSONField(name = "SpaceID")
    String spaceID;

}
