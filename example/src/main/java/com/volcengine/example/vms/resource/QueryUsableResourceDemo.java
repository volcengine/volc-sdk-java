package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.response.CommonResponse;
import com.volcengine.service.vms.response.ResourceResult;

import java.util.List;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class QueryUsableResourceDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            CommonResponse<List<ResourceResult>> commonResponse = vmsService.queryUsableResource(0);
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
