package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectDemo extends BaseDemo {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            //create project
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = clientConfig.getRegion();
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);

            //modify project
            projectName = projectName + separator + System.currentTimeMillis();
            description = description + separator + prefix;
            ModifyProjectRequest modifyProjectRequest = new ModifyProjectRequest(createProjectResponse.getProjectId(),
                    projectName, description);
            ModifyProjectResponse modifyProjectResponse = client.modifyProject(modifyProjectRequest);
            System.out.println("modify project success,response:" + modifyProjectResponse);
            //describe project
            DescribeProjectResponse describeProjectResponse = client.describeProject(
                    new DescribeProjectRequest(createProjectResponse.getProjectId()));
            System.out.println("describe project success,response:" + describeProjectResponse);
            //describe projects
            DescribeProjectsRequest describeProjectRequest = new DescribeProjectsRequest();
            describeProjectRequest.setPageNumber(3);
            describeProjectRequest.setPageSize(1);
            DescribeProjectsResponse describeProjectsResponse = client.describeProjects(describeProjectRequest);
            System.out.println("describe projects success,response:" + describeProjectsResponse);
            //delete project
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(
                    createProjectResponse.getProjectId()));
            System.out.println("delete project success,response:" + deleteProjectResponse);

        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
