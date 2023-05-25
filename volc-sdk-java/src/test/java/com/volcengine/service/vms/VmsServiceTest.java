package com.volcengine.service.vms;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.*;
import com.volcengine.service.vms.response.*;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
public class VmsServiceTest {

    public static void numberList() throws Exception {
        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("你的ak");
        vmsService.setSecretKey("你的sk");
        NumberListRequest request = new NumberListRequest();
        request.setNumberPoolNo("xxxxx");
        request.setNumberPoolTypeCode(101);
        request.setOffset(0L);
        request.setLimit(2);

        NumberListResponse response = vmsService.queryNumberList(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void selectNumber() throws Exception {
        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("你的ak");
        vmsService.setSecretKey("你的sk");
        SelectNumberRequest request = new SelectNumberRequest();
        request.setNumberPoolNo("xxx");

        SelectNumberResponse response = vmsService.selectNumber(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void enableOrDisableNumber() throws Exception {
        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("你的ak");
        vmsService.setSecretKey("你的sk");
        EnableNumberRequest request = new EnableNumberRequest();
        request.setNumberList(Lists.newArrayList("xxx"));
        request.setEnableCode(1);
        EnableNumberResponse response = vmsService.enableOrDisableNumber(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void createNumberPool() throws Exception {
        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("你的ak");
        vmsService.setSecretKey("你的sk");
        CreateNumberPoolRequest request = new CreateNumberPoolRequest();
        request.setName("语音sip-test");
        request.setServiceType(100);
        request.setSubServiceType(101);
        CreateNumberPoolResponse numberPool = vmsService.createNumberPool(request);
        System.out.println(JSON.toJSONString(numberPool));
    }

    public static void updateNumberPool() throws Exception {
        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("你的ak");
        vmsService.setSecretKey("你的sk");
        UpdateNumberPoolRequest request = new UpdateNumberPoolRequest();
        request.setName("sip-test");
        request.setServiceType(100);
        request.setSubServiceType(101);
        request.setNumberPoolNo("xxx");
        UpdateNumberPoolResponse numberPool = vmsService.updateNumberPool(request);
        System.out.println(JSON.toJSONString(numberPool));
    }
}
