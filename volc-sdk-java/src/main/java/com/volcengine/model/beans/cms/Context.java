package com.volcengine.model.beans.cms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Context {
    @JSONField(name = "IP")
    String ip;
    @JSONField(name = "Province")
    String province;
    @JSONField(name = "RefreshType")
    String refreshType;
}
