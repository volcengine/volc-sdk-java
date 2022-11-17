package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSmsTemplateAndOrderListRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "TemplateId")
    String templateId;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "Area")
    String area;

    @JSONField(name = "ChannelType")
    String channelType;

    @JSONField(name = "Content")
    String content;

    @JSONField(name = "PageIndex")
    int pageIndex;

    @JSONField(name = "PageSize")
    int pageSize;
}
