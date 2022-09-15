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
            //create project
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = "your-region";
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);
            String projectId = createProjectResponse.getProjectId();
            //create topic
            String topicName = prefix + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success,response:" + createTopicResponse);
            //modify topic
            ModifyTopicRequest modifyTopicRequest = new ModifyTopicRequest();
            modifyTopicRequest.setTopicId(createTopicResponse.getTopicId());
            modifyTopicRequest.setTopicName(topicName + separator + System.currentTimeMillis());
            ModifyTopicResponse modifyTopicResponse = client.modifyTopic(modifyTopicRequest);
            System.out.println("modify topic success,response:" + modifyTopicResponse);

            //describe topic
            DescribeTopicRequest describeTopicRequest = new DescribeTopicRequest(createTopicResponse.getTopicId());
            DescribeTopicResponse describeTopicResponse = client.describeTopic(describeTopicRequest);
            System.out.println("describe topic success,response:" + describeTopicResponse);

            //describe topics
            DescribeTopicsRequest describeTopicsRequest = new DescribeTopicsRequest();
            describeTopicsRequest.setProjectId(createProjectResponse.getProjectId());
            DescribeTopicsResponse describeTopicsResponse = client.describeTopics(describeTopicsRequest);
            System.out.println("describe topics success,response:" + describeTopicsResponse);
            //delete topic
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(
                    new DeleteTopicRequest(createTopicResponse.getTopicId()));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (
                LogException e) {
            e.printStackTrace();
        }
    }

}
