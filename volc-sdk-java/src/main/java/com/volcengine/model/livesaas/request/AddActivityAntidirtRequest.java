package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AddActivityAntidirtRequest {
    // 添加直播间敏感词内容
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "WordList")
    List<String> WordList;
}