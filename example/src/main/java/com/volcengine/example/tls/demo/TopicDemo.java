package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TopicDemo extends BaseDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());

        try {
            // 创建日志项目
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = clientConfig.getRegion();
            String description = "test project";
            CreateProjectRequest createProjectRequest = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
            System.out.println("create project success, response: " + createProjectResponse);

            String projectID = createProjectResponse.getProjectId();

            // 创建日志主题
            // 请根据您的需要，填写projectId、topicName、ttl、shardCount和description等参数
            // CreateTopic API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112180
            String topicName = prefix + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectID);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success, response: " + createTopicResponse);

            String topicID = createTopicResponse.getTopicId();

            // 修改日志主题
            // 请根据您的需要，填写topicId以及待修改的各项参数
            // ModifyTopic API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112183
            ModifyTopicRequest modifyTopicRequest = new ModifyTopicRequest();
            modifyTopicRequest.setTopicId(topicID);
            modifyTopicRequest.setTopicName(topicName + separator + System.currentTimeMillis());
            ModifyTopicResponse modifyTopicResponse = client.modifyTopic(modifyTopicRequest);
            System.out.println("modify topic success, response: " + modifyTopicResponse);

            // 查询指定日志主题信息
            // 请根据您的需要，填写待查询的topicId
            // DescribeTopic API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112184
            DescribeTopicRequest describeTopicRequest = new DescribeTopicRequest(topicID);
            DescribeTopicResponse describeTopicResponse = client.describeTopic(describeTopicRequest);
            System.out.println("describe topic success, response: " + describeTopicResponse);

            // 查询所有日志主题信息
            // 请根据您的需要，填写待查询的projectId
            // DescribeTopics API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112185
            DescribeTopicsRequest describeTopicsRequest = new DescribeTopicsRequest();
            describeTopicsRequest.setProjectId(projectID);
            DescribeTopicsResponse describeTopicsResponse = client.describeTopics(describeTopicsRequest);
            System.out.println("describe topics success, response: " + describeTopicsResponse);

            // 删除日志主题
            // 请根据您的需要，填写待删除的topicId
            // DeleteTopic API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112182
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicID));
            System.out.println("delete topic success, response: " + deleteTopicResponse);

            // 删除日志项目
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectID));
            System.out.println("delete project success, response: " + deleteProjectResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }
}
