package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetUserBehaviorListRequest {
    @JSONField(name = "PlayStatus")
    Integer PlayStatus;
    @JSONField(name = "PageItemCount")
    Long PageItemCount;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Source")
    Integer Source;
    @JSONField(name = "PageNo")
    Long PageNo;
    @JSONField(name = "IsMerge")
    Integer IsMerge;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "IsMergeUserId")
    Integer IsMergeUserId;
    @JSONField(name = "ScrollId")
    String ScrollId;
}