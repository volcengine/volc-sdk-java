package com.volcengine.example.cms;

import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsApiServiceImpl;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

public class Instance {
    public static CmsApiService getApiInstance() {
        return ApiInner.instance;
    }

    private static class ApiInner {
        private static final CmsApiService instance = new CmsApiServiceImpl("ak", "sk");
    }

    public static CmsPlatformService getPlatformInstance() {
        return PlatformInner.instance;
    }

    private static class PlatformInner {
        private static final CmsPlatformService instance = new CmsPlatformServiceImpl("ak", "sk");
    }
}
