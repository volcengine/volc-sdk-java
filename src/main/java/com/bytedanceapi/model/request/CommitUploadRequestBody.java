package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedanceapi.model.beans.Functions;
import com.bytedanceapi.model.beans.ImageOption;
import lombok.Data;

import java.util.List;

@Data
public class CommitUploadRequestBody {
    @JSONField(name = "CallbackArgs")
    String callbackArgs;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "Functions")
    List<Functions> functions;
    @JSONField(name = "OptionInfos")
    List<ImageOption> optionInfos;
}
