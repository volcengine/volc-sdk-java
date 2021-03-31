package com.volcengine.service.vod.impl;

import com.volcengine.model.vod.request.VodGetPlayInfoRequest;
import com.volcengine.service.vod.IVodService;
import junit.framework.TestCase;

public class VodServiceImplTest extends TestCase {

    public void testCreateSha1HlsDrmAuthToken() {
        IVodService vodService = VodServiceImpl.getInstance();


        // call below method if you dont set ak and sk in ～/.vcloud/config
         vodService.setAccessKey("AKLTZDEzNDQ3YmQyYmQ4NGNjMWFhNWM0MDIwNzc1M2Y1ZjU");
         vodService.setSecretKey("UwJMdogtsC7LLaEg2SdorLX8aADQKbxBcqbFmQZISwIePF4HVjUf7veDRv2ovp08");

        try {
            String resp = vodService.createSha1HlsDrmAuthToken(360000);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void testCreateSha256HlsDrmAuthToken() {
    }
}