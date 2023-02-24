package com.volcengine.service.numberpool;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.volcengine.service.numberpool.impl.NumberPoolServiceImpl;
import com.volcengine.service.numberpool.request.CreateNumberPoolRequest;
import com.volcengine.service.numberpool.request.EnableNumberRequest;
import com.volcengine.service.numberpool.request.NumberListRequest;
import com.volcengine.service.numberpool.request.SelectNumberRequest;
import com.volcengine.service.numberpool.request.UpdateNumberPoolRequest;
import com.volcengine.service.numberpool.response.CreateNumberPoolResponse;
import com.volcengine.service.numberpool.response.EnableNumberResponse;
import com.volcengine.service.numberpool.response.NumberListResponse;
import com.volcengine.service.numberpool.response.SelectNumberResponse;
import com.volcengine.service.numberpool.response.UpdateNumberPoolResponse;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
public class NumberPoolServiceTest {

    public static void numberList() throws Exception {
        NumberPoolService numberPoolService = NumberPoolServiceImpl.getInstance();
        numberPoolService.setAccessKey("你的ak");
        numberPoolService.setSecretKey("你的sk");
        NumberListRequest request = new NumberListRequest();
        request.setNumberPoolNo("xxxxx");
        request.setNumberPoolTypeCode(101);
        request.setOffset(0L);
        request.setLimit(2);

        NumberListResponse response = numberPoolService.queryNumberList(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void selectNumber() throws Exception {
        NumberPoolService numberPoolService = NumberPoolServiceImpl.getInstance();
        numberPoolService.setAccessKey("你的ak");
        numberPoolService.setSecretKey("你的sk");
        SelectNumberRequest request = new SelectNumberRequest();
        request.setNumberPoolNo("xxx");

        SelectNumberResponse response = numberPoolService.selectNumber(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void enableOrDisableNumber() throws Exception {
        NumberPoolService numberPoolService = NumberPoolServiceImpl.getInstance();
        numberPoolService.setAccessKey("你的ak");
        numberPoolService.setSecretKey("你的sk");
        EnableNumberRequest request = new EnableNumberRequest();
        request.setNumberList(Lists.newArrayList("xxx"));
        request.setEnableCode(1);
        EnableNumberResponse response = numberPoolService.enableOrDisableNumber(request);
        System.out.println(JSON.toJSONString(response));
    }

    public static void createNumberPool() throws Exception {
        NumberPoolService numberPoolService = NumberPoolServiceImpl.getInstance();
        numberPoolService.setAccessKey("你的ak");
        numberPoolService.setSecretKey("你的sk");
        CreateNumberPoolRequest request = new CreateNumberPoolRequest();
        request.setName("语音sip-test");
        request.setServiceType(100);
        request.setSubServiceType(101);
        CreateNumberPoolResponse numberPool = numberPoolService.createNumberPool(request);
        System.out.println(JSON.toJSONString(numberPool));
    }

    public static void updateNumberPool() throws Exception {
        NumberPoolService numberPoolService = NumberPoolServiceImpl.getInstance();
        numberPoolService.setAccessKey("你的ak");
        numberPoolService.setSecretKey("你的sk");
        UpdateNumberPoolRequest request = new UpdateNumberPoolRequest();
        request.setName("sip-test");
        request.setServiceType(100);
        request.setSubServiceType(101);
        request.setNumberPoolNo("xxx");
        UpdateNumberPoolResponse numberPool = numberPoolService.updateNumberPool(request);
        System.out.println(JSON.toJSONString(numberPool));
    }
}
