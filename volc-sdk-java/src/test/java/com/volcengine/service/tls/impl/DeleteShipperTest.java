package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteShipperRequest;
import com.volcengine.model.tls.response.DeleteShipperResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DeleteShipperTest extends BaseTest {
    @Test
    public void testDeleteShipper() throws Exception {
        // 创建测试用的投递配置ID
        String shipperId = "test-shipper-" + System.currentTimeMillis();
        
        DeleteShipperRequest request = new DeleteShipperRequest();
        request.setShipperId(shipperId);
        
        try {
            DeleteShipperResponse response = client.deleteShipper(request);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            // 处理异常情况，如投递配置不存在等
            System.out.println("Delete shipper failed: " + e.getMessage());
            // 在实际测试中，可以根据错误码进行不同的断言
            if (e.getErrorCode().equals("InvalidArgument")) {
                // 参数验证失败
                assertNotNull(e.getMessage());
            } else if (e.getErrorCode().equals("ResourceNotFound")) {
                // 投递配置不存在
                assertNotNull(e.getMessage());
            } else {
                // 其他错误
                throw e;
            }
        }
    }
    
    @Test
    public void testDeleteShipperWithNullRequest() throws Exception {
        try {
            client.deleteShipper(null);
        } catch (LogException e) {
            assertNotNull(e.getMessage());
            assertNotNull(e.getErrorCode());
        }
    }
    
    @Test
    public void testDeleteShipperWithEmptyShipperId() throws Exception {
        DeleteShipperRequest request = new DeleteShipperRequest();
        request.setShipperId("");
        
        try {
            client.deleteShipper(request);
        } catch (LogException e) {
            assertNotNull(e.getMessage());
            assertNotNull(e.getErrorCode());
        }
    }
}