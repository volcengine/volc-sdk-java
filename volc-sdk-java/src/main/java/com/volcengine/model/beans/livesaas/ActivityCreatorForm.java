package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivityCreatorForm {
    @JSONField(name = "IsMainAccount")
    Boolean IsMainAccount;
    @JSONField(name = "SubAccountName")
    String SubAccountName;
}