package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListUserQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListUserQuestionnaireResponseBody result;

    @Data
    public static class ListUserQuestionnaireResponseBody {
        @JSONField(name = "Questions")
        List<Question> Questions;
        @JSONField(name = "Questionnaires")
        List<QuestionAnswers> Questionnaires;
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class Question {
        @JSONField(name = "QuestionId")
        Long QuestionId;
        @JSONField(name = "Question")
        String Question;
        @JSONField(name = "IsRequire")
        Integer IsRequire;
        @JSONField(name = "QuestionTag")
        String QuestionTag;
        @JSONField(name = "QuestionSubTag")
        String QuestionSubTag;
        @JSONField(name = "Options")
        List<Option> Options;
    }

    @Data
    public static class QuestionAnswers {
        @JSONField(name = "QuestionAnswers")
        List<QuestionAnswer> QuestionAnswers;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "UserInfo")
        PlayUserInfo UserInfo;
    }

    @Data
    public static class Option {
        @JSONField(name = "OptionId")
        Long OptionId;
        @JSONField(name = "OptionName")
        String OptionName;
    }

    @Data
    public static class QuestionAnswer {
        @JSONField(name = "QuestionId")
        Long QuestionId;
        @JSONField(name = "Question")
        String Question;
        @JSONField(name = "Answer")
        String Answer;
    }

    @Data
    public static class PlayUserInfo {
        @JSONField(name = "Province")
        String Province;
        @JSONField(name = "UserId")
        String UserId;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Telephone")
        String Telephone;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "Country")
        String Country;
    }
}