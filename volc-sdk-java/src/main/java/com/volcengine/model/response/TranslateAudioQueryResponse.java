package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * 音视频翻译-查询结果响应
 *
 * {
 *     "Subtitles": [
 *         {
 *             "StartTime": 0,
 *             "EndTime": 1000,
 *             "Text": "Hello",
 *             "Translation": "你好"
 *         }
 *     ],
 *     "Status": "success",
 *     "ResponseMetadata": {
 *         "RequestId": "202004092306480100140440781F5D7119",
 *         "Action": "TranslateText",
 *         "Version": "2020-06-01",
 *         "Service": "translate",
 *         "Region": "cn-north-1",
 *         "Error": null
 *     }
 * }
 */
@Data
public class TranslateAudioQueryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Status")
    String status;
    @JSONField(name = "Confidence")
    Double confidence;
    @JSONField(name = "Subtitles")
    List<Subtitle> subtitles;

    @Data
    public static class Subtitle {
        @JSONField(name = "StartTime")
        Integer startTime;
        @JSONField(name = "EndTime")
        Integer endTime;
        @JSONField(name = "Text")
        String text;
        @JSONField(name = "Translation")
        String translation;
    }
}
