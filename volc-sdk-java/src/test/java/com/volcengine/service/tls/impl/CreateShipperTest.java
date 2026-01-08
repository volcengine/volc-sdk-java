package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.CreateProjectResponse;
import com.volcengine.model.tls.response.CreateShipperResponse;
import com.volcengine.model.tls.response.CreateTopicResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class CreateShipperTest extends BaseTest {
    
    private String projectId;
    private String topicId;
    
    @Before
    public void setUp() throws Exception {
        // 创建依赖的 Project 和 Topic
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-shipper";
        String separator = "-";
        String date = sdf.format(new Date());
        
        // 创建 Project
        String projectName = prefix + separator + date + separator + System.currentTimeMillis();
        CreateProjectRequest projectRequest = new CreateProjectRequest();
        projectRequest.setProjectName(projectName);
        projectRequest.setRegion(System.getenv("region"));
        projectRequest.setDescription("test project for shipper");
        
        CreateProjectResponse projectResponse = client.createProject(projectRequest);
        projectId = projectResponse.getProjectId();
        
        // 创建 Topic
        String topicName = prefix + separator + date + separator + System.currentTimeMillis();
        CreateTopicRequest topicRequest = new CreateTopicRequest();
        topicRequest.setTopicName(topicName);
        topicRequest.setProjectId(projectId);
        topicRequest.setTtl(500);
        
        CreateTopicResponse topicResponse = client.createTopic(topicRequest);
        topicId = topicResponse.getTopicId();
    }
    
    @After
    public void tearDown() throws Exception {
        // 清理 Topic 和 Project
        if (topicId != null) {
            try {
                client.deleteTopic(new DeleteTopicRequest(topicId));
            } catch (Exception e) {
                System.out.println("Failed to delete topic: " + e.getMessage());
            }
        }
        if (projectId != null) {
            try {
                client.deleteProject(new DeleteProjectRequest(projectId));
            } catch (Exception e) {
                System.out.println("Failed to delete project: " + e.getMessage());
            }
        }
    }
    
    @Test
    public void testCreateShipper() throws LogException {
        // TOS Shipper 测试
        testCreateTosShipper();
        
        // Kafka Shipper 测试
        testCreateKafkaShipper();
        
        // CSV 格式测试
        testCreateCsvShipper();
        
        // 异常处理测试
        testExceptionCases();
    }
    
    private void testCreateTosShipper() throws LogException {
        String shipperName = "test-tos-shipper-" + System.currentTimeMillis();
        
        CreateShipperRequest request = new CreateShipperRequest();
        request.setShipperName(shipperName);
        request.setTopicId(topicId);
        request.setShipperType("tos");
        request.setShipperStartTime(System.currentTimeMillis() / 1000);
        request.setShipperEndTime(System.currentTimeMillis() / 1000 + 86400);
        
        // 设置 TOS 配置
        TosShipperInfo tosInfo = new TosShipperInfo();
        tosInfo.setBucket("test-bucket");
        tosInfo.setPrefix("test-prefix/");
        tosInfo.setMaxSize(100);
        tosInfo.setCompress("gzip");
        tosInfo.setInterval(300);
        tosInfo.setPartitionFormat("%Y/%m/%d");
        request.setTosShipperInfo(tosInfo);
        
        // 设置内容格式 - JSON
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.setFormat("json");
        
        JsonInfo jsonInfo = new JsonInfo();
        jsonInfo.setEnable(true);
        jsonInfo.setEscape(true);
        jsonInfo.setKeys(new String[]{"field1", "field2", "field3"});
        contentInfo.setJsonInfo(jsonInfo);
        
        request.setContentInfo(contentInfo);
        
        CreateShipperResponse response = client.createShipper(request);
        assertNotNull(response.getShipperId());
        assertFalse(response.getShipperId().isEmpty());
        assertNotNull(response.getRequestId());
        
        System.out.println("create TOS shipper success, response: " + response);
    }
    
    private void testCreateKafkaShipper() throws LogException {
        String shipperName = "test-kafka-shipper-" + System.currentTimeMillis();
        
        CreateShipperRequest request = new CreateShipperRequest();
        request.setShipperName(shipperName);
        request.setTopicId(topicId);
        request.setShipperType("kafka");
        request.setShipperStartTime(System.currentTimeMillis() / 1000);
        request.setShipperEndTime(System.currentTimeMillis() / 1000 + 86400);
        
        // 设置 Kafka 配置
        KafkaShipperInfo kafkaInfo = new KafkaShipperInfo();
        kafkaInfo.setInstance("kafka-instance");
        kafkaInfo.setKafkaTopic("test-topic");
        kafkaInfo.setCompress("gzip");
        kafkaInfo.setStartTime(System.currentTimeMillis() / 1000);
        kafkaInfo.setEndTime(System.currentTimeMillis() / 1000 + 86400);
        request.setKafkaShipperInfo(kafkaInfo);
        
        // 设置内容格式 - original
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.setFormat("original");
        request.setContentInfo(contentInfo);
        
        CreateShipperResponse response = client.createShipper(request);
        assertNotNull(response.getShipperId());
        assertFalse(response.getShipperId().isEmpty());
        assertNotNull(response.getRequestId());
        
        System.out.println("create Kafka shipper success, response: " + response);
    }
    
    private void testCreateCsvShipper() throws LogException {
        String shipperName = "test-csv-shipper-" + System.currentTimeMillis();
        
        CreateShipperRequest request = new CreateShipperRequest();
        request.setShipperName(shipperName);
        request.setTopicId(topicId);
        request.setShipperType("tos");
        request.setShipperStartTime(System.currentTimeMillis() / 1000);
        request.setShipperEndTime(System.currentTimeMillis() / 1000 + 86400);
        
        // 设置 TOS 配置
        TosShipperInfo tosInfo = new TosShipperInfo();
        tosInfo.setBucket("test-bucket-csv");
        tosInfo.setPrefix("test-csv-prefix/");
        tosInfo.setMaxSize(50);
        tosInfo.setCompress("snappy");
        tosInfo.setInterval(600);
        tosInfo.setPartitionFormat("%Y/%m/%d/%H");
        request.setTosShipperInfo(tosInfo);
        
        // 设置内容格式 - CSV
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.setFormat("csv");
        
        CsvInfo csvInfo = new CsvInfo();
        csvInfo.setKeys(new String[]{"timestamp", "level", "message", "host"});
        csvInfo.setDelimiter(",");
        csvInfo.setEscapeChar("\\");
        csvInfo.setPrintHeader(true);
        csvInfo.setNonFieldContent("-");
        contentInfo.setCsvInfo(csvInfo);
        
        request.setContentInfo(contentInfo);
        
        CreateShipperResponse response = client.createShipper(request);
        assertNotNull(response.getShipperId());
        assertFalse(response.getShipperId().isEmpty());
        assertNotNull(response.getRequestId());
        
        System.out.println("create CSV shipper success, response: " + response);
    }
    
    private void testExceptionCases() {
        // 测试空请求
        Exception exception = assertThrows(LogException.class, () -> {
            client.createShipper(null);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
        
        // 测试无效请求 - 缺少必要参数
        exception = assertThrows(LogException.class, () -> {
            CreateShipperRequest invalidRequest = new CreateShipperRequest();
            client.createShipper(invalidRequest);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
        
        // 测试 TOS 类型但缺少 TosShipperInfo
        exception = assertThrows(LogException.class, () -> {
            CreateShipperRequest invalidRequest = new CreateShipperRequest();
            invalidRequest.setShipperName("test-invalid");
            invalidRequest.setTopicId(topicId);
            invalidRequest.setShipperType("tos");
            ContentInfo contentInfo = new ContentInfo();
            contentInfo.setFormat("json");
            invalidRequest.setContentInfo(contentInfo);
            client.createShipper(invalidRequest);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
        
        // 测试 Kafka 类型但缺少 KafkaShipperInfo
        exception = assertThrows(LogException.class, () -> {
            CreateShipperRequest invalidRequest = new CreateShipperRequest();
            invalidRequest.setShipperName("test-invalid");
            invalidRequest.setTopicId(topicId);
            invalidRequest.setShipperType("kafka");
            ContentInfo contentInfo = new ContentInfo();
            contentInfo.setFormat("original");
            invalidRequest.setContentInfo(contentInfo);
            client.createShipper(invalidRequest);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
        
        System.out.println("exception cases test passed");
    }
}
