package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeAlarmContentTemplatesRequest;
import com.volcengine.model.tls.response.DescribeAlarmContentTemplatesResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeAlarmContentTemplatesTest extends BaseTest {
    
    @Test
    public void testDescribeAlarmContentTemplates() throws Exception {
        // 创建请求对象
        DescribeAlarmContentTemplatesRequest request = new DescribeAlarmContentTemplatesRequest();
        
        // 设置必填参数 - 项目ID
        request.setProjectId("your-project-id"); // 需要替换为实际的项目ID
        
        // 设置可选参数
        request.setPageNumber(1);
        request.setPageSize(20);
        
        try {
            // 调用API
            DescribeAlarmContentTemplatesResponse response = client.describeAlarmContentTemplates(request);
            
            // 验证响应
            assertNotNull("Response should not be null", response);
            assertNotNull("Request ID should not be null", response.getRequestId());
            
            // 验证返回的数据
            if (response.getAlarmContentTemplates() != null) {
                System.out.println("Total alarm content templates: " + response.getTotal());
                System.out.println("Number of templates returned: " + response.getAlarmContentTemplates().size());
                
                // 打印第一个模板的信息（如果有）
                if (!response.getAlarmContentTemplates().isEmpty()) {
                    System.out.println("First template ID: " + response.getAlarmContentTemplates().get(0).getAlarmContentTemplateId());
                    System.out.println("First template name: " + response.getAlarmContentTemplates().get(0).getAlarmContentTemplateName());
                }
            }
            
        } catch (LogException e) {
            // 处理特定的异常
            System.err.println("LogException: " + e.getMessage());
            System.err.println("Error Code: " + e.getErrorCode());
            throw e;
        } catch (Exception e) {
            // 处理其他异常
            System.err.println("Unexpected error: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testDescribeAlarmContentTemplatesWithFilter() throws Exception {
        // 测试带过滤条件的查询
        DescribeAlarmContentTemplatesRequest request = new DescribeAlarmContentTemplatesRequest();
        
        // 设置必填参数
        request.setProjectId("your-project-id"); // 需要替换为实际的项目ID
        
        // 设置过滤条件（可选）
        request.setAlarmContentTemplateName("test-template"); // 按名称过滤
        request.setPageNumber(1);
        request.setPageSize(10);
        
        try {
            DescribeAlarmContentTemplatesResponse response = client.describeAlarmContentTemplates(request);
            
            assertNotNull("Response should not be null", response);
            assertNotNull("Request ID should not be null", response.getRequestId());
            
            System.out.println("Filtered results - Total: " + response.getTotal());
            if (response.getAlarmContentTemplates() != null) {
                System.out.println("Filtered results - Count: " + response.getAlarmContentTemplates().size());
            }
            
        } catch (LogException e) {
            System.err.println("LogException: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testDescribeAlarmContentTemplatesValidation() throws Exception {
        // 测试参数验证 - 缺少必填参数
        DescribeAlarmContentTemplatesRequest request = new DescribeAlarmContentTemplatesRequest();
        
        // 不设置projectId，应该验证失败
        try {
            client.describeAlarmContentTemplates(request);
            fail("Expected LogException due to missing projectId");
        } catch (LogException e) {
            // 期望的异常
            assertEquals("InvalidArgument", e.getErrorCode());
            System.out.println("Validation test passed - correctly caught missing projectId");
        }
    }
}