package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageCompressTaskReqFile {
    @JSONField(name = "Url")
    String url;

    @JSONField(name = "Alias")
    String alias;

    @JSONField(name = "Folder")
    String folder;
}
