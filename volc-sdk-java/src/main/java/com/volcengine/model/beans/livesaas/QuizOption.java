package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class QuizOption {
    @JSONField(name = "OptionSite")
    String OptionSite;
    @JSONField(name = "OptionName")
    String OptionName;
    @JSONField(name = "OptionCount")
    Long OptionCount;
    @JSONField(name = "OptionPercent")
    String OptionPercent;
}
