package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.pb.PutLogRequest;
import lombok.Data;

@Data
public class GetUploadIdRequest {
    @JSONField(name = "app_id")
    private Long appId;
    @JSONField(name = "file_name")
    private String fileName;
    @JSONField(name = "file_hash")
    private String fileHash;
    @JSONField(name = "part_size")
    private Integer partSize;
}
