package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeProjectsRequest {
    //start from 1 default 1
    Integer pageNumber;
    //default 20 max 100
    Integer pageSize;
    /**
     * project id and name in request only accept one,not support
     * query by project id and name at same time
     */
    String projectId;
    String projectName;
    /**
     * when query by project name it affects,true means exact match and
     * false means fuzzy match
     */
    Boolean isFullName;
}
