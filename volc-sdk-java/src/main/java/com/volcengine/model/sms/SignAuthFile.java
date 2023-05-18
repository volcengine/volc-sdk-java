package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.service.sms.SourceType;
import lombok.Data;

@Data
public class SignAuthFile {
    /**
     * key是docType
     */
    @JSONField(name = "fileType")
    private DocType fileType;

    /**
     * val是图片list（火山控制台直接传图片 url）
     */
    @JSONField(name = "fileContent")
    private String fileContent;

    /**
     * 文件格式（后缀）
     */
    @JSONField(name = "fileSuffix")
    private String fileSuffix;

    public SignAuthFile() {
    }

    public SignAuthFile(DocType fileType, String fileContent, String fileSuffix) {
        this.fileContent = fileContent;
        this.fileSuffix = fileSuffix;
        this.fileType = fileType;
    }
}
