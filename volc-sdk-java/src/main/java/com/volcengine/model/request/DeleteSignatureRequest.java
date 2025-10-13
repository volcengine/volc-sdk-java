package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteSignatureRequest {
    @JSONField(name = "SubAccounts")
    List<String> subAccounts;

    @JSONField(name = "Id")
    Long id;

    @JSONField(name = "IsOrder")
    boolean isOrder;
}
