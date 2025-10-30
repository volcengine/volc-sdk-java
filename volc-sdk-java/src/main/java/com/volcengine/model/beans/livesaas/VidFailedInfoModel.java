package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VidFailedInfoModel {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Reason")
    String Reason;
}