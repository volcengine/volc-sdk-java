package com.volcengine.service.vod.impl;

import com.volcengine.service.vod.IVodService;
import junit.framework.TestCase;

public class VodServiceImplTest extends TestCase {

    public void testCreateSha1HlsDrmAuthToken() {
        IVodService vodService = VodServiceImpl.getInstance();


        // call below method if you dont set ak and sk in ～/.vcloud/config
         vodService.setAccessKey("your ak");
         vodService.setSecretKey("your sk");

        try {
            String resp = vodService.createSha1HlsDrmAuthToken(360000L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}