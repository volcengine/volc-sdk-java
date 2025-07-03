package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SecurityControlCommonConfig {
    @JSONField(name = "IsPlayPageWatermarkEnable")
    Integer IsPlayPageWatermarkEnable;
    @JSONField(name = "IsModifyNicknameEnable")
    Integer IsModifyNicknameEnable;
    @JSONField(name = "IsSingleSignOnEnable")
    Integer IsSingleSignOnEnable;
    @JSONField(name = "IsAnonymousCommentEnable")
    Integer IsAnonymousCommentEnable;
    @JSONField(name = "IsTipOffCommentEnable")
    Integer IsTipOffCommentEnable;
    @JSONField(name = "IsPlayPageTickerEnable")
    Integer IsPlayPageTickerEnable;
    @JSONField(name = "KickTip")
    String KickTip;
    @JSONField(name = "BanTip")
    String BanTip;
    @JSONField(name = "WatermarkConfig")
    WatermarkConfig WatermarkConfig;
    @JSONField(name = "TickerConfig")
    TickerConfig TickerConfig;
}
