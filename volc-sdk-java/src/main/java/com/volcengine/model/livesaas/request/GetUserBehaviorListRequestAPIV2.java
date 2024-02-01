package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetUserBehaviorListRequestAPIV2 {
    @JSONField(name = "Channel")
    String Channel;
    @JSONField(name = "PageNo")
    Long PageNo;
    @JSONField(name = "PageItemCount")
    Long PageItemCount;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "IsMerge")
    Integer IsMerge;
    @JSONField(name = "PlayStatus")
    Integer PlayStatus;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "IsMergeUserId")
    Integer IsMergeUserId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "ScrollId")
    String ScrollId;
}