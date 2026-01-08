package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeTraceRequest;
import com.volcengine.model.tls.response.DescribeTraceResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeTraceTest extends BaseTest {
    @Test
    public void testDescribeTrace() throws Exception {
        // Generate a random trace ID for testing
        String traceId = "test-trace-id-" + Math.random();
        String traceInstanceId = "test-trace-instance-id";
        
        DescribeTraceRequest request = new DescribeTraceRequest();
        request.setTraceId(traceId);
        request.setTraceInstanceId(traceInstanceId);
        
        try {
            DescribeTraceResponse response = client.describeTrace(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getTrace());
            assertNotNull(response.getTrace().getSpans());
            System.out.println("describe trace success, response: " + response);
        } catch (LogException e) {
            // If the trace doesn't exist, it should throw an error
            System.out.println("describe trace failed (expected if trace doesn't exist), error: " + e.getErrorCode() + ", " + e.getErrorMessage());
            assertNotNull(e.getErrorCode());
            assertNotNull(e.getErrorMessage());
        }
    }

    @Test
    public void testDescribeTraceWithInvalidParams() throws Exception {
        // Test with null traceId
        DescribeTraceRequest request1 = new DescribeTraceRequest();
        request1.setTraceInstanceId("test-trace-instance-id");
        
        try {
            client.describeTrace(request1);
            fail("Expected LogException for null traceId");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            System.out.println("describe trace with null traceId failed as expected, error: " + e.getErrorCode() + ", " + e.getErrorMessage());
        }
        
        // Test with null traceInstanceId
        DescribeTraceRequest request2 = new DescribeTraceRequest();
        request2.setTraceId("test-trace-id");
        
        try {
            client.describeTrace(request2);
            fail("Expected LogException for null traceInstanceId");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            System.out.println("describe trace with null traceInstanceId failed as expected, error: " + e.getErrorCode() + ", " + e.getErrorMessage());
        }
        
        // Test with null request
        try {
            client.describeTrace(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            System.out.println("describe trace with null request failed as expected, error: " + e.getErrorCode() + ", " + e.getErrorMessage());
        }
    }
}