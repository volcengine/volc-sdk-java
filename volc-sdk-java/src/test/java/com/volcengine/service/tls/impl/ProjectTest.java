package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.ProjectInfo;
import com.volcengine.model.tls.TagInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ProjectTest extends BaseTest {
    @Test
    public void testProject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());

        //create project
        String projectName = prefix + separator + date + separator + System.currentTimeMillis();
        String region = System.getenv("region");
        String iam = System.getenv("iam");
        String description = "test project";
        TagInfo tag1 = new TagInfo("t1", "v1");
        TagInfo tag2 = new TagInfo("t2", "v2");
        List<TagInfo> tagList = new ArrayList<>();
        tagList.add(tag1);
        tagList.add(tag2);
        CreateProjectRequest project = new CreateProjectRequest();
        project.setProjectName(projectName);
        project.setRegion(region);
        project.setDescription(description);
        project.setIamProjectName(iam);
        project.setTags(tagList);
        CreateProjectResponse createProjectResponse = client.createProject(project);
        assertFalse(createProjectResponse.getProjectId().isEmpty());
        System.out.println("create project success,response:" + createProjectResponse);
        String projectId = createProjectResponse.getProjectId();

        Exception exception = assertThrows(LogException.class, () -> {
            client.createProject(project);
        });
        String expectedMessage = "Project already exist";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);

        //describe project
        DescribeProjectRequest describeProjectRequest = new DescribeProjectRequest(projectId);
        DescribeProjectResponse describeProjectResponse = client.describeProject(describeProjectRequest);
        Assert.assertEquals(describeProjectResponse.getProjectInfo().getProjectId(), projectId);
        Assert.assertEquals(describeProjectResponse.getProjectInfo().getProjectName(), projectName);
        Assert.assertEquals(describeProjectResponse.getProjectInfo().getIamProjectName(), iam);
        Assert.assertEquals(describeProjectResponse.getProjectInfo().getTags(), tagList);
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
        assertFalse(modifyProjectResponse.getRequestId().isEmpty());
        describeProjectResponse = client.describeProject(
                new DescribeProjectRequest(createProjectResponse.getProjectId()));
        Assert.assertEquals(describeProjectResponse.getProjectInfo().getProjectName(), projectName);
        System.out.println("modify project success,response:" + modifyProjectResponse);

        exception = assertThrows(LogException.class, () -> {
            modifyProjectRequest.setProjectName("");
            client.modifyProject(modifyProjectRequest);
        });
        expectedMessage = "Invalid argument key";
        actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        //describe projects
        DescribeProjectsRequest describeProjectsRequest = new DescribeProjectsRequest();
        describeProjectsRequest.setProjectId(projectId);
        describeProjectsRequest.setIamProjectName(iam);
        describeProjectsRequest.setTags(tagList);
        describeProjectsRequest.setPageNumber(1);
        describeProjectsRequest.setPageSize(10);
        DescribeProjectsResponse describeProjectsResponse = client.describeProjects(describeProjectsRequest);
        assertTrue(describeProjectsResponse.getTotal() > 0);
        List<ProjectInfo> projects = describeProjectsResponse.getProjects();
        ProjectInfo fristProjectInfo = projects.get(0);
        Assert.assertEquals(fristProjectInfo.getProjectId(), projectId);
        Assert.assertEquals(fristProjectInfo.getProjectName(), projectName);
        Assert.assertEquals(fristProjectInfo.getIamProjectName(), iam);
        Assert.assertEquals(fristProjectInfo.getTags(), tagList);
        System.out.println("describe projects success,response:" + describeProjectsResponse);
        exception = assertThrows(LogException.class, () -> {
            describeProjectsRequest.setProjectId("123_456");
            client.describeProjects(describeProjectsRequest);
        });
        expectedMessage = "Invalid argument key";
        actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));


        //delete project
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest(createProjectResponse.getProjectId());
        DeleteProjectResponse deleteProjectResponse = client.deleteProject(deleteProjectRequest);
        assertFalse(deleteProjectResponse.getRequestId().isEmpty());
        exception = assertThrows(LogException.class, () -> {
            client.describeProject(
                    new DescribeProjectRequest(createProjectResponse.getProjectId()));
        });

        expectedMessage = "Project does not exist.";
        actualMessage = exception.getMessage();
         assertEquals(expectedMessage, actualMessage);
        System.out.println("delete project success,response:" + deleteProjectResponse);

    }

}
