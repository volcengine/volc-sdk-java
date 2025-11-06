package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityCouponRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "CouponId")
    Long CouponId;
    @JSONField(name = "AllowCloseIcon")
    Boolean AllowCloseIcon;
    @JSONField(name = "Count")
    Long Count;
    @JSONField(name = "Rule")
    Integer Rule;
    @JSONField(name = "Duration")
    Integer Duration;
    @JSONField(name = "CutOffTime")
    Long CutOffTime;
    @JSONField(name = "IsWatchLiveLimit")
    Integer IsWatchLiveLimit;
    @JSONField(name = "IsViewerLevelLimit")
    Integer IsViewerLevelLimit;
    @JSONField(name = "ViewerLevelConfigIds")
    List<Long> ViewerLevelConfigIds;
}