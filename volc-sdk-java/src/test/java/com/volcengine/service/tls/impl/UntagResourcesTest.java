package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UntagResourcesTest extends BaseTest {
    
    @Test
    public void testUntagResources() throws Exception {
        // Create a project for testing
        String projectName = "tls-java-sdk-test-untag-resources-project-" + System.currentTimeMillis();
        String region = System.getenv("region");
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription("Test project for untag resources");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        String projectId = createProjectResponse.getProjectId();

        // Create a topic for testing
        String topicName = "tls-java-sdk-test-untag-resources-topic-" + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setTtl(1);
        createTopicRequest.setShardCount(1);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getTopicId());
        String topicId = createTopicResponse.getTopicId();

        try {
            // Test untagging resources (this should succeed even if no tags exist)
            UntagResourcesRequest untagProjectRequest = new UntagResourcesRequest();
            untagProjectRequest.setResourceType("project");
            untagProjectRequest.setResourcesIds(Arrays.asList(projectId));
            untagProjectRequest.setTagKeys(Arrays.asList("test-key", "owner"));
            
            UntagResourcesResponse untagProjectResponse = client.untagResources(untagProjectRequest);
            assertNotNull(untagProjectResponse);
            assertNotNull(untagProjectResponse.getRequestId());

            // Test untagging with topic resources
            UntagResourcesRequest untagTopicRequest = new UntagResourcesRequest();
            untagTopicRequest.setResourceType("topic");
            untagTopicRequest.setResourcesIds(Arrays.asList(topicId));
            untagTopicRequest.setTagKeys(Arrays.asList("test-key"));
            
            UntagResourcesResponse untagTopicResponse = client.untagResources(untagTopicRequest);
            assertNotNull(untagTopicResponse);
            assertNotNull(untagTopicResponse.getRequestId());

            // Test with multiple resources
            UntagResourcesRequest untagMultipleRequest = new UntagResourcesRequest();
            untagMultipleRequest.setResourceType("topic");
            untagMultipleRequest.setResourcesIds(Arrays.asList(topicId));
            untagMultipleRequest.setTagKeys(Arrays.asList("key1", "key2", "key3"));
            
            UntagResourcesResponse untagMultipleResponse = client.untagResources(untagMultipleRequest);
            assertNotNull(untagMultipleResponse);
            assertNotNull(untagMultipleResponse.getRequestId());

        } finally {
            // Clean up - delete topic first, then project
            try {
                DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
                client.deleteTopic(deleteTopicRequest);
            } catch (Exception e) {
                // Ignore cleanup errors
            }
            
            try {
                DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
                deleteProjectRequest.setProjectId(projectId);
                client.deleteProject(deleteProjectRequest);
            } catch (Exception e) {
                // Ignore cleanup errors
            }
        }
    }

    @Test
    public void testUntagResourcesValidation() {
        // Test null request
        Exception exception = assertThrows(LogException.class, () -> {
            client.untagResources(null);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));

        // Test invalid request - missing resourceType
        UntagResourcesRequest invalidRequest1 = new UntagResourcesRequest();
        invalidRequest1.setResourcesIds(Arrays.asList("test-id"));
        invalidRequest1.setTagKeys(Arrays.asList("test-key"));
        
        exception = assertThrows(LogException.class, () -> {
            client.untagResources(invalidRequest1);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));

        // Test invalid request - empty resourcesIds
        UntagResourcesRequest invalidRequest2 = new UntagResourcesRequest();
        invalidRequest2.setResourceType("project");
        invalidRequest2.setResourcesIds(new ArrayList<>());
        invalidRequest2.setTagKeys(Arrays.asList("test-key"));
        
        exception = assertThrows(LogException.class, () -> {
            client.untagResources(invalidRequest2);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));

        // Test invalid request - empty tagKeys
        UntagResourcesRequest invalidRequest3 = new UntagResourcesRequest();
        invalidRequest3.setResourceType("project");
        invalidRequest3.setResourcesIds(Arrays.asList("test-id"));
        invalidRequest3.setTagKeys(new ArrayList<>());
        
        exception = assertThrows(LogException.class, () -> {
            client.untagResources(invalidRequest3);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}