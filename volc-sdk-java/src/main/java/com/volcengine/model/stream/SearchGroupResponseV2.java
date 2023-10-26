package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
@Data
public class SearchGroupResponseV2 {
    @JSONField(name = "ResponseMetadata")
    CommonPoV2.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "SearchId")
        String searchId;
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Data")
        List<GroupData> data;
    }

    @Data
    public static class GroupData {
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ArticleType")
        String articleType;
        @JSONField(name = "ArticleReadCount")
        long articleReadCount;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CoverImages")
        List<CommonPoV2.ImageUrl> coverImages;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "ContentImages")
        List<CommonPoV2.ImageUrl> contentImages;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "UserInfo")
        CommonPoV2.UserInfo userInfo;
        @JSONField(name = "VideoWatchCount")
        long videoWatchCount;
        @JSONField(name = "VideoDetail")
        CommonPoV2.VideoDetail videoDetail;
    }
}
