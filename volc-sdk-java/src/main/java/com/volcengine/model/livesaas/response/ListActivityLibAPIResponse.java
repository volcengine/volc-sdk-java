package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListActivityLibAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityLibAPIResponseModel result;

    @Data
    public static class ListActivityLibAPIResponseModel {
        @JSONField(name = "Pagination")
        Pagination Pagination;
        @JSONField(name = "Data")
        List<Media> Data;
    }

    @Data
    public static class Pagination {
        @JSONField(name = "PageNum")
        Integer PageNum;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
    }

    @Data
    public static class Media {
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "MediaVideoDuration")
        Integer MediaVideoDuration;
        @JSONField(name = "SourceType")
        Integer SourceType;
        @JSONField(name = "Vid")
        String Vid;
        @JSONField(name = "CreateTime")
        String CreateTime;
        @JSONField(name = "FailureTime")
        String FailureTime;
        @JSONField(name = "Id")
        String Id;
        @JSONField(name = "MediaLibraryVideoType")
        Integer MediaLibraryVideoType;
        @JSONField(name = "UpdateTime")
        String UpdateTime;
        @JSONField(name = "Creator")
        String Creator;
        @JSONField(name = "ActivityVideo")
        List<Info> ActivityVideo;
        @JSONField(name = "MediaSize")
        Long MediaSize;
        @JSONField(name = "MediaName")
        String MediaName;
        @JSONField(name = "ReviewStatus")
        Integer ReviewStatus;
        @JSONField(name = "VideoWidth")
        Long VideoWidth;
        @JSONField(name = "VideoHeight")
        Long VideoHeight;
        @JSONField(name = "FolderName")
        String FolderName;
        @JSONField(name = "FolderId")
        Long FolderId;
    }

    @Data
    public static class Info {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Name")
        String Name;
    }
}