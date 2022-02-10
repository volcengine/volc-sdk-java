package com.volcengine.service.notify.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchAppendRequest {
    @JSONField(name = "TaskOpenId")
    private String taskOpenId;

    @JSONField(name = "PhoneList")
    private List<PhoneParam> phoneList;
}
