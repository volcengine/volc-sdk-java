package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetAccountUserTrackDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAccountUserTrackDataResponseBody result;

    @Data
    public static class GetAccountUserTrackDataResponseBody {
        @JSONField(name = "UserTrackData")
        UserTrackDataItemAPI UserTrackData;
        @JSONField(name = "FilterUserTrack")
        UserTrackDataItemAPI FilterUserTrack;
    }

    @Data
    public static class UserTrackDataItemAPI {
        @JSONField(name = "UserTracks")
        List<UserTrackAPI> UserTracks;
        @JSONField(name = "UserTrackSum")
        UserTrackSumAPI UserTrackSum;
        @JSONField(name = "InteractData")
        UserDetailInteractAPI InteractData;
        @JSONField(name = "PayData")
        UserDetailPayAPI PayData;
    }

    @Data
    public static class UserTrackAPI {
        @JSONField(name = "WatchDurationReplay")
        Integer WatchDurationReplay;
        @JSONField(name = "CommentCount")
        Integer CommentCount;
        @JSONField(name = "LotteryAwards")
        List<String> LotteryAwards;
        @JSONField(name = "PayAmount")
        String PayAmount;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "ActivityName")
        String ActivityName;
        @JSONField(name = "JoinTime")
        Long JoinTime;
        @JSONField(name = "WatchDurationLive")
        Integer WatchDurationLive;
    }

    @Data
    public static class UserTrackSumAPI {
        @JSONField(name = "WatchCount")
        Integer WatchCount;
        @JSONField(name = "WatchDuration")
        Integer WatchDuration;
    }

    @Data
    public static class UserDetailInteractAPI {
        @JSONField(name = "ReservationCount")
        Integer ReservationCount;
        @JSONField(name = "CommentCount")
        Integer CommentCount;
        @JSONField(name = "QuestionnaireCount")
        Integer QuestionnaireCount;
        @JSONField(name = "LotteryCount")
        Integer LotteryCount;
        @JSONField(name = "LotteryHitCount")
        Integer LotteryHitCount;
        @JSONField(name = "InviteCount")
        Integer InviteCount;
        @JSONField(name = "ShiftScreenNumber")
        Long ShiftScreenNumber;
        @JSONField(name = "VoteCount")
        Integer VoteCount;
        @JSONField(name = "MuteNumber")
        Long MuteNumber;
        @JSONField(name = "NoInteractNumber")
        Long NoInteractNumber;
        @JSONField(name = "CouponPickupCount")
        Long CouponPickupCount;
    }

    @Data
    public static class UserDetailPayAPI {
        @JSONField(name = "TotalAmount")
        String TotalAmount;
        @JSONField(name = "PayCount")
        Integer PayCount;
    }
}