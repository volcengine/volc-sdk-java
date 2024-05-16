package com.volcengine.service.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.contentSecurity.ContentSecurityService;
import com.volcengine.service.contentSecurity.impl.ContentSecurityServiceImpl;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

public class ContentSecurityServiceImplTest extends TestCase {
    private ContentSecurityService initService() {
        ContentSecurityService service = ContentSecurityServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("Sk");
        return service;
    }

    public void testCreateCustomContents() {
        ContentSecurityService service = initService();
        CreateCustomContentsRequest req = new CreateCustomContentsRequest(430921, "text_risk", "BLOCK","description", "test_text_lib_01" , "text_lib", "exact", "");
        try {
            AsyncRiskDetectionResponse resp = service.CreateCustomContents(req);
            System.out.println(resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testUploadCustomContents() {
        ContentSecurityService service = initService();
        UploadCustomContentsRequest req = new UploadCustomContentsRequest(430921, "text_risk","test_text_lib_01",  Arrays.asList("测试文本1", "测试文本2"));
        try {
            AsyncRiskDetectionResponse resp = service.UploadCustomContents(req);
            System.out.println(resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDeleteCustomContents() {
        ContentSecurityService service = initService();
        UploadCustomContentsRequest req = new UploadCustomContentsRequest(430921, "text_risk","test_text_lib_01", Collections.singletonList("测试文本1"));
        try {
            AsyncRiskDetectionResponse resp = service.DeleteCustomContents(req);
            System.out.println(resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}