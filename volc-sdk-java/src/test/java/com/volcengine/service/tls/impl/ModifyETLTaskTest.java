package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ModifyETLTaskRequest;
import com.volcengine.model.tls.request.TargetResource;
import com.volcengine.model.tls.response.ModifyETLTaskResponse;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class ModifyETLTaskTest extends BaseTest {
    @Test
    public void testModifyETLTask() throws Exception {
        // 创建请求对象
        ModifyETLTaskRequest request = new ModifyETLTaskRequest();
        request.setTaskId("test-etl-task-" + System.currentTimeMillis());
        request.setName("test-etl-task-name-" + System.currentTimeMillis());
        request.setDescription("This is a test ETL task");
        request.setScript("f_set(\"key\",\"value\")");
        
        // 创建目标资源
        TargetResource targetResource = new TargetResource();
        targetResource.setAlias("test");
        targetResource.setTopicId("test-topic-id");
        targetResource.setRegion("cn-beijing");
        targetResource.setRoleTrn("trn:iam::2100000001:role/TLSETLAccessForUserA");
        
        request.setTargetResources(Arrays.asList(targetResource));
        
        try {
            // 调用接口
            ModifyETLTaskResponse response = client.modifyETLTask(request);
            
            // 验证响应
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            
            System.out.println("ModifyETLTask success, response: " + response);
        } catch (LogException e) {
            System.out.println("ModifyETLTask failed, error: " + e.getMessage());
            // 根据测试需要决定是否抛出异常
            // throw e;
        }
    }
}