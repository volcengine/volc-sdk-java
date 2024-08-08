package com.volcengine.service.acep;

import com.volcengine.model.acep.*;

import junit.framework.TestCase;

public class ACEPTest  extends TestCase {
    private final ACEPService  service = ACEPService.getInstance();

    {
        String accessKey = "";
        service.setAccessKey(accessKey);
        String secretKey = "";
        service.setSecretKey(secretKey);
    }

    public void testListPod() {
        ListPodQuery query = new ListPodQuery();
        query.setProductId("1591495366954455040");
        try {
            ListPodRes resp = service.listPod(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
