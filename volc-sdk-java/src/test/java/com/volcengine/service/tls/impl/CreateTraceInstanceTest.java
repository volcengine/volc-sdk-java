package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateProjectRequest;
import com.volcengine.model.tls.request.CreateTraceInstanceRequest;
import com.volcengine.model.tls.response.CreateProjectResponse;
import com.volcengine.model.tls.response.CreateTraceInstanceResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateTraceInstanceTest extends BaseTest {

    private String createTestProject() throws LogException {
        String projectName = "trace-instance-test-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription("trace instance test");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull("projectId should not be null", createProjectResponse.getProjectId());
        return createProjectResponse.getProjectId();
    }

    @Test
    public void testCreateTraceInstance() throws Exception {
        String projectId = createTestProject();
        String traceInstanceName = "test-trace-instance-" + System.currentTimeMillis();
        String description = "Test trace instance description";

        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setProjectId(projectId);
        request.setTraceInstanceName(traceInstanceName);
        request.setDescription(description);

        try {
            CreateTraceInstanceResponse response = client.createTraceInstance(request);

            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            assertNotNull("TraceInstanceId should not be null", response.getTraceInstanceId());

            System.out.println("Create trace instance success, response: " + response);
        } catch (LogException e) {
            System.err.println("Create trace instance failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testCreateTraceInstanceWithNullRequest() {
        Exception exception = assertThrows(LogException.class, () -> {
            client.createTraceInstance(null);
        });

        assertTrue(exception.getMessage().contains("Invalid request"));
    }

    @Test
    public void testCreateTraceInstanceWithInvalidRequest() {
        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setDescription("Test description");

        Exception exception = assertThrows(LogException.class, () -> {
            client.createTraceInstance(request);
        });

        assertTrue(exception.getMessage().contains("Invalid request"));
    }

    @Test
    public void testCreateTraceInstanceWithoutDescription() throws Exception {
        String projectId = createTestProject();
        String traceInstanceName = "test-trace-instance-no-desc-" + System.currentTimeMillis();

        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setProjectId(projectId);
        request.setTraceInstanceName(traceInstanceName);

        try {
            CreateTraceInstanceResponse response = client.createTraceInstance(request);

            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            assertNotNull("TraceInstanceId should not be null", response.getTraceInstanceId());

            System.out.println("Create trace instance without description success, response: " + response);
        } catch (LogException e) {
            System.err.println("Create trace instance failed: " + e.getMessage());
            throw e;
        }
    }
}
