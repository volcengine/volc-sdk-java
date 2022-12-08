package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SimpleSiteTag;
import com.volcengine.model.beans.livesaas.SimpleTextSiteTag;
import lombok.Data;

import java.util.List;

@Data
public class UpdateSiteTagAPIV2Request {
    @JSONField(name = "SiteTags")
    List<SimpleSiteTag> SiteTags;
    @JSONField(name = "TextSiteTags")
    List<SimpleTextSiteTag> TextSiteTags;
}