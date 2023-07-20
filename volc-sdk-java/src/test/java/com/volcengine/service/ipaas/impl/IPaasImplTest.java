package com.volcengine.service.ipaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.ipaas.request.DetailInstanceRequest;
import com.volcengine.model.ipaas.request.ListHostRequest;
import com.volcengine.model.ipaas.request.ListInstanceRequest;
import com.volcengine.model.ipaas.response.DetailInstanceResponse;
import com.volcengine.model.ipaas.response.Instance;
import com.volcengine.model.ipaas.response.ListHostResponse;
import com.volcengine.model.ipaas.response.ListInstanceResponse;
import com.volcengine.service.ipaas.IPaasService;
import junit.framework.TestCase;

public class IPaasImplTest extends TestCase {
    private final IPaasService iPaasService = IPaasServiceImpl.getInstance();

    {
        String accessKey = "*********";
        iPaasService.setAccessKey(accessKey);
        String secretKey = "**********";
        iPaasService.setSecretKey(secretKey);
    }

    public void testListHost() {
        ListHostRequest listHostRequest = new ListHostRequest();
        listHostRequest.setProductId("1663421372438679552");
        listHostRequest.setInstanceID("i-1770391901184029");
        listHostRequest.setDetail(true);
        try {
            ListHostResponse listHostResponse = iPaasService.listHost(listHostRequest);
            ListHostResponse.HostList hosts = listHostResponse.getResult();
            System.out.printf(JSON.toJSONString(hosts));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testListInstance() {
        ListInstanceRequest listInstanceRequest = new ListInstanceRequest();
        listInstanceRequest.setProductId("1663421372438679552");
        //listInstanceRequest.setInstanceID("i-1770391901184029");
        listInstanceRequest.setDetail(true);
        try {
            ListInstanceResponse listInstanceResponse = iPaasService.listInstance(listInstanceRequest);
            ListInstanceResponse.InstanceList instances = listInstanceResponse.getResult();
            System.out.printf(JSON.toJSONString(instances));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testDetailInstance() {
        DetailInstanceRequest detailInstanceRequest = new DetailInstanceRequest();
        detailInstanceRequest.setInstanceID("i-1770391901184029");
        try {
            DetailInstanceResponse detailInstanceResponse = iPaasService.detailInstance(detailInstanceRequest);
            Instance instance = detailInstanceResponse.getResult();
            System.out.printf(JSON.toJSONString(instance));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
