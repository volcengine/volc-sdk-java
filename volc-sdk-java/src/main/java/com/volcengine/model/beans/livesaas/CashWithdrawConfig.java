package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CashWithdrawConfig {
    @JSONField(name = "IsCustomRedirectUrlEnable")
    Boolean IsCustomRedirectUrlEnable;

    @JSONField(name = "CustomRedirectUrl")
    String CustomRedirectUrl;

    @JSONField(name = "IsWeChatMiniAppEnable")
    Boolean IsWeChatMiniAppEnable;

    @JSONField(name = "WeChatMiniAppId")
    String WeChatMiniAppId;

    @JSONField(name = "WeChatMiniAppRedirectParam")
    String WeChatMiniAppRedirectParam;
}

