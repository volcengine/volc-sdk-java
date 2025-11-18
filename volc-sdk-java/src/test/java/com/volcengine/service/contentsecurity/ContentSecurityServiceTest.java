package com.volcengine.service.contentsecurity;

import com.volcengine.model.request.ImageRiskResultRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.businessSecurity.BusinessSecurityService;
import com.volcengine.service.businessSecurity.impl.BusinessSecurityServiceImpl;
import com.volcengine.service.contentSecurity.ContentSecurityService;
import com.volcengine.service.contentSecurity.impl.ContentSecurityServiceImpl;
import junit.framework.TestCase;

public class ContentSecurityServiceTest extends TestCase {
    private ContentSecurityService initService() {
        ContentSecurityService service = ContentSecurityServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("SK");
        return service;
    }

}
