package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AISearchResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPoV2.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "ReqID")
        String reqId;
        @JSONField(name = "SearchID")
        String searchID;
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Offset")
        int offset;
        @JSONField(name = "Data")
        List<ResultItem> data;
    }

    @Data
    public static class ResultItem {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "SourceType")
        String sourceType;
        @JSONField(name = "ContentSource")
        String contentSource;
        @JSONField(name = "SearchDocID")
        String searchDocID;
        @JSONField(name = "PageData")
        PageData pageData;
        @JSONField(name = "ArticleData")
        ArticleData articleData;
        @JSONField(name = "RuyiData")
        RuyiData ruyiData;
        @JSONField(name = "AskAIData")
        AskAIData askAIData;
        @JSONField(name = "BaikeData")
        BaikeData baikeData;
        @JSONField(name = "CollectionCardData")
        List<ResultItem> collectionCardData;
    }


    @Data
    public static class ArticleData {
        @JSONField(name = "GroupId")
        long groupId;
        @JSONField(name = "GroupIDStr")
        String groupIDStr;
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "ArticleType")
        long articleType;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "ArticleURL")
        String articleURL;
        @JSONField(name = "CommentURL")
        String commentURL;
        @JSONField(name = "ShareURL")
        String shareURL;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "VideoID")
        String videoID;
        @JSONField(name = "VideoDuration")
        long videoDuration;
        @JSONField(name = "VideoWatchCount")
        long videoWatchCount;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "CoverImageList")
        List<CommonPoV2.ImageUrl> coverImageList;
        @JSONField(name = "UserInfo")
        CommonPoV2.UserInfo userInfo;
        @JSONField(name = "VideoDetail")
        CommonPoV2.VideoDetail videoDetail;
    }

    @Data
    public static class PageData {
        @JSONField(name = "DocID")
        String docID;
        @JSONField(name = "SiteName")
        String siteName;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Summary")
        String summary;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "LogoURL")
        String logoURL;
        @JSONField(name = "CoverImage")
        CommonPoV2.ImageUrl coverImage;
    }

    @Data
    public static class RuyiData {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "AlaSrc")
        String alaSrc;
        @JSONField(name = "CardData")
        String cardData;
    }

    @Data
    public static class AskAIData {
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "BotID")
        String botID;
        @JSONField(name = "BotName")
        String botName;
        @JSONField(name = "SessionID")
        String sessionID;
        @JSONField(name = "Stream")
        boolean stream;
    }

    @Data
    public static class BaikeData {
        @JSONField(name = "DocID")
        String docID;
        @JSONField(name = "SiteName")
        String siteName;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Summary")
        String summary;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "BaikeCard")
        BaikeCardItem baikeCard;
    }

    @Data
    public static class BaikeCardItem {
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Subtitle")
        String subtitle;
        @JSONField(name = "AbstractPlainText")
        String abstractPlainText;
        @JSONField(name = "WikiURL")
        String wikiURL;
        @JSONField(name = "HeadImage")
        CommonPoV2.ImageUrl headImage;
        @JSONField(name = "CategoryItemList")
        String categoryItemList;
        @JSONField(name = "DocQualityLevel")
        String docQualityLevel;
    }
}
