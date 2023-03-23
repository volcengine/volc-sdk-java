package com.volcengine.service.contentsecurity;

import com.volcengine.model.request.ImageRiskResultRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.response.ImageRiskDetectionResponse;
import com.volcengine.model.response.MobileStatusResponseV2;
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

    public void testMobileStatusV2() throws Exception {
        ContentSecurityService service = initService();

        ImageRiskResultRequest req = new ImageRiskResultRequest();
        req.setAppId(0000);
        req.setService("image_content_risk");
        req.setDataId("dataId");
//        req.setParameters("{\"operate_time\":1617960951,\"mobile\":\"\"}");
        ImageRiskDetectionResponse result = service.ImageRiskResultV2(req);
        System.out.println("");
    }
}
