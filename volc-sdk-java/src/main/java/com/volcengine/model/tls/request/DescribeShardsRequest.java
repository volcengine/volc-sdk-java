package com.volcengine.model.tls.request;

import lombok.Data;

@Data
public class DescribeShardsRequest {
    private String topicId;
    private Integer pageNumber;
    private Integer pageSize;

    public DescribeShardsRequest(String topicId, int pageNumber, int pageSize) {
        this.topicId = topicId;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public DescribeShardsRequest() {
    }

}
