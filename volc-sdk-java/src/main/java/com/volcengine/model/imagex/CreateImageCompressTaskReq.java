package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateImageCompressTaskReq {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "FileList")
    List<CreateImageCompressTaskReqFile> fileList;

    @JSONField(name = "IndexFile")
    String indexFile;

    @JSONField(name = "Output")
    String output;

    @JSONField(name = "ZipMode")
    Integer zipMode;

    @JSONField(name = "Callback")
    String callback;
}
