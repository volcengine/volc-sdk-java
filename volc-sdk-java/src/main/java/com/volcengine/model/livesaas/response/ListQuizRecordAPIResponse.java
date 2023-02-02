package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class ListQuizRecordAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListQuizRecordAPIResponseBody result;

    @Data
    public static class ListQuizRecordAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "QuizStatisticsList")
        List<QuizRecordAPI> QuizStatisticsList;
    }

    @Data
    public static class QuizRecordAPI {
        @JSONField(name = "UserID")
        Long UserID;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "SubmitOptions")
        List<String> SubmitOptions;
        @JSONField(name = "IsRight")
        Boolean IsRight;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "Extra")
        String Extra;
    }
}