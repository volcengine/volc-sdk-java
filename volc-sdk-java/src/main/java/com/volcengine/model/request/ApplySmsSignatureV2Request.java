package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.sms.*;
import lombok.Data;

import java.util.List;

@Data
public class ApplySmsSignatureV2Request {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "content")
    String content;

    @JSONField(name = "source")
    SignSourceTypeV2 source;

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

    @JSONField(name = "appIcp")
    AppIcp appIcp;

    @JSONField(name = "trademark")
    Trademark trademark;

    @JSONField(name = "scene")
    String Scene;
}
