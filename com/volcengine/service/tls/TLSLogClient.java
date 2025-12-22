package com.volcengine.service.tls;

import com.volcengine.model.tls.requests.DescribeIndexRequest;
import com.volcengine.model.tls.response.DescribeIndexResponse;
import com.volcengine.model.tls.exception.LogException;

public interface TLSLogClient {
    DescribeIndexResponse describeIndex(DescribeIndexRequest request) throws LogException;
}