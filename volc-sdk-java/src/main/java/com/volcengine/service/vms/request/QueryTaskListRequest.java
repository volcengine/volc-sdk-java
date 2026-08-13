package com.volcengine.service.vms.request;

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
public class QueryTaskListRequest {
    @JSONField(name = "Keyword")
    private String keyword;

    @JSONField(name = "State")
    private List<Integer> state;

    @JSONField(name = "ResourceType")
    private Integer resourceType;

    @JSONField(name = "Resource")
    private String resource;

    @JSONField(name = "Phone")
    private String phone;

    @Builder.Default
    @JSONField(name = "Limit")
    private Integer limit = 10;

    @Builder.Default
    @JSONField(name = "Offset")
    private Integer offset = 0;
}
