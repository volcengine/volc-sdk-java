package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateImageTranscodeTaskReq {

    @JSONField(name = "QueueId")
    String queueId;

    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "Template")
    String template;

    @JSONField(name = "DataType")
    String dataType;
    
    @JSONField(name = "DataList")
    List<String> dataList;

    @JSONField(name = "FileList")
    List<String> fileList;

    @JSONField(name = "CallbackConf")
    CreateImageTranscodeTaskCallbackConf callbackConf;

    @JSONField(name = "ResKeyList")
    List<String> resKeyList;

    @JSONField(name = "EnableExif")
    Boolean enableExif;

    @JSONField(name = "Region")
    String region;
}

