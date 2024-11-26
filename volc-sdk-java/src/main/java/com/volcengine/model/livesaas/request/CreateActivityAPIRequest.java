package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SiteActivityTag;
import lombok.Data;

import java.util.List;

@Data
public class CreateActivityAPIRequest {
    @JSONField(name = "LiveTime")
    Long LiveTime;
    @JSONField(name = "TemplateId")
    Long TemplateId;
    @JSONField(name = "SiteTags")
    List<SiteActivityTag> SiteTags;
    @JSONField(name = "TextSiteTags")
    List<SiteActivityTag> TextSiteTags;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "ViewUrlPath")
    String ViewUrlPath;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "OldId")
    Long OldId;
    @JSONField(name = "CopyStream")
    Boolean CopyStream;
    @JSONField(name = "LiveMode")
    Integer LiveMode;
    @JSONField(name = "VerticalCoverImage")
    String VerticalCoverImage;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "IsAutoEndEnable")
    Integer IsAutoEndEnable;
    @JSONField(name="IsAnswerRepetitionEnable")
    Integer IsAnswerRepetitionEnable;
    @JSONField(name = "LiveLayout")
    Integer LiveLayout;
    @JSONField(name = "CreatorName")
    String CreatorName;
}
