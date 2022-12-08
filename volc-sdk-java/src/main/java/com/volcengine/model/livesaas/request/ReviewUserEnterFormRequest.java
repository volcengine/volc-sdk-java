package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ReviewUserEnterFormRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "UserFormIDList")
    List<Long> UserFormIDList;
    @JSONField(name = "ReviewStatus")
    Integer ReviewStatus;
}