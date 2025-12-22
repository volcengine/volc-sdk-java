package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class DownloadTaskTest extends BaseTest {
    @Test
    public void testDownloadTask() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            // create project
            String projectId;
            {
                String projectName = prefix + separator + date + separator + System.currentTimeMillis();
                String region = "your-region";
                String description = "test project";
                CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
                CreateProjectResponse createProjectResponse = client.createProject(project);
                System.out.println("create project success,response:" + createProjectResponse);
                projectId = createProjectResponse.getProjectId();
            }

            // create topic
            String topicId;
            {
                String topicName = prefix + separator + date + separator + System.currentTimeMillis();
                CreateTopicRequest createTopicRequest = new CreateTopicRequest();
                createTopicRequest.setTopicName(topicName);
                createTopicRequest.setProjectId(projectId);
                createTopicRequest.setTtl(500);
                CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
                System.out.println("create topic success,response:" + createTopicResponse);
                topicId = createTopicResponse.getTopicId();
            }

            // create index
            {
                CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicId,
                        new FullTextInfo(false, ",-;", false), null);
                CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
                assertTrue(createIndexResponse.getTopicId().length() > 0);
                System.out.println("create index success,response:" + createIndexResponse);
            }

            // Test download task sdk

            // CreateDownloadTask
            String taskId;
            {
                CreateDownloadTaskRequest request = new CreateDownloadTaskRequest();
                {
                    request.setTaskName("unit-test-name");
                    request.setCompression("gzip");
                    request.setTopicId(topicId);
                    request.setQuery("*");
                    request.setStartTime(System.currentTimeMillis() - 1000);
                    request.setEndTime(System.currentTimeMillis());
                    request.setDataFormat("csv");
                    request.setSort("desc");
                    request.setLimit(100);
                }
                CreateDownloadTaskResponse response = client.createDownloadTask(request);
                System.out.println("Create download task success, response: " + response);
                taskId = response.getTaskId();

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setCompression("lz4");
                    client.createDownloadTask(request);
                });
            }

            // DescribeDownloadTask
            {
                DescribeDownloadTasksRequest request = new DescribeDownloadTasksRequest();
                {
                    request.setTopicId(topicId);
                    request.setPageSize(100);
                    request.setPageNumber(1);
                }
                DescribeDownloadTasksResponse response = client.describeDownloadTasks(request);
                System.out.println("Describe download task success, response: " + response);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTopicId("notexist");
                    client.describeDownloadTasks(request);
                });
            }

            // Wait for download task finish
            Thread.sleep(1000 * 10);

            // CancelDownloadTask
            {
                CancelDownloadTaskRequest request = new CancelDownloadTaskRequest();
                {
                    request.setTaskId(taskId);
                }
                CancelDownloadTaskResponse response = client.cancelDownloadTask(request);
                System.out.println("Cancel download task success, response: " + response);
                assertTrue(response.getRequestId().length() > 0);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTaskId("notexist");
                    client.cancelDownloadTask(request);
                });
            }

            // DescribeDownloadUrl
            {
                DescribeDownloadUrlRequest request = new DescribeDownloadUrlRequest();
                {
                    request.setTaskId(taskId);
                }
                DescribeDownloadUrlResponse response = client.describeDownloadUrl(request);
                System.out.println("Describe download url success, response: " + response);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTaskId("notexist");
                    client.describeDownloadUrl(request);
                });
            }

            // delete index
            {
                DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicId);
                DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
                assertTrue(deleteIndexResponse.getRequestId().length() > 0);
                System.out.println("delete index success,response:" + deleteIndexResponse);
            }

            // delete topic and project
            {
                DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
                System.out.println("delete topic success,response:" + deleteTopicResponse);
                DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
                System.out.println("delete project success,response:" + deleteProjectResponse);
            }
        } catch (LogException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
