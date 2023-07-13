package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageTranscodeTaskCallbackConf {
    @JSONField(name = "Method")
    String method;

    @JSONField(name = "Endpoint")
    String endpoint;

    @JSONField(name = "DataFormat")
    String dataFormat;

    @JSONField(name = "Args")
    String args;
}
