package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetVideoLibraryFolderTreeResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVideoLibraryFolderTreeResponseBody result;

    @Data
    public static class GetVideoLibraryFolderTreeResponseBody {
        @JSONField(name = "FolderNode")
        FolderNodeAPI FolderNode;
    }

    @Data
    public static class FolderNodeAPI {
        @JSONField(name = "FolderId")
        Long FolderId;
        @JSONField(name = "FolderName")
        String FolderName;
        @JSONField(name = "Children")
        List<FolderNodeAPI> Children;
    }
}