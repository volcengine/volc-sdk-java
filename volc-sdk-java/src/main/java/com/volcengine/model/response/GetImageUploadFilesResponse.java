package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageUploadFilesResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageUploadFilesResponseBean result;

    @Data
    static public class GetImageUploadFilesResponseBean {
        @JSONField(name = "ServiceId")
        private String serviceId;

        @JSONField(name = "Status")
        private String status;

        @JSONField(name = "hasMore")
        private Boolean hasMore;

        @JSONField(name = "FileObjects")
        private List<FileObject> fileObjects;
    }

    @Data
    static public class FileObject {
        @JSONField(name = "StoreUri")
        private String storeUri;

        @JSONField(name = "Key")
        private String key;

        @JSONField(name = "LastModified")
        private String lastModified;

        @JSONField(name = "FileSize")
        private Integer fileSize;

        @JSONField(name = "Marker")
        private Long marker;
    }
}
