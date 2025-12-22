package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Shard;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManualShardSplitTest extends BaseTest {
    
    @Test
    public void testManualShardSplit() throws Exception {
        // 创建项目
        String projectName = "tls-java-sdk-test-manual-shard-split-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        String projectId = createProjectResponse.getProjectId();

        try {
            // 创建主题
            String topicName = "tls-java-sdk-test-manual-shard-split-topic-" + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setShardCount(2);
            createTopicRequest.setTtl(1);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            assertNotNull(createTopicResponse.getTopicId());
            String topicId = createTopicResponse.getTopicId();

            try {
                // 查询分区列表
                DescribeShardsRequest describeShardsRequest = new DescribeShardsRequest();
                describeShardsRequest.setTopicId(topicId);
                describeShardsRequest.setPageNumber(1);
                describeShardsRequest.setPageSize(20);
                DescribeShardsResponse describeShardsResponse = client.describeShards(describeShardsRequest);
                assertNotNull(describeShardsResponse.getShards());
                assertTrue(describeShardsResponse.getShards().size() > 0);

                // 获取第一个分区进行分裂
                Shard shardToSplit = describeShardsResponse.getShards().get(0);
                Integer shardId = shardToSplit.getShardId();

                // 执行手动分裂
                ManualShardSplitRequest manualShardSplitRequest = new ManualShardSplitRequest();
                manualShardSplitRequest.setTopicId(topicId);
                manualShardSplitRequest.setShardId(shardId);
                manualShardSplitRequest.setNumber(2);
                
                ManualShardSplitResponse manualShardSplitResponse = client.manualShardSplit(manualShardSplitRequest);
                assertNotNull(manualShardSplitResponse.getShards());
                assertTrue(manualShardSplitResponse.getShards().size() > 0);

                // 验证响应中的分区信息
                for (ShardQueryResponse shard : manualShardSplitResponse.getShards()) {
                    assertNotNull(shard.getShardId());
                    assertNotNull(shard.getStatus());
                    assertNotNull(shard.getTopicId());
                    assertNotNull(shard.getInclusiveBeginKey());
                    assertNotNull(shard.getExclusiveEndKey());
                    assertNotNull(shard.getModifyTime());
                }

            } finally {
                // 删除主题
                DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest();
                deleteTopicRequest.setTopicId(topicId);
                client.deleteTopic(deleteTopicRequest);
            }
        } finally {
            // 删除项目
            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(projectId);
            client.deleteProject(deleteProjectRequest);
        }
    }

    @Test
    public void testManualShardSplitInvalidRequest() {
        // 测试无效请求参数
        ManualShardSplitRequest invalidRequest = new ManualShardSplitRequest();
        
        // 验证参数检查
        assertFalse(invalidRequest.checkValidation());
        
        // 缺少必填参数
        try {
            client.manualShardSplit(invalidRequest);
            fail("Expected LogException for invalid request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }
    }
}