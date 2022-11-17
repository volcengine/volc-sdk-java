package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;


/**
 * 用量查询相关demo
 */
public class LiveUsageQuryDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        describeLiveBandwidthDataDemo(liveService);
        describeLiveP95PeakBandwidthDataDemo(liveService);
        describeLiveTimeShiftDataDemo(liveService);
        describeLiveTrafficDataDemo(liveService);
        describeRecordDataDemo(liveService);
        describeSnapshotDataDemo(liveService);
        describeTranscodeDataDemo(liveService);
        describePullToPushBandwidthDataDemo(liveService);
        describeLiveAuditDataDemo(liveService);
    }

    public static void describeLiveBandwidthDataDemo(LiveService liveService) {
        String jsonStr = "{\n" +
                "    \"DomainList\": [\"domain\"],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeLiveBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveBandwidthDataRequest.class);

        try {
            DescribeLiveBandwidthDataResponse response = liveService.describeLiveBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveTrafficDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\": [],\n" +
                "    \"StartTime\": \"2022-04-25T00:00:00Z\",\n" +
                "    \"EndTime\":\"2022-04-25T23:59:00Z\",\n" +
                "    \"Aggregation\":300\n" +
                "}";
        DescribeLiveTrafficDataRequest request = JSON.parseObject(jsonStr, DescribeLiveTrafficDataRequest.class);
        try {
            DescribeLiveTrafficDataResponse response = liveService.describeLiveTrafficData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveP95PeakBandwidthDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeLiveP95PeakBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribeLiveP95PeakBandwidthDataRequest.class);
        try {
            DescribeLiveP95PeakBandwidthDataResponse response = liveService.describeLiveP95PeakBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeTranscodeDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"StartTime\": \"2022-03-07T00:00:00+08:00\",\n" +
                "    \"EndTime\":\"2022-03-08T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeTranscodeDataRequest request = JSON.parseObject(jsonStr, DescribeTranscodeDataRequest.class);
        try {
            DescribeTranscodeDataResponse response = liveService.describeTranscodeData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeSnapshotDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\":[\"example.com\",\"example2.com\"],\n" +
                "    \"StartTime\": \"2022-03-07T00:00:00+08:00\",\n" +
                "    \"EndTime\":\"2022-03-08T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeSnapshotDataRequest request = JSON.parseObject(jsonStr, DescribeSnapshotDataRequest.class);
        try {
            DescribeSnapshotDataResponse response = liveService.describeSnapshotData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeRecordDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00Z\",\n" +
                "    \"EndTime\": \"2021-04-13T00:10:00Z\",\n" +
                "    \"Aggregation\": 300\n" +
                "}";
        DescribeRecordDataRequest request = JSON.parseObject(jsonStr, DescribeRecordDataRequest.class);
        try {
            DescribeRecordDataResponse response = liveService.describeRecordData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveTimeShiftDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"Aggregation\": 86400,\n" +
                "    \"EndTime\": \"2022-02-17T23:59:59+08:00\",\n" +
                "    \"StartTime\": \"2022-02-11T00:00:00+08:00\",\n" +
                "    \"Vhosts\": [\"www.example.com\"]\n" +
                "}";
        DescribeLiveTimeShiftDataRequest request = JSON.parseObject(jsonStr, DescribeLiveTimeShiftDataRequest.class);
        try {
            DescribeLiveTimeShiftDataResponse response = liveService.describeLiveTimeShiftData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describePullToPushBandwidthDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\"],\n" +
                "    \"DstAddrTypeList\": [\"live\",\"Third\"],\n" +
                "    \"StartTime\": \"2021-04-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2021-04-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 300,\n" +
                "    \"ShowDetail\": true\n" +
                "}";
        DescribePullToPushBandwidthDataRequest request = JSON.parseObject(jsonStr, DescribePullToPushBandwidthDataRequest.class);
        try {
            DescribePullToPushBandwidthDataResponse response = liveService.describePullToPushBandwidthData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void describeLiveAuditDataDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"DomainList\": [\"example.com\", \"example2.com\"],\n" +
                "    \"DetailField\": [\"Domain\"],\n" +
                "    \"StartTime\": \"2022-07-13T00:00:00+08:00\",\n" +
                "    \"EndTime\": \"2022-07-14T00:00:00+08:00\",\n" +
                "    \"Aggregation\": 86400\n" +
                "}";
        DescribeLiveAuditDataRequest request = JSON.parseObject(jsonStr, DescribeLiveAuditDataRequest.class);
        try {
            DescribeLiveAuditDataResponse response = liveService.describeLiveAuditData(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
