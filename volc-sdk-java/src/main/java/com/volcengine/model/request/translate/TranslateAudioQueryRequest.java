package com.volcengine.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 音视频翻译-查询结果请求
 *
 * {
 *     "TaskId": "xxx"
 * }
 */
@Data
public class TranslateAudioQueryRequest {
    @JSONField(name = "TaskId")
    String taskId;
}
