package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;
import com.volcengine.service.notify.model.request.CreateTaskRequest;
import com.volcengine.service.notify.model.request.PhoneParam;
import com.volcengine.service.notify.model.response.CommonResponse;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TaskDemo {
    public static void main(String[] args) {
        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("you sk");

        try {
            CommonResponse operationResponse = notifyService.pauseTask("cc4cc383f8464066851b6283838cb569");

            System.out.println(JSON.toJSONString(operationResponse));

            //语音文件任务
            PhoneParam phoneParam = PhoneParam.builder().phone("19900000000").build();
            CreateTaskRequest createTaskRequest = CreateTaskRequest.builder().concurrency(1).name("test1").resource("618f1ee1d8a94d4d8eaee06482fda70e")
                    .numberPoolNo("NP162215338604095636").numberList(Arrays.asList("075561169508")).selectNumberType(0)
                    .startTime(new Date()).endTime(new Date(System.currentTimeMillis() + 600 * 1000)).phoneList(Arrays.asList(phoneParam)).build();

            operationResponse = notifyService.createTask(createTaskRequest);
            System.out.println(JSON.toJSONString(operationResponse));

            //tts模板任务
            Map<String,Object> map = new HashMap<>();
            map.put("name","老王");
            map.put("act_name","白菜");
            PhoneParam phoneParam2 = PhoneParam.builder().phone("19900000000").phoneParam(map).build();
            CreateTaskRequest createTaskRequest2 = CreateTaskRequest.builder().concurrency(1).name("test2").resource("6708ef10ae7b46f8afba135b2adc5dc3")
                    .numberPoolNo("NP162215338604095636").numberList(Arrays.asList("075561169508")).selectNumberType(0)
                    .startTime(new Date()).endTime(new Date(System.currentTimeMillis() + 600 * 1000)).phoneList(Arrays.asList(phoneParam2)).build();

            operationResponse = notifyService.createTask(createTaskRequest2);
            System.out.println(JSON.toJSONString(operationResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
