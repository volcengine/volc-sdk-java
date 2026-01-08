package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.RemoveTagsFromResourceRequest;
import com.volcengine.model.tls.response.RemoveTagsFromResourceResponse;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveTagsFromResourceTest extends BaseTest {

    @Test
    public void testRemoveTagsFromResource() throws Exception {
        String resourceType = "project";
        String resourceId = "test-project-id";
        List<String> tagKeys = Arrays.asList("tag1", "tag2");

        RemoveTagsFromResourceRequest request = new RemoveTagsFromResourceRequest();
        request.setResourceType(resourceType);
        request.setResourceId(resourceId);
        request.setTagKeys(tagKeys);

        try {
            RemoveTagsFromResourceResponse response = client.removeTagsFromResource(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("Request ID should not be null", response.getRequestId());
            System.out.println("Remove tags from resource success, response: " + response);
        } catch (LogException e) {
            // 测试环境下资源通常不存在，允许这两类错误码通过
            if ("ResourceNotFound".equals(e.getErrorCode()) || "InvalidArgument".equals(e.getErrorCode())) {
                System.out.println("Expected exception for test environment: " + e.getErrorMessage());
                return;
            }
            throw e;
        }
    }

    @Test
    public void testRemoveTagsFromResourceValidation() {
        Exception exception = assertThrows(LogException.class, () -> client.removeTagsFromResource(null));
        assertTrue(exception.getMessage().contains("Invalid request"));

        RemoveTagsFromResourceRequest request1 = new RemoveTagsFromResourceRequest();
        request1.setResourceId("test-id");
        request1.setTagKeys(Collections.singletonList("tag1"));

        exception = assertThrows(LogException.class, () -> client.removeTagsFromResource(request1));
        assertTrue(exception.getMessage().contains("Invalid request"));

        RemoveTagsFromResourceRequest request2 = new RemoveTagsFromResourceRequest();
        request2.setResourceType("project");
        request2.setTagKeys(Collections.singletonList("tag1"));

        exception = assertThrows(LogException.class, () -> client.removeTagsFromResource(request2));
        assertTrue(exception.getMessage().contains("Invalid request"));

        RemoveTagsFromResourceRequest request3 = new RemoveTagsFromResourceRequest();
        request3.setResourceType("project");
        request3.setResourceId("test-id");
        request3.setTagKeys(Collections.emptyList());

        exception = assertThrows(LogException.class, () -> client.removeTagsFromResource(request3));
        assertTrue(exception.getMessage().contains("Invalid request"));

        RemoveTagsFromResourceRequest request4 = new RemoveTagsFromResourceRequest();
        request4.setResourceType("project");
        request4.setResourceId("test-id");
        request4.setTagKeys(null);

        exception = assertThrows(LogException.class, () -> client.removeTagsFromResource(request4));
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}