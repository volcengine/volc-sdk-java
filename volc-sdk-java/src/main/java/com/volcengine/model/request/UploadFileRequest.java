package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UploadFileRequest {
    @JSONField(name = "app_id")
    private Long appId;
    @JSONField(name = "upload_id")
    private String uploadId;
    @JSONField(name = "part_size")
    private Integer partSize;
    @JSONField(name = "content")
    private byte[] content;
    @JSONField(name = "part_num")
    private Integer partNum;
    @JSONField(name = "file_name")
    private String fileName;


}
