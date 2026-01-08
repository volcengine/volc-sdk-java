package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DescribeShippersTest extends BaseTest {
    @Test
    public void testDescribeShippers() throws Exception {
        DescribeShippersRequest request = new DescribeShippersRequest();
        
        try {
            DescribeShippersResponse response = client.describeShippers(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getShippers());
            assertNotNull(response.getTotal());
            System.out.println("describe shippers success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe shippers failed, error: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testDescribeShippersWithProjectId() throws Exception {
        // First create a project for testing
        String projectName = "tls-java-sdk-test-shipper-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        
        CreateProjectResponse createProjectResponse = null;
        try {
            createProjectResponse = client.createProject(createProjectRequest);
            assertNotNull(createProjectResponse.getProjectId());
            
            // Test DescribeShippers with project ID
            DescribeShippersRequest request = new DescribeShippersRequest();
            request.setProjectId(createProjectResponse.getProjectId());
            
            DescribeShippersResponse response = client.describeShippers(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getShippers());
            assertNotNull(response.getTotal());
            System.out.println("describe shippers with project ID success, response: " + response);
            
        } catch (LogException e) {
            System.out.println("test failed, error: " + e.getMessage());
            throw e;
        } finally {
            // Clean up: delete the test project
            if (createProjectResponse != null && createProjectResponse.getProjectId() != null) {
                try {
                    DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
                    deleteProjectRequest.setProjectId(createProjectResponse.getProjectId());
                    client.deleteProject(deleteProjectRequest);
                } catch (Exception e) {
                    System.out.println("cleanup failed: " + e.getMessage());
                }
            }
        }
    }

    @Test
    public void testDescribeShippersWithTopicId() throws Exception {
        // First create a project and topic for testing
        String projectName = "tls-java-sdk-test-shipper-project-" + System.currentTimeMillis();
        String topicName = "tls-java-sdk-test-shipper-topic-" + System.currentTimeMillis();
        
        CreateProjectResponse createProjectResponse = null;
        CreateTopicResponse createTopicResponse = null;
        
        try {
            // Create project
            CreateProjectRequest createProjectRequest = new CreateProjectRequest();
            createProjectRequest.setProjectName(projectName);
            createProjectRequest.setRegion(region);
            createProjectResponse = client.createProject(createProjectRequest);
            assertNotNull(createProjectResponse.getProjectId());
            
            // Create topic
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setProjectId(createProjectResponse.getProjectId());
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setTtl(1);
            createTopicRequest.setShardCount(1);
            createTopicResponse = client.createTopic(createTopicRequest);
            assertNotNull(createTopicResponse.getTopicId());
            
            // Test DescribeShippers with topic ID
            DescribeShippersRequest request = new DescribeShippersRequest();
            request.setTopicId(createTopicResponse.getTopicId());
            
            DescribeShippersResponse response = client.describeShippers(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getShippers());
            assertNotNull(response.getTotal());
            System.out.println("describe shippers with topic ID success, response: " + response);
            
        } catch (LogException e) {
            System.out.println("test failed, error: " + e.getMessage());
            throw e;
        } finally {
            // Clean up: delete topic first, then project
            if (createTopicResponse != null && createTopicResponse.getTopicId() != null) {
                try {
                    DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(createTopicResponse.getTopicId());
                    client.deleteTopic(deleteTopicRequest);
                } catch (Exception e) {
                    System.out.println("topic cleanup failed: " + e.getMessage());
                }
            }
            if (createProjectResponse != null && createProjectResponse.getProjectId() != null) {
                try {
                    DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
                    deleteProjectRequest.setProjectId(createProjectResponse.getProjectId());
                    client.deleteProject(deleteProjectRequest);
                } catch (Exception e) {
                    System.out.println("project cleanup failed: " + e.getMessage());
                }
            }
        }
    }

    @Test
    public void testDescribeShippersWithPagination() throws Exception {
        DescribeShippersRequest request = new DescribeShippersRequest();
        request.setPageNumber(1);
        request.setPageSize(10);
        
        try {
            DescribeShippersResponse response = client.describeShippers(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getShippers());
            assertNotNull(response.getTotal());
            System.out.println("describe shippers with pagination success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe shippers with pagination failed, error: " + e.getMessage());
            throw e;
        }
    }
}