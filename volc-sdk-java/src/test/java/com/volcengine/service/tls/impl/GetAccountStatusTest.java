package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.GetAccountStatusRequest;
import com.volcengine.model.tls.response.GetAccountStatusResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetAccountStatusTest extends BaseTest {

    @Test
    public void testGetAccountStatus() throws Exception {
        GetAccountStatusRequest request = new GetAccountStatusRequest();
        try {
            GetAccountStatusResponse response = client.getAccountStatus(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getArchVersion());
            assertNotNull(response.getStatus());
            
            // 验证返回的字段符合预期
            assertTrue("ArchVersion should be either 1.0 or 2.0", 
                response.getArchVersion().equals("1.0") || response.getArchVersion().equals("2.0"));
            assertTrue("Status should be either Activated or NonActivated", 
                response.getStatus().equals("Activated") || response.getStatus().equals("NonActivated"));
                
        } catch (LogException e) {
            fail("GetAccountStatus should not throw exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetAccountStatusWithNullRequest() {
        try {
            client.getAccountStatus(null);
            fail("Should throw LogException when request is null");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            assertTrue(e.getMessage().contains("Invalid request"));
        }
    }
}