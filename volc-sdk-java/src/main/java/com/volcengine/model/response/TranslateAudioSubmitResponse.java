package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 音视频翻译-提交任务响应
 *
 * {
 *     "TaskId": "xxx",
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
public class TranslateAudioSubmitResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "TaskId")
    String taskId;
}
