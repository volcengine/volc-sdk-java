package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSmsTemplateAndOrderListRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "templateId")
    String templateId;

    @JSONField(name = "name")
    String name;

    @JSONField(name = "area")
    String area;

    @JSONField(name = "channelType")
    String channelType;

    @JSONField(name = "content")
    String content;

    @JSONField(name = "pageIndex")
    int pageIndex;

    @JSONField(name = "pageSize")
    int pageSize;
}
