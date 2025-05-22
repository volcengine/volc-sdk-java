package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListAccountUserDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAccountUserDataResponseBody result;

    @Data
    public static class ListAccountUserDataResponseBody {
        @JSONField(name = "PageToken")
        String PageToken;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "Users")
        List<UserDetailAPI> Users;
    }

    @Data
    public static class UserDetailAPI {
        @JSONField(name = "PayData")
        UserDetailPayAPI PayData;
        @JSONField(name = "UserEnterForm")
        UserDetailEnterFormAPI UserEnterForm;
        @JSONField(name = "BasicData")
        UserDetailBasicAPI BasicData;
        @JSONField(name = "InteractData")
        UserDetailInteractAPI InteractData;
        @JSONField(name = "WatchData")
        UserDetailWatchAPI WatchData;
    }

    @Data
    public static class UserDetailPayAPI {
        @JSONField(name = "TotalAmount")
        String TotalAmount;
        @JSONField(name = "PayCount")
        Integer PayCount;
    }

    @Data
    public static class UserDetailEnterFormAPI {
        @JSONField(name = "EnterReviewBirthday")
        String EnterReviewBirthday;
        @JSONField(name = "EnterReviewTel")
        String EnterReviewTel;
        @JSONField(name = "EnterReviewCompany")
        String EnterReviewCompany;
        @JSONField(name = "EnterReviewName")
        String EnterReviewName;
        @JSONField(name = "EnterReviewSex")
        String EnterReviewSex;
        @JSONField(name = "EnterReviewAge")
        String EnterReviewAge;
        @JSONField(name = "EnterReviewEmail")
        String EnterReviewEmail;
        @JSONField(name = "EnterReviewIndustry")
        String EnterReviewIndustry;
        @JSONField(name = "EnterReviewPosition")
        String EnterReviewPosition;
        @JSONField(name = "EnterReviewEducation")
        String EnterReviewEducation;
    }

    @Data
    public static class UserDetailBasicAPI {
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "IP")
        String IP;
        @JSONField(name = "Province")
        String Province;
        @JSONField(name = "WatchDevice")
        String WatchDevice;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "Telephone")
        String Telephone;
        @JSONField(name = "Country")
        String Country;
        @JSONField(name = "WatchType")
        String WatchType;
        @JSONField(name = "BanStatus")
        Integer BanStatus;
        @JSONField(name = "AvatarUrl")
        String AvatarUrl;
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
        @JSONField(name = "ThumbUpNumber")
        Long ThumbUpNumber;
    }

    @Data
    public static class UserDetailWatchAPI {
        @JSONField(name = "WatchPageDuration")
        Integer WatchPageDuration;
        @JSONField(name = "LiveCount")
        Integer LiveCount;
        @JSONField(name = "WatchTime")
        Integer WatchTime;
        @JSONField(name = "RtmLiveData")
        Integer RtmLiveData;
        @JSONField(name = "WatchLiveDuration")
        Integer WatchLiveDuration;
        @JSONField(name = "WatchPreviewDuration")
        Integer WatchPreviewDuration;
        @JSONField(name = "WatchReplayDuration")
        Integer WatchReplayDuration;
    }
}