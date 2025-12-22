package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteTraceInstanceRequest;
import com.volcengine.model.tls.response.DeleteTraceInstanceResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DeleteTraceInstanceTest extends BaseTest {
    @Test
    public void testDeleteTraceInstance() throws Exception {
        // 创建测试用的Trace实例ID
        String traceInstanceId = "test-trace-instance-id";
        
        DeleteTraceInstanceRequest request = new DeleteTraceInstanceRequest();
        request.setTraceInstanceId(traceInstanceId);
        
        try {
            DeleteTraceInstanceResponse response = client.deleteTraceInstance(request);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            // 处理异常情况，如Trace实例不存在等
            System.out.println("Delete trace instance failed: " + e.getMessage());
            // 在实际测试中，可以根据错误码进行不同的断言
            if (e.getErrorCode().equals("InvalidArgument")) {
                // 参数验证失败
                assertNotNull(e.getMessage());
            } else if (e.getErrorCode().equals("ResourceNotFound")) {
                // Trace实例不存在
                assertNotNull(e.getMessage());
            } else {
                // 其他错误
                throw e;
            }
        }
    }
    
    @Test
    public void testDeleteTraceInstanceWithNullRequest() throws Exception {
        try {
            client.deleteTraceInstance(null);
        } catch (LogException e) {
            assertNotNull(e.getMessage());
            assertNotNull(e.getErrorCode());
        }
    }
    
    @Test
    public void testDeleteTraceInstanceWithEmptyTraceInstanceId() throws Exception {
        DeleteTraceInstanceRequest request = new DeleteTraceInstanceRequest();
        request.setTraceInstanceId("");
        
        try {
            client.deleteTraceInstance(request);
        } catch (LogException e) {
            assertNotNull(e.getMessage());
            assertNotNull(e.getErrorCode());
        }
    }
}