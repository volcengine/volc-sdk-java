package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.AwardCondition;
import com.volcengine.model.beans.livesaas.RewardsPointsConfig;

@Data
public class UpdateActivityRedPacketRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "AwardCondition")
    AwardCondition AwardCondition;
    @JSONField(name = "BarragePwd")
    String BarragePwd;
    @JSONField(name = "BlackUserInfoId")
    Long BlackUserInfoId;
    @JSONField(name = "ClaimFailureText")
    String ClaimFailureText;
    @JSONField(name = "ClaimSuccessText")
    String ClaimSuccessText;
    @JSONField(name = "CustomRedirectUrl")
    String CustomRedirectUrl;
    @JSONField(name = "DeadLine")
    Integer DeadLine;
    @JSONField(name = "EnableCustomRedirect")
    Boolean EnableCustomRedirect;
    @JSONField(name = "EnableMiniApp")
    Boolean EnableMiniApp;
    @JSONField(name = "IsOpenSmsNotification")
    Integer IsOpenSmsNotification;
    @JSONField(name = "IsOpenWeChatWithdraw")
    Integer IsOpenWeChatWithdraw;
    @JSONField(name = "MiniAppId")
    String MiniAppId;
    @JSONField(name = "MiniAppRedirectUrl")
    String MiniAppRedirectUrl;
    @JSONField(name = "OpenRedPacketType")
    Integer OpenRedPacketType;
    @JSONField(name = "RangeStatus")
    Integer RangeStatus;
    @JSONField(name = "RedPacketCoverImage")
    String RedPacketCoverImage;
    @JSONField(name = "RedPacketID")
    Long RedPacketID;
    @JSONField(name = "RedPacketNumber")
    Integer RedPacketNumber;
    @JSONField(name = "RedPacketType")
    Integer RedPacketType;
    @JSONField(name = "RepeatedAwardLimit")
    Integer RepeatedAwardLimit;
    @JSONField(name = "RewardsPointsConfig")
    RewardsPointsConfig RewardsPointsConfig;
    @JSONField(name = "TotalAmount")
    Integer TotalAmount;
    @JSONField(name = "VipUserInfoId")
    Long VipUserInfoId;
    @JSONField(name = "Name")
    String Name;
}
