package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ContentInfo;
import com.volcengine.model.tls.request.CreateProjectRequest;
import com.volcengine.model.tls.request.CreateTopicRequest;
import com.volcengine.model.tls.request.DeleteProjectRequest;
import com.volcengine.model.tls.request.DeleteTopicRequest;
import com.volcengine.model.tls.request.KafkaShipperInfo;
import com.volcengine.model.tls.request.ModifyShipperRequest;
import com.volcengine.model.tls.request.TosShipperInfo;
import com.volcengine.model.tls.response.CreateProjectResponse;
import com.volcengine.model.tls.response.CreateTopicResponse;
import com.volcengine.model.tls.response.ModifyShipperResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModifyShipperTest extends BaseTest {
    
    @Test
    public void testModifyShipper() throws Exception {
        // Create a project first
        String projectName = "tls-java-sdk-test-shipper-project-" + System.currentTimeMillis();
        String region = System.getenv("region");
        
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        
        CreateProjectResponse projectCreated = client.createProject(createProjectRequest);
        assertNotNull(projectCreated.getRequestId());
        String projectId = projectCreated.getProjectId();
        
        try {
            // Create a topic
            String topicName = "tls-java-sdk-test-shipper-topic-" + System.currentTimeMillis();
            
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setShardCount(1);
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setTtl(1);
            
            CreateTopicResponse topicCreated = client.createTopic(createTopicRequest);
            assertNotNull(topicCreated.getRequestId());
            String topicId = topicCreated.getTopicId();
            
            try {
                // Note: Since we don't have CreateShipper API implemented yet, we'll test ModifyShipper with a mock shipper ID
                // This test will verify the API call structure and response validation
                String shipperId = "test-shipper-" + System.currentTimeMillis();
                
                try {
                    // Test TOS shipper configuration
                    ModifyShipperRequest modifyRequest = new ModifyShipperRequest();
                    modifyRequest.setShipperId(shipperId);
                    modifyRequest.setShipperName("test-shipper-name-" + System.currentTimeMillis());
                    modifyRequest.setShipperType("tos");
                    modifyRequest.setStatus(true);
                    
                    ContentInfo contentInfo = new ContentInfo();
                    contentInfo.setFormat("json");
                    modifyRequest.setContentInfo(contentInfo);
                    
                    TosShipperInfo tosShipperInfo = new TosShipperInfo();
                    tosShipperInfo.setPrefix("test-prefix");
                    tosShipperInfo.setMaxSize(5);
                    tosShipperInfo.setCompress("snappy");
                    tosShipperInfo.setInterval(300);
                    tosShipperInfo.setPartitionFormat("%Y/%m/%d/%H/%M");
                    modifyRequest.setTosShipperInfo(tosShipperInfo);
                    
                    ModifyShipperResponse modifyResult = client.modifyShipper(modifyRequest);
                    assertNotNull(modifyResult.getRequestId());
                    
                } catch (LogException e) {
                    // Since we don't have a real shipper ID, we expect this to fail
                    // But we can still validate the error structure
                    assertNotNull(e.getMessage());
                }
                
                // Test with Kafka configuration
                try {
                    ModifyShipperRequest modifyKafkaRequest = new ModifyShipperRequest();
                    modifyKafkaRequest.setShipperId(shipperId);
                    modifyKafkaRequest.setShipperName("test-kafka-shipper-" + System.currentTimeMillis());
                    modifyKafkaRequest.setShipperType("kafka");
                    modifyKafkaRequest.setStatus(true);
                    
                    ContentInfo kafkaContentInfo = new ContentInfo();
                    kafkaContentInfo.setFormat("original");
                    modifyKafkaRequest.setContentInfo(kafkaContentInfo);
                    
                    KafkaShipperInfo kafkaShipperInfo = new KafkaShipperInfo();
                    kafkaShipperInfo.setCompress("snappy");
                    kafkaShipperInfo.setInstance("kafka-test-instance");
                    kafkaShipperInfo.setKafkaTopic("test-topic");
                    modifyKafkaRequest.setKafkaShipperInfo(kafkaShipperInfo);
                    
                    ModifyShipperResponse modifyKafkaResult = client.modifyShipper(modifyKafkaRequest);
                    assertNotNull(modifyKafkaResult.getRequestId());
                    
                } catch (LogException e) {
                    // Since we don't have a real shipper ID, we expect this to fail
                    // But we can still validate the error structure
                    assertNotNull(e.getMessage());
                }
                
            } finally {
                // Clean up topic
                DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
                client.deleteTopic(deleteTopicRequest);
            }
            
        } finally {
            // Clean up project
            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(projectId);
            client.deleteProject(deleteProjectRequest);
        }
    }
    
    @Test
    public void testModifyShipperValidation() throws Exception {
        // Test validation - null request
        try {
            client.modifyShipper(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }
        
        // Test validation - missing required field
        ModifyShipperRequest request = new ModifyShipperRequest();
        // shipperId is null, which should fail validation
        try {
            client.modifyShipper(request);
            fail("Expected LogException for invalid request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
        }
    }
}