package com.volcengine.example.contentSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.contentSecurity.ContentSecurityService;
import com.volcengine.service.contentSecurity.impl.ContentSecurityServiceImpl;

public class ContentSecurityDemo {
    public static void main(String[] args) {
        ContentSecurityService contentSecurityService = ContentSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        contentSecurityService.setAccessKey("");
        contentSecurityService.setSecretKey("");
    }
}
