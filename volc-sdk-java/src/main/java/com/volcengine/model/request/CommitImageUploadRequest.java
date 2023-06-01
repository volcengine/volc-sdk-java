package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.Functions;
import com.volcengine.model.beans.ImageOption;
import lombok.Data;

import java.util.List;

@Data
public class CommitImageUploadRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "SuccessOids")
    List<String> successOids;
    @JSONField(name = "Functions")
    List<Functions> functions;
    @JSONField(name = "OptionInfos")
    List<ImageOption> optionInfos;
    @JSONField(name = "SkipMeta")
    Boolean skipMeta;
}
