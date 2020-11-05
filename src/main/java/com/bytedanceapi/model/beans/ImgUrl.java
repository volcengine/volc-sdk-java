package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ImgUrl {
    @JSONField(name = "MainUrl")
    String mainUrl;
    @JSONField(name = "BackupUrl")
    String backupUrl;
}
