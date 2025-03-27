package com.volcengine.model.request.vod;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.InputStream;
import java.util.List;

@Data
public class VodStreamUploadRequest {
    @JSONField(name = "SpaceName")
    String spaceName="";
    @JSONField(name = "Content")
    InputStream content;
    @JSONField(name = "FileType")
    String fileType="";
    @JSONField(name = "Size")
    Long Size=0L;
    @JSONField(name = "CallbackArgs")
    String callbackArgs="";
    @JSONField(name = "Functions")
    String functions="";
    @JSONField(name = "FileName")
    String fileName="";
    @JSONField(name = "StorageClass")
    Integer storageClass=0;
    @JSONField(name = "FileExtension")
    String fileExtension="";
    @JSONField(name = "VodUploadSource")
    String vodUploadSource="";
    @JSONField(name = "ClientNetWorkMode")
    String clientNetWorkMode="";
    @JSONField(name = "ClientIDCMode")
    String clientIDCMode="";
    @JSONField(name = "ExpireTime")
    String expireTime="";
    @JSONField(name = "UploadHostPrefer")
    String uploadHostPrefer="";
    @JSONField(name = "ChunkSize")
    Long chunkSize=0L;
}
