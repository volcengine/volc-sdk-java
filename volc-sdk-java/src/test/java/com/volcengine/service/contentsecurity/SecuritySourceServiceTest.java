package com.volcengine.service.contentsecurity;

import com.volcengine.service.contentSecurity.SecuritySourceService;
import com.volcengine.service.contentSecurity.impl.SecuritySourceServiceImpl;
import junit.framework.TestCase;

public class SecuritySourceServiceTest extends TestCase {

    private SecuritySourceService initService() {
        SecuritySourceService service = SecuritySourceServiceImpl.getInstance();
        service.setAccessKey("AK");
        service.setSecretKey("SK");
        return service;
    }


}
