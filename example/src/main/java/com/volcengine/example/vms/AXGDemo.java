package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.*;
import com.volcengine.service.vms.response.CreateAXGGroupResponse;
import com.volcengine.service.vms.response.OperateResponse;
import com.volcengine.service.vms.response.QuerySubscriptionResponse;
import com.volcengine.service.vms.response.SecretBindResponse;

public class AXGDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("ak ");
        vmsService.setSecretKey("sk ");
    }

    public static void main(String[] args) {
        testBindAXG();
    }

    private static void testBindAXG(){
        try {
            BindAXGRequest bindAXGRequest = new BindAXGRequest();
            bindAXGRequest.setNumberPoolNo("NP1760xxxx10904269");
            bindAXGRequest.setPhoneNoA("19200000000");
            bindAXGRequest.setPhoneNoB("19200000000");
            bindAXGRequest.setExpireTime(1761030838);
            bindAXGRequest.setUserData("userDate");
            bindAXGRequest.setOutId("outID");
            bindAXGRequest.setGroupName("测试");
            bindAXGRequest.setGroupNumbers(Lists.newArrayList("13900000000"));
            SecretBindResponse response = vmsService.bindAXG(bindAXGRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void testUnbindAXG(){
        try {
            UnbindAXGRequest unbindAXGRequest = new UnbindAXGRequest();
            unbindAXGRequest.setNumberPoolNo("NP1760xxxx10904269");
            unbindAXGRequest.setSubId("SS1760945125168448b6w66orfqsi0");
            unbindAXGRequest.setDelGroup(true);
            OperateResponse response = vmsService.unbindAXG(unbindAXGRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void testUpdateAXG(){
        try {
            UpdateAXGRequest updateAXGRequest = new UpdateAXGRequest();
            updateAXGRequest.setNumberPoolNo("NP1760xxxx10904269");
            updateAXGRequest.setSubId("SS17609455300e1facf6w66orfr1f0");
            updateAXGRequest.setUpdateType("updateExpireTime");
            updateAXGRequest.setExpireTime(1761030838);
            updateAXGRequest.setUserData("userDate");
            OperateResponse response = vmsService.updateAXG(updateAXGRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void testCreateAXGGroup(){
        try {
            CreateAXGGroupRequest createAXGGroupRequest = new CreateAXGGroupRequest();
            createAXGGroupRequest.setNumberPoolNo("NP1760xxxx10904269");
            createAXGGroupRequest.setGroupName("测试");
            createAXGGroupRequest.setExpireTime(1761030838);
            createAXGGroupRequest.setNumbers(Lists.newArrayList("13900000000"));
            CreateAXGGroupResponse response = vmsService.createAXGGroup(createAXGGroupRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void testDeleteAXGGroup(){
        try {
            DeleteAXGGroupRequest deleteAXGGroupRequest = new DeleteAXGGroupRequest();
            deleteAXGGroupRequest.setNumberPoolNo("NP1760xxxx10904269");
            deleteAXGGroupRequest.setGroupId("G17609455300e1facf6w66orfr1f0");
            OperateResponse response = vmsService.deleteAXGGroup(deleteAXGGroupRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void testUpdateAXGGroup(){
        try {
            UpdateAXGGroupRequest updateAXGGroupRequest = new UpdateAXGGroupRequest();
            updateAXGGroupRequest.setNumberPoolNo("NP1760xxxx10904269");
            updateAXGGroupRequest.setGroupId("G17609455300e1facf6w66orfr1f0");
            updateAXGGroupRequest.setGroupName("测试");
            updateAXGGroupRequest.setExpireTime(1761030838);
            OperateResponse response = vmsService.updateAXGGroup(updateAXGGroupRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void querySubscription(){
        try {
            SpecificSubIdRequest specificSubIdRequest = new SpecificSubIdRequest();
            specificSubIdRequest.setNumberPoolNo("NP1760xxxx10904269");
            specificSubIdRequest.setSubId("SS17609455300e1facf6w66orfr1f0");
            QuerySubscriptionResponse response = vmsService.querySubscription(specificSubIdRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
