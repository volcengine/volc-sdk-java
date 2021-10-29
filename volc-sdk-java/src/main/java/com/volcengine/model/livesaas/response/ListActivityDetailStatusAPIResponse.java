package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityDetailStatusAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityDetailStatusAPIResponse.ListActivityDetailStatusAPIResultBean result;

    @Data
    public static class ListActivityDetailStatusAPIResultBean {
        @JSONField(name = "ActivityDetailStatus")
        List<ListActivityDetailStatusAPIResponse.ActivityDetailStatus> activityDetailStatus;
    }

    @Data
    public static class ActivityDetailStatus {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "ActivityId")
        Long activityId;
        @JSONField(name = "AppointmentStatus")
        Integer appointmentStatus;
        @JSONField(name = "PCU")
        Long pcu;
        @JSONField(name = "PV")
        Long pv;
        @JSONField(name = "LiveTime")
        Long liveTime;
        @JSONField(name = "CreateTime")
        Long createTime;
        @JSONField(name = "Status")
        Integer status;
        @JSONField(name = "CoverImage")
        String coverImage;
        @JSONField(name = "StreamStartTime")
        Long streamStartTime;
        @JSONField(name = "ViewUrl")
        String viewUrl;
        @JSONField(name = "AccountName")
        String accountName;
        @JSONField(name = "AccountHeadImage")
        String accountHeadImage;
    }
}
