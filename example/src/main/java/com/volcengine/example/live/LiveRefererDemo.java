package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.DeleteRefererRequest;
import com.volcengine.model.live.request.DescribeRefererRequest;
import com.volcengine.model.live.request.UpdateRefererRequest;
import com.volcengine.model.live.response.DeleteRefererResponse;
import com.volcengine.model.live.response.DescribeRefererResponse;
import com.volcengine.model.live.response.UpdateRefererResponse;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Referer相关的demo
 */
public class LiveRefererDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();

        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //创建/更新防盗链配置
        updateRefererDemo(liveService);
        //关闭防盗链
        deleteRefererDemo(liveService);
        //查询防盗链内容
        describeRefereDemor(liveService);
    }

    /**
     * 创建/更新防盗链配置
     *
     * @param liveService
     */
    private static void updateRefererDemo(LiveService liveService) {
        UpdateRefererRequest request = new UpdateRefererRequest();
        try {
            UpdateRefererResponse response = liveService.updateReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭防盗链
     *
     * @param liveService
     */
    private static void deleteRefererDemo(LiveService liveService) {

        DeleteRefererRequest request = new DeleteRefererRequest();
        try {
            DeleteRefererResponse response = liveService.deleteReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询防盗链内容
     *
     * @param liveService
     */
    private static void describeRefereDemor(LiveService liveService) {

        DescribeRefererRequest request = new DescribeRefererRequest();
        try {
            DescribeRefererResponse response = liveService.describeReferer(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
