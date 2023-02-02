package com.volcengine.service.sercretnumber.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryAudioRecordToTextFileRequest {

    @JSONField(name = "CallIdList")
    private String callIdList;
}
