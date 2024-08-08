package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import lombok.Data;

import java.util.List;

@Data
public class GetMediaStoragePayDataRequest {
    @JSONField(name = "SubAccountName")
    String SubAccountName;
}