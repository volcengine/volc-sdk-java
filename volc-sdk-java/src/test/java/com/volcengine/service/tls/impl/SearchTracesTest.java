package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTracesTest extends BaseTest {
    @Test
    public void testSearchTraces() throws Exception {
        String projectId = "d0b016d4-5ba0-454d-bd87-2d7cabf78cab";
        String random1 = String.valueOf((int)(Math.random() * 100));
        String random2 = String.valueOf((int)(Math.random() * 100));
        String traceName = "单元测试" + random1 + "-" + random2;

        // Create a trace instance first
        CreateTraceInstanceRequest createRequest = new CreateTraceInstanceRequest();
        createRequest.setProjectId(projectId);
        createRequest.setTraceInstanceName(traceName);
        
        CreateTraceInstanceResponse createResponse = client.createTraceInstance(createRequest);
        assertNotNull(createResponse.getRequestId());
        assertNotNull(createResponse.getTraceInstanceId());
        
        String traceInstanceId = createResponse.getTraceInstanceId();

        try {
            // Search traces with basic query
            SearchTracesRequest searchRequest = new SearchTracesRequest();
            searchRequest.setTraceInstanceId(traceInstanceId);
            
            TraceQueryParameters query = new TraceQueryParameters();
            query.setLimit(10);
            query.setOffset(0);
            searchRequest.setQuery(query);
            
            SearchTracesResponse searchResponse = client.searchTraces(searchRequest);
            assertNotNull(searchResponse.getRequestId());
            assertNotNull(searchResponse.getTotal());
            assertNotNull(searchResponse.getTraceInfos());
            
        } finally {
            // Clean up
            DeleteTraceInstanceRequest deleteRequest = new DeleteTraceInstanceRequest();
            deleteRequest.setTraceInstanceId(traceInstanceId);
            client.deleteTraceInstance(deleteRequest);
        }
    }
}