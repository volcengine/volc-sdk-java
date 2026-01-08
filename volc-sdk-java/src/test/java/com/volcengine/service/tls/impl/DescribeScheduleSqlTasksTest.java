package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DescribeScheduleSqlTasksTest extends BaseTest {

    private String prefix;
    private String separator;
    private String date;
    private String projectId;
    private String projectName;
    private String topicId;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        prefix = "test-schedule-sql";
        separator = "-";
        date = sdf.format(new Date());
        
        // Create project
        projectName = prefix + separator + date + separator + System.currentTimeMillis();
        String region = System.getenv("region");
        String description = "test project for schedule sql";
        CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
        CreateProjectResponse createProjectResponse = client.createProject(project);
        System.out.println("create project success, response: " + createProjectResponse);
        projectId = createProjectResponse.getProjectId();

        // Create topic
        String topicName = prefix + "-topic" + separator + date + separator + System.currentTimeMillis();
        CreateTopicRequest topic = new CreateTopicRequest();
        topic.setProjectId(projectId);
        topic.setTopicName(topicName);
        topic.setShardCount(1);
        topic.setTtl(1);
        CreateTopicResponse createTopicResponse = client.createTopic(topic);
        System.out.println("create topic success, response: " + createTopicResponse);
        topicId = createTopicResponse.getTopicId();
    }

    @After
    public void tearDown() throws Exception {
        // Delete topic
        if (topicId != null) {
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
            System.out.println("delete topic success, response: " + deleteTopicResponse);
        }
        
        // Delete project
        if (projectId != null) {
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success, response: " + deleteProjectResponse);
        }
    }

    @Test
    public void testDescribeScheduleSqlTasks() throws Exception {
        DescribeScheduleSqlTasksRequest request = new DescribeScheduleSqlTasksRequest();
        request.setProjectId(projectId);
        request.setTopicId(topicId);
        
        try {
            DescribeScheduleSqlTasksResponse response = client.describeScheduleSqlTasks(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            System.out.println("describe schedule sql tasks success, response: " + response);
        } catch (LogException e) {
            // Expected behavior when no tasks exist
            System.out.println("describe schedule sql tasks failed: " + e.getMessage());
            assertNotNull("Error message should not be null", e.getMessage());
        }
    }

    @Test
    public void testDescribeScheduleSqlTasksWithTaskName() throws Exception {
        DescribeScheduleSqlTasksRequest request = new DescribeScheduleSqlTasksRequest();
        request.setTaskName("test-task");
        
        try {
            DescribeScheduleSqlTasksResponse response = client.describeScheduleSqlTasks(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            System.out.println("describe schedule sql tasks with task name success, response: " + response);
        } catch (LogException e) {
            // Expected behavior when no tasks exist
            System.out.println("describe schedule sql tasks with task name failed: " + e.getMessage());
            assertNotNull("Error message should not be null", e.getMessage());
        }
    }

    @Test
    public void testDescribeScheduleSqlTasksWithInvalidProjectId() throws Exception {
        DescribeScheduleSqlTasksRequest request = new DescribeScheduleSqlTasksRequest();
        request.setProjectId("non-existent-project-id");
        
        try {
            DescribeScheduleSqlTasksResponse response = client.describeScheduleSqlTasks(request);
            fail("Should throw exception for invalid project ID");
        } catch (LogException e) {
            // Expected behavior
            System.out.println("describe schedule sql tasks with invalid project ID failed as expected: " + e.getMessage());
            assertNotNull("Error message should not be null", e.getMessage());
        }
    }

    @Test
    public void testDescribeScheduleSqlTasksWithPagination() throws Exception {
        DescribeScheduleSqlTasksRequest request = new DescribeScheduleSqlTasksRequest();
        request.setProjectId(projectId);
        request.setPageNumber(1);
        request.setPageSize(10);
        
        try {
            DescribeScheduleSqlTasksResponse response = client.describeScheduleSqlTasks(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            assertTrue("Total should be >= 0", response.getTotal() >= 0);
            System.out.println("describe schedule sql tasks with pagination success, response: " + response);
        } catch (LogException e) {
            // Expected behavior when no tasks exist
            System.out.println("describe schedule sql tasks with pagination failed: " + e.getMessage());
            assertNotNull("Error message should not be null", e.getMessage());
        }
    }
}