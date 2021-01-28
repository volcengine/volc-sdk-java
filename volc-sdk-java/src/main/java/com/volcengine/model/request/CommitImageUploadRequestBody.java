package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.Functions;
import com.volcengine.model.beans.ImageOption;
import lombok.Data;

import java.util.List;

@Data
public class CommitImageUploadRequestBody {
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "Functions")
    List<Functions> functions;
    @JSONField(name = "OptionInfos")
    List<ImageOption> optionInfos;
}
