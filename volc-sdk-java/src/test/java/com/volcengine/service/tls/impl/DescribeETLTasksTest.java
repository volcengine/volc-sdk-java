package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeETLTasksTest extends BaseTest {
    
    @Test
    public void testDescribeETLTasks() throws Exception {
        // 创建测试项目
        String projectName = "test-etl-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getRequestId());
        String projectId = createProjectResponse.getProjectId();
        
        try {
            // 测试基本分页查询
            DescribeETLTasksRequest request = new DescribeETLTasksRequest();
            request.setProjectId(projectId);
            request.setPageNumber(1);
            request.setPageSize(10);
            
            DescribeETLTasksResponse response = client.describeETLTasks(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getTasks());
            assertNotNull(response.getTotal());
            
            // 测试带过滤条件的查询
            DescribeETLTasksRequest filteredRequest = new DescribeETLTasksRequest();
            filteredRequest.setProjectId(projectId);
            filteredRequest.setTaskName("test-etl-task");
            filteredRequest.setStatus("running");
            
            DescribeETLTasksResponse filteredResponse = client.describeETLTasks(filteredRequest);
            assertNotNull(filteredResponse.getRequestId());
            assertNotNull(filteredResponse.getTasks());
            
            // 测试带时间范围过滤的查询
            long currentTime = System.currentTimeMillis() / 1000;
            DescribeETLTasksRequest timeRangeRequest = new DescribeETLTasksRequest();
            timeRangeRequest.setProjectId(projectId);
            timeRangeRequest.setCreateTimeStart(currentTime - 3600);
            timeRangeRequest.setCreateTimeEnd(currentTime + 3600);
            
            DescribeETLTasksResponse timeRangeResponse = client.describeETLTasks(timeRangeRequest);
            assertNotNull(timeRangeResponse.getRequestId());
            assertNotNull(timeRangeResponse.getTasks());
            
        } finally {
            // 清理测试项目
            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(projectId);
            client.deleteProject(deleteProjectRequest);
        }
    }
    
    @Test
    public void testDescribeETLTasksWithInvalidRequest() {
        // 测试空请求
        try {
            client.describeETLTasks(null);
            fail("Expected LogException");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }
    }
}