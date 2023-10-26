package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
@Data
public class GetListResponseV2 {
    @JSONField(name = "ResponseMetadata")
    CommonPoV2.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<Result> result;

    @Data
    public static class Result {
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

        @JSONField(name = "ArticleClassification")
        List<List<String>> articleClassification;
        @JSONField(name = "IsStick")
        boolean isStick;
        @JSONField(name = "FilterWords")
        List<FilterWord> filterWords;
        @JSONField(name = "HotBoardEventUrl")
        String hotBoardEventUrl;
        @JSONField(name = "HotBoardEventImageList")
        CommonPoV2.ImageUrl hotBoardEventImageList;
        @JSONField(name = "HotBoardEventSubDesc")
        String hotBoardEventSubDesc;
        @JSONField(name = "HotBoardEventDesc")
        String hotBoardEventDesc;
        @JSONField(name = "DataSource")
        String dataSource;
        @JSONField(name = "ProductUnion")
        List<UnionProduct> productUnion;
    }

    @Data
    public static class FilterWord {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
    }

    @Data
    public static class UnionProduct {
        @JSONField(name = "ProductId")
        String productId;
        @JSONField(name = "ProductType")
        String productType;
        @JSONField(name = "UnionReason")
        String unionReason;
        @JSONField(name = "ProductExtra")
        String productExtra;
    }
}
