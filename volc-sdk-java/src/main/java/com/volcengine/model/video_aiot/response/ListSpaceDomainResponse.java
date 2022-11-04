package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListSpaceDomainResponse {
    @JSONField(name = "Domains")
    Space.SpaceDomain[] domains;
}
