package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.TagInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.TagResourcesRequest;
import com.volcengine.model.tls.response.TagResourcesResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TagResourcesTest extends BaseTest {
    @Test
    public void testTagResources() throws Exception {
        // Create tag resources request
        TagResourcesRequest request = new TagResourcesRequest();
        
        // Set resource type (e.g., "project", "topic", etc.)
        request.setResourceType("project");
        
        // Set resource list
        List<String> resourceList = new ArrayList<>();
        resourceList.add("test-project-id");
        request.setResourceList(resourceList);
        
        // Set tags
        List<TagInfo> tags = new ArrayList<>();
        tags.add(new TagInfo("Environment", "Test"));
        tags.add(new TagInfo("Owner", "TestTeam"));
        request.setTags(tags);
        
        try {
            TagResourcesResponse response = client.tagResources(request);
            assertNotNull(response.getRequestId());
            System.out.println("Tag resources success, response: " + response);
        } catch (LogException e) {
            // Handle expected exceptions for test environment
            if (e.getMessage().contains("ResourceNotFound") || e.getMessage().contains("InvalidArgument")) {
                System.out.println("Expected exception for test environment: " + e.getMessage());
            } else {
                throw e;
            }
        }
    }

    @Test
    public void testTagResourcesValidation() throws Exception {
        // Test with null request
        try {
            client.tagResources(null);
            fail("Should throw LogException for null request");
        } catch (LogException e) {
            assertTrue(e.getMessage().contains("InvalidArgument"));
        }
        
        // Test with invalid request (missing required fields)
        TagResourcesRequest request = new TagResourcesRequest();
        try {
            client.tagResources(request);
            fail("Should throw LogException for invalid request");
        } catch (LogException e) {
            assertTrue(e.getMessage().contains("InvalidArgument"));
        }
        
        // Test with empty resource list
        request.setResourceType("project");
        request.setResourceList(new ArrayList<>());
        request.setTags(new ArrayList<>());
        try {
            client.tagResources(request);
            fail("Should throw LogException for empty resource list");
        } catch (LogException e) {
            assertTrue(e.getMessage().contains("InvalidArgument"));
        }
    }
}