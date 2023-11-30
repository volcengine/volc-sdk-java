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
            // 创建日志项目
            // 请根据您的需要，填写projectName和可选的description；请您填写和初始化client时一致的Region
            // CreateProject API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112174
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = clientConfig.getRegion();
            String description = "test project";
            CreateProjectRequest createProjectRequest = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
            System.out.println("create project success, response: " + createProjectResponse);

            String projectID = createProjectResponse.getProjectId();

            // 修改日志项目
            // 请根据您的需要，填写projectName或description等参数
            // ModifyProject API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112177
            projectName = projectName + separator + System.currentTimeMillis();
            description = description + separator + prefix;
            ModifyProjectRequest modifyProjectRequest = new ModifyProjectRequest(projectID, projectName, description);
            ModifyProjectResponse modifyProjectResponse = client.modifyProject(modifyProjectRequest);
            System.out.println("modify project success, response: " + modifyProjectResponse);

            // 查询指定日志项目信息
            // 请根据您的需要，填写待查询的projectId
            // DescribeProject API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112178
            DescribeProjectResponse describeProjectResponse = client.describeProject(new DescribeProjectRequest(projectID));
            System.out.println("describe project success, response: " + describeProjectResponse);

            // 查询所有日志项目信息
            // 请根据您的需要，填写projectName等参数
            // DescribeProjects API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112179
            DescribeProjectsRequest describeProjectRequest = new DescribeProjectsRequest();
            describeProjectRequest.setPageNumber(3);
            describeProjectRequest.setPageSize(1);
            DescribeProjectsResponse describeProjectsResponse = client.describeProjects(describeProjectRequest);
            System.out.println("describe projects success, response: " + describeProjectsResponse);

            // 删除日志项目
            // 请根据您的需要，填写待删除的projectId
            // DeleteProject API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112176
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectID));
            System.out.println("delete project success, response: " + deleteProjectResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
