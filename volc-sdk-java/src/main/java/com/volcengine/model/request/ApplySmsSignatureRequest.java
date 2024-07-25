package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.sms.PurposeType;
import com.volcengine.model.sms.SignAuthFile;
import com.volcengine.model.sms.SignSourceType;
import lombok.Data;

import java.util.List;

@Data
public class ApplySmsSignatureRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "content")
    String content;

    @JSONField(name = "source")
    SignSourceType source;

    @JSONField(name = "desc")
    String desc;

    @JSONField(name = "uploadFileKey")
    String uploadFileKey;

    @JSONField(name = "domain")
    String domain;

    /**
     * 1.自用，2.他用
     */
    @JSONField(name = "purpose")
    PurposeType purpose;

    @JSONField(name = "uploadFileList")
    List<SignAuthFile> uploadFileList;

    @JSONField(name = "from")
    String from;

    @JSONField(name = "signatureIdentificationID")
    int signatureIdentificationID;
}
