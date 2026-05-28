package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowQueryParams {
    @JSONField(name = ASC)
    private Boolean asc;
    @JSONField(name = LIMIT)
    private Integer limit;
    @JSONField(name = ORDER)
    private String order;
    @JSONField(name = FIELDS)
    private List<LogBackFlowQueryField> fields;
    @JSONField(name = FILTERS)
    private List<LogBackFlowQueryFilter> filters;
}
