package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTagsForResourcesTest extends BaseTest {
    
    @Test
    public void testListTagsForResources() throws Exception {
        // Create project for testing
        String projectName = "tls-java-sdk-test-list-tags-project-" + System.currentTimeMillis();
        String region = System.getenv("region");
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        String projectId = createProjectResponse.getProjectId();

        // Create topic for testing
        String topicName = "tls-java-sdk-test-list-tags-topic-" + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setShardCount(1);
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setTtl(1);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getTopicId());
        String topicId = createTopicResponse.getTopicId();

        try {
            // Test listing project tags
            ListTagsForResourcesRequest projectTagsRequest = new ListTagsForResourcesRequest();
            projectTagsRequest.setResourceType("project");
            projectTagsRequest.setResourcesIds(java.util.Arrays.asList(projectId));
            
            ListTagsForResourcesResponse projectTagsResponse = client.listTagsForResources(projectTagsRequest);
            assertNotNull(projectTagsResponse.getRequestId());
            assertNotNull(projectTagsResponse.getResourceTags());

            // Test listing topic tags
            ListTagsForResourcesRequest topicTagsRequest = new ListTagsForResourcesRequest();
            topicTagsRequest.setResourceType("topic");
            topicTagsRequest.setResourcesIds(java.util.Arrays.asList(topicId));
            
            ListTagsForResourcesResponse topicTagsResponse = client.listTagsForResources(topicTagsRequest);
            assertNotNull(topicTagsResponse.getRequestId());
            assertNotNull(topicTagsResponse.getResourceTags());

            // Test using tag filters (even if there might be no tags)
            ListTagsForResourcesRequest filteredTagsRequest = new ListTagsForResourcesRequest();
            filteredTagsRequest.setResourceType("project");
            
            FilterTag filterTag = new FilterTag();
            filterTag.setKey("test-key");
            filterTag.setValues(java.util.Arrays.asList("test-value"));
            filteredTagsRequest.setTagFilters(java.util.Arrays.asList(filterTag));
            
            ListTagsForResourcesResponse filteredTagsResponse = client.listTagsForResources(filteredTagsRequest);
            assertNotNull(filteredTagsResponse.getRequestId());
            assertNotNull(filteredTagsResponse.getResourceTags());

            // Test pagination parameters
            ListTagsForResourcesRequest pagedTagsRequest = new ListTagsForResourcesRequest();
            pagedTagsRequest.setResourceType("project");
            pagedTagsRequest.setMaxResults(10);
            
            ListTagsForResourcesResponse pagedTagsResponse = client.listTagsForResources(pagedTagsRequest);
            assertNotNull(pagedTagsResponse.getRequestId());
            assertNotNull(pagedTagsResponse.getResourceTags());

        } finally {
            // Clean up resources
            DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
            client.deleteTopic(deleteTopicRequest);

            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(projectId);
            client.deleteProject(deleteProjectRequest);
        }
    }

    @Test
    public void testListTagsForResourcesInvalidRequest() {
        // Test with null request
        try {
            client.listTagsForResources(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }

        // Test with invalid request (missing resourceType)
        try {
            ListTagsForResourcesRequest request = new ListTagsForResourcesRequest();
            client.listTagsForResources(request);
            fail("Expected LogException for invalid request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }
    }
}