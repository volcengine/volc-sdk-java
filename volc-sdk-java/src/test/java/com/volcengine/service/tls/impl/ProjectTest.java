package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ProjectTest extends BaseTest {
    @Test
    public void testProject() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            //create project
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = "cn-north-3";
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            assertTrue(createProjectResponse.getProjectId().length() > 0);
            System.out.println("create project success,response:" + createProjectResponse);

            Exception exception = assertThrows(LogException.class, () -> {
                client.createProject(project);
            });
            String expectedMessage = "Project already exist";
            String actualMessage = exception.getMessage();
             assertEquals(expectedMessage, actualMessage);

            //describe project
            DescribeProjectResponse describeProjectResponse = client.describeProject(
                    new DescribeProjectRequest(createProjectResponse.getProjectId()));
            Assert.assertEquals(describeProjectResponse.getProjectInfo().getProjectName(), projectName);
            System.out.println("describe project success,response:" + describeProjectResponse);

            exception = assertThrows(LogException.class, () -> {
                client.describeProject(
                        new DescribeProjectRequest("123-456-zsq"));
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //modify project
            projectName = projectName + separator + System.currentTimeMillis();
            description = description + separator + prefix;
            ModifyProjectRequest modifyProjectRequest = new ModifyProjectRequest(createProjectResponse.getProjectId(),
                    projectName, description);
            ModifyProjectResponse modifyProjectResponse = client.modifyProject(modifyProjectRequest);
            assertTrue(modifyProjectResponse.getRequestId().length() > 0);
            describeProjectResponse = client.describeProject(
                    new DescribeProjectRequest(createProjectResponse.getProjectId()));
            Assert.assertEquals(describeProjectResponse.getProjectInfo().getProjectName(), projectName);
            System.out.println("modify project success,response:" + modifyProjectResponse);

            exception = assertThrows(LogException.class, () -> {
                modifyProjectRequest.setProjectName("1243_456");
                client.modifyProject(modifyProjectRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //describe projects
            DescribeProjectsRequest describeProjectRequest = new DescribeProjectsRequest();
            describeProjectRequest.setPageNumber(3);
            describeProjectRequest.setPageSize(1);
            DescribeProjectsResponse describeProjectsResponse = client.describeProjects(describeProjectRequest);
            assertTrue(describeProjectsResponse.getTotal() > 0);
            System.out.println("describe projects success,response:" + describeProjectsResponse);
            exception = assertThrows(LogException.class, () -> {
                describeProjectRequest.setProjectId("123_456");
                client.describeProjects(describeProjectRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));


            //delete project
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(
                    createProjectResponse.getProjectId()));
            assertTrue(deleteProjectResponse.getRequestId().length() > 0);
            exception = assertThrows(LogException.class, () -> {
                client.describeProject(
                        new DescribeProjectRequest(createProjectResponse.getProjectId()));
            });

            expectedMessage = "Project does not exist.";
            actualMessage = exception.getMessage();
             assertEquals(expectedMessage, actualMessage);
            System.out.println("delete project success,response:" + deleteProjectResponse);

        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
