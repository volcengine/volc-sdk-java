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
     * 图片的base64内容
     */
    @JSONField(name = "fileContent")
    private String fileContent;

    /**
     * 文件格式（后缀）
     */
    @JSONField(name = "fileSuffix")
    private String fileSuffix;

    /**
     * 上传图片的url
     */
    @JSONField(name = "fileUrl")
    private String fileUrl;

    public SignAuthFile() {
    }

    public SignAuthFile(DocType fileType, String fileContent, String fileSuffix) {
        this.fileContent = fileContent;
        this.fileSuffix = fileSuffix;
        this.fileType = fileType;
    }

    public SignAuthFile(DocType fileType, String fileContent, String fileSuffix, String fileUrl) {
        this.fileContent = fileContent;
        this.fileSuffix = fileSuffix;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
    }
}
