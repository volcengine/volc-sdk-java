package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryResourceRequest {
    @JSONField(name = "Type")
    private Integer type;

    @JSONField(name = "Keyword")
    private String keyword;

    @JSONField(name = "State")
    private Integer state;

    @JSONField(name = "Limit")
    private Integer limit;

    @JSONField(name = "Offset")
    private Integer offset;
}
