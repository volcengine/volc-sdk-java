package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IndexDemo extends BaseDemo {
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
            String topicName = prefix + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectID);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success, response: " + createTopicResponse);

            String topicID = createTopicResponse.getTopicId();

            // 创建索引配置
            // 请根据您的需要，配置fullText全文索引或keyValue键值索引
            // CreateIndex API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112187
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicID,
                    new FullTextInfo(false, ",-;", false), null);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            System.out.println("create index success, response: " + createIndexResponse);

            // 修改索引配置
            // 请根据您的需要，填写topicId和待修改的fullText或keyValue配置
            // ModifyIndex API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112189
            ModifyIndexRequest modifyIndexRequest = new ModifyIndexRequest(topicID,
                    new FullTextInfo(false, ";", false), null);
            ModifyIndexResponse modifyIndexResponse = client.modifyIndex(modifyIndexRequest);
            System.out.println("modify index success, response: " + modifyIndexResponse);

            // 查询索引配置
            // 请根据您的需要，填写待查询的topicId
            // DescribeIndex API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112190
            DescribeIndexRequest describeIndexRequest = new DescribeIndexRequest(topicID);
            DescribeIndexResponse describeIndexResponse = client.describeIndex(describeIndexRequest);
            System.out.println("describe index success, response: " + describeIndexResponse);

            // 删除索引配置
            // 请根据您的需要，填写待删除索引的topicId
            // DeleteIndex API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112188
            DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicID);
            DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
            System.out.println("delete index success, response: " + deleteIndexResponse);

            // 删除日志主题
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
