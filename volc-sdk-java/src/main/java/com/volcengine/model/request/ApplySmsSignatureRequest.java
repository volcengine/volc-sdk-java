package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ApplySmsSignatureRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "Content")
    String content;

    @JSONField(name = "Source")
    String source;

    @JSONField(name = "Desc")
    String desc;

    @JSONField(name = "UploadFileKey")
    String uploadFileKey;
}
