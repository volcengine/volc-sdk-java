package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListCdnTasksRequest;
import com.volcengine.service.vod.model.response.VodListCdnTasksResponse;

public class VodListCdnTasksDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListCdnTasksRequest.Builder input = com.volcengine.service.vod.model.request.VodListCdnTasksRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setTaskId("your task id");
            input.setDomainName("your domain name");
            input.setTaskType("your task type");
            input.setStatus("your status");
            input.setStartTimestamp(0);
            input.setEndTimestamp(0);
            input.setPageNum(1);
            input.setPageSize(10);
            VodListCdnTasksResponse resp = vodService.listCdnTasks(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
