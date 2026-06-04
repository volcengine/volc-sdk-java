package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class LiveAnalysisOverview {
    @JSONField(name = "OverallScore")
    OverallScore OverallScore;
    @JSONField(name = "DimensionScore")
    DimensionScore DimensionScore;
    @JSONField(name = "LiveSuggestions")
    LiveSuggestions LiveSuggestions;
    @JSONField(name = "LiveTime")
    Long LiveTime;
    @JSONField(name = "IndustryLiveTime")
    Long IndustryLiveTime;
    @JSONField(name = "WordsPerMinute")
    Long WordsPerMinute;
    @JSONField(name = "IndustryAvgWordsPerMinute")
    Long IndustryAvgWordsPerMinute;
    @JSONField(name = "WordsPerSentence")
    Long WordsPerSentence;
    @JSONField(name = "IndustryAvgWordsPerSentence")
    Long IndustryAvgWordsPerSentence;
    @JSONField(name = "AvgWatchDuration")
    Long AvgWatchDuration;
    @JSONField(name = "AvgViewDuration")
    Long AvgViewDuration;
    @JSONField(name = "WatchUV")
    Long WatchUV;
    @JSONField(name = "ViewUV")
    Long ViewUV;
    @JSONField(name = "PeakWatchUV")
    Long PeakWatchUV;
    @JSONField(name = "PeakViewUV")
    Long PeakViewUV;
    @JSONField(name = "InviteCount")
    Long InviteCount;
    @JSONField(name = "AvgInviteUsers")
    Double AvgInviteUsers;
    @JSONField(name = "ThumbUpCount")
    Long ThumbUpCount;
    @JSONField(name = "ThumbUpRate")
    Double ThumbUpRate;
    @JSONField(name = "CommentCount")
    Long CommentCount;
    @JSONField(name = "CommentRate")
    Double CommentRate;
    @JSONField(name = "ProductClickCount")
    Long ProductClickCount;
    @JSONField(name = "ProductClickRate")
    Double ProductClickRate;

    @Data
    public static class OverallScore {
        @JSONField(name = "TotalGrade")
        String TotalGrade;
        @JSONField(name = "TotalComment")
        String TotalComment;
        @JSONField(name = "TotalScore")
        Long TotalScore;
    }

    @Data
    public static class ScoreItem {
        @JSONField(name = "Score")
        Long Score;
        @JSONField(name = "AvgIndustryScore")
        Long AvgIndustryScore;
        @JSONField(name = "Evaluation")
        String Evaluation;
    }

    @Data
    public static class DimensionScore {
        @JSONField(name = "AudienceRetentionRating")
        ScoreItem AudienceRetentionRating;
        @JSONField(name = "InteractionAtmosphereRating")
        ScoreItem InteractionAtmosphereRating;
        @JSONField(name = "ContentPlanningRating")
        ScoreItem ContentPlanningRating;
        @JSONField(name = "ConversionEffectRating")
        ScoreItem ConversionEffectRating;
        @JSONField(name = "HostPerformanceRating")
        ScoreItem HostPerformanceRating;
    }

    @Data
    public static class DimensionInsight {
        @JSONField(name = "DimensionName")
        String DimensionName;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Type")
        Integer Type;
        @JSONField(name = "Summary")
        String Summary;
    }

    @Data
    public static class LiveSuggestions {
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "SummaryText")
        String SummaryText;
        @JSONField(name = "Insights")
        List<DimensionInsight> Insights;
    }
}
