package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetUrlFetchTaskResponse {
    @JSONField(name = "Id")
    String Id;
    @JSONField(name = "Status")
    String Status;
    @JSONField(name = "Url")
    String Url;
    @JSONField(name = "StoreUri")
    String StoreUri;
    @JSONField(name = "Callback")
    String Callback;
    @JSONField(name = "CallbackBody")
    String CallbackBody;
    @JSONField(name = "CallbackBodyType")
    String CallbackBodyType;
    @JSONField(name = "Err")
    String Err;
    @JSONField(name = "Code")
    String Code;

}
