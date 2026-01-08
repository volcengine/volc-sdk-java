package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeShipperRequest;
import com.volcengine.model.tls.response.DescribeShipperResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeShipperTest extends BaseTest {
    @Test
    public void testDescribeShipper() throws Exception {
        // Since we don't have shipper creation APIs implemented yet, we'll test the error case
        String shipperId = "test-shipper-" + System.currentTimeMillis();

        try {
            DescribeShipperRequest request = new DescribeShipperRequest(shipperId);
            DescribeShipperResponse response = client.describeShipper(request);
            // If we get here, the shipper somehow exists, which is unexpected for this test
            fail("Expected describeShipper to throw an error for non-existent shipper");
        } catch (LogException e) {
            // We expect this to fail since the shipper doesn't exist
            assertNotNull(e);
        }
    }

    @Test
    public void testDescribeShipperWithNullRequest() {
        Exception exception = assertThrows(LogException.class, () -> {
            client.describeShipper(null);
        });
        assertNotNull(exception);
    }

    @Test
    public void testDescribeShipperWithEmptyShipperId() {
        Exception exception = assertThrows(LogException.class, () -> {
            DescribeShipperRequest request = new DescribeShipperRequest("");
            client.describeShipper(request);
        });
        assertNotNull(exception);
    }
}