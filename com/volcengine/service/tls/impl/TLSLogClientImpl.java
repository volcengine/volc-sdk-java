package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.requests.DescribeIndexRequest;
import com.volcengine.model.tls.response.DescribeIndexResponse;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSLogClient;

public class TLSLogClientImpl implements TLSLogClient {
    
    @Override
    public DescribeIndexResponse describeIndex(DescribeIndexRequest request) throws LogException {
        // 实现逻辑
        return new DescribeIndexResponse(null);
    }
}