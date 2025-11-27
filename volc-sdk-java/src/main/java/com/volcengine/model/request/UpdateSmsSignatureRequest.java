package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.sms.*;
import lombok.Data;

import java.util.List;

@Data
public class UpdateSmsSignatureRequest {

    @JSONField(name = "content")
    String content;

    @JSONField(name = "source")
    SignSourceTypeV2 source;

    @JSONField(name = "desc")
    String desc;


    @JSONField(name = "domain")
    String domain;

    /**
     * 1.自用，2.他用
     */
    @JSONField(name = "purpose")
    PurposeType purpose;

    @JSONField(name = "uploadFileList")
    List<SignAuthFile> uploadFileList;

    @JSONField(name = "appIcp")
    AppIcp appIcp;

    @JSONField(name = "trademark")
    Trademark trademark;


    @JSONField(name = "signatureIdentificationID")
    long signatureIdentificationID;

    @JSONField(name = "scene")
    String scene;

    @JSONField(name = "subAccounts")
    List<String> subAccounts;

    @JSONField(name = "channelTypes")
    List<String> channelTypes;

    @JSONField(name = "updateType")
    int updateType;
}
