package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ActiveTlsAccountRequest;
import com.volcengine.model.tls.response.ActiveTlsAccountResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActiveTlsAccountTest extends BaseTest {
    
    @Test
    public void testActiveTlsAccount() throws Exception {
        ActiveTlsAccountRequest request = new ActiveTlsAccountRequest();
        
        try {
            ActiveTlsAccountResponse response = client.activeTlsAccount(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response);
        } catch (LogException e) {
            // 处理异常情况
            assertNotNull(e.getMessage());
        }
    }
}