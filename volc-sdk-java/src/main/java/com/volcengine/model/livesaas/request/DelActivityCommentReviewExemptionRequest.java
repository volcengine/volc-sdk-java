package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DelActivityCommentReviewExemptionRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "WordList")
    List<String> WordList;
    @JSONField(name = "DeleteAll")
    Boolean DeleteAll;
}
