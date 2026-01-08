package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.TagInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class AddTagsToResourceTest extends BaseTest {
    
    @Test
    public void testAddTagsToResource() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());
        
        // Create project for testing
        String projectName = prefix + separator + date + separator + System.currentTimeMillis();
        String region = System.getenv("region");
        String description = "test project for AddTagsToResource";
        
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription(description);
        
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getRequestId());
        String projectId = createProjectResponse.getProjectId();
        
        // Create topic for testing
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setTopicName("test-topic-" + System.currentTimeMillis());
        createTopicRequest.setShardCount(1);
        createTopicRequest.setTtl(1);
        
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getRequestId());
        String topicId = createTopicResponse.getTopicId();
        
        try {
            // Test adding tags to project
            AddTagsToResourceRequest addTagsToProjectRequest = new AddTagsToResourceRequest();
            addTagsToProjectRequest.setResourceType("project");
            addTagsToProjectRequest.setResourcesList(Arrays.asList(projectId));
            
            List<TagInfo> projectTags = new ArrayList<>();
            projectTags.add(new TagInfo("owner", "test-user"));
            projectTags.add(new TagInfo("environment", "test"));
            addTagsToProjectRequest.setTags(projectTags);
            
            AddTagsToResourceResponse projectTagsResponse = client.addTagsToResource(addTagsToProjectRequest);
            assertNotNull(projectTagsResponse.getRequestId());
            
            // Test adding tags to topic
            AddTagsToResourceRequest addTagsToTopicRequest = new AddTagsToResourceRequest();
            addTagsToTopicRequest.setResourceType("topic");
            addTagsToTopicRequest.setResourcesList(Arrays.asList(topicId));
            
            List<TagInfo> topicTags = new ArrayList<>();
            topicTags.add(new TagInfo("owner", "test-user"));
            topicTags.add(new TagInfo("environment", "test"));
            addTagsToTopicRequest.setTags(topicTags);
            
            AddTagsToResourceResponse topicTagsResponse = client.addTagsToResource(addTagsToTopicRequest);
            assertNotNull(topicTagsResponse.getRequestId());
            
            // Test adding tags to multiple resources
            AddTagsToResourceRequest addTagsToMultipleRequest = new AddTagsToResourceRequest();
            addTagsToMultipleRequest.setResourceType("topic");
            addTagsToMultipleRequest.setResourcesList(Arrays.asList(topicId));
            
            List<TagInfo> multipleTags = new ArrayList<>();
            multipleTags.add(new TagInfo("project", "test-project"));
            multipleTags.add(new TagInfo("team", "test-team"));
            multipleTags.add(new TagInfo("cost-center", "test-cost-center"));
            addTagsToMultipleRequest.setTags(multipleTags);
            
            AddTagsToResourceResponse multipleTagsResponse = client.addTagsToResource(addTagsToMultipleRequest);
            assertNotNull(multipleTagsResponse.getRequestId());
            
        } finally {
            // Clean up: delete topic and project
            try {
                DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
                client.deleteTopic(deleteTopicRequest);
                
                DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
                deleteProjectRequest.setProjectId(projectId);
                client.deleteProject(deleteProjectRequest);
            } catch (Exception e) {
                // Ignore cleanup errors
            }
        }
    }
    
    @Test
    public void testAddTagsToResourceInvalidRequest() {
        // Test with null request
        try {
            client.addTagsToResource(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            assertTrue(e.getMessage().contains("Invalid request"));
        } catch (Exception e) {
            fail("Expected LogException but got: " + e.getClass().getSimpleName());
        }
        
        // Test with invalid request (missing required fields)
        AddTagsToResourceRequest invalidRequest = new AddTagsToResourceRequest();
        try {
            client.addTagsToResource(invalidRequest);
            fail("Expected LogException for invalid request");
        } catch (LogException e) {
            assertTrue(e.getMessage().contains("Invalid request"));
        } catch (Exception e) {
            fail("Expected LogException but got: " + e.getClass().getSimpleName());
        }
    }
}
