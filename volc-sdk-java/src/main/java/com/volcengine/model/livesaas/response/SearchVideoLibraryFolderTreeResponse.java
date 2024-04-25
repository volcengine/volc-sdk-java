package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class SearchVideoLibraryFolderTreeResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SearchVideoLibraryFolderTreeResponseBody result;

    @Data
    public static class SearchVideoLibraryFolderTreeResponseBody {
        @JSONField(name = "Result")
        List<SearchFolderItemAPI> Result;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
    }

    @Data
    public static class SearchFolderItemAPI {
        @JSONField(name = "FolderId")
        Long FolderId;
        @JSONField(name = "FolderName")
        String FolderName;
    }
}