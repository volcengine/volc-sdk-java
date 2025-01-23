package com.volcengine.service.vikingDB.common;

import lombok.Data;

import java.util.Map;

@Data
public class SearchAggResult {
    private String aggOp;
    private String groupByField;
    private Map<String, Object> aggResult;
}
