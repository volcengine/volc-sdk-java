package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.CommonPo;
import com.volcengine.model.stream.consumer.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.MonitorService;
import com.volcengine.service.stream.StreamConsumerConfig;
import com.volcengine.service.stream.StreamConsumerService;
import org.apache.http.HttpHost;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamConsumerServiceImpl extends BaseServiceImpl implements StreamConsumerService {
    static HttpHost Mproxy;
    boolean needMonitor;

    private StreamConsumerServiceImpl() {
        super(StreamConsumerConfig.serviceInfo, StreamConsumerConfig.apiInfoList);
        needMonitor = true;
    }

    private StreamConsumerServiceImpl(HttpHost proxy) {
        super(StreamConsumerConfig.serviceInfo, proxy, StreamConsumerConfig.apiInfoList);
        needMonitor = true;
    }

    //单例
    private volatile static StreamConsumerServiceImpl instance = null;

    public static StreamConsumerService getInstance() {
        if (instance == null) {
            synchronized (StreamConsumerServiceImpl.class) {
                if (instance == null) {
                    instance = new StreamConsumerServiceImpl();
                }
            }
        }
        return instance;
    }

    public static StreamConsumerService getInstance(HttpHost proxy) {
        if (instance == null) {
            synchronized (StreamConsumerServiceImpl.class) {
                if (instance == null) {
                    instance = new StreamConsumerServiceImpl(proxy);
                    Mproxy = proxy;
                }
            }
        }
        return instance;
    }

    @Override
    public void SetNeedMonitor(boolean open) {
        needMonitor = open;
    }

    @Override
    public FollowActionResponse followAction(FollowActionRequest followActionRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.FollowAction, Utils.mapToPairList(Utils.paramsToMap(followActionRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followActionRequest.getPartner(), "", followActionRequest.getAccessToken(),
                Const.FollowAction, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        FollowActionResponse followActionResponse = JSON.parseObject(response.getData(), FollowActionResponse.class);
        if (followActionResponse.getResponseMetadata().getError() == null || followActionResponse.getResponseMetadata().getError().getCodeN() == 0) {
            followActionResponse.setResult("success");
        }
        return followActionResponse;
    }

    @Override
    public UnfollowActionResponse unfollowAction(UnfollowActionRequest unfollowActionRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.UnfollowAction, Utils.mapToPairList(Utils.paramsToMap(unfollowActionRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, unfollowActionRequest.getPartner(), "", unfollowActionRequest.getAccessToken(),
                Const.UnfollowAction, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UnfollowActionResponse unfollowActionResponse = JSON.parseObject(response.getData(), UnfollowActionResponse.class);
        if (unfollowActionResponse.getResponseMetadata().getError() == null || unfollowActionResponse.getResponseMetadata().getError().getCodeN() == 0) {
            unfollowActionResponse.setResult("success");
        }
        return unfollowActionResponse;
    }

    @Override
    public FollowListResponse followList(FollowListRequest followListRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.FollowList, Utils.mapToPairList(Utils.paramsToMap(followListRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followListRequest.getPartner(), "", followListRequest.getAccessToken(),
                Const.FollowList, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowListResponse.class);
    }

    @Override
    public FollowCheckResponse followCheck(FollowCheckRequest followCheckRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.FollowCheck, Utils.mapToPairList(Utils.paramsToMap(followCheckRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followCheckRequest.getPartner(), "", followCheckRequest.getAccessToken(),
                Const.FollowCheck, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowCheckResponse.class);
    }

    @Override
    public SingleArticleResponse singleArticle(SingleArticleRequest singleArticleRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.SingleArticle, Utils.mapToPairList(Utils.paramsToMap(singleArticleRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, singleArticleRequest.getPartner(), "", singleArticleRequest.getAccessToken(),
                Const.SingleArticle, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SingleArticleResponse.class);
    }

    @Override
    public MultiArticlesResponse multiArticles(MultiArticlesRequest multiArticlesRequest) throws Exception {
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(multiArticlesRequest);
        if (requestMap.containsKey("GroupIDs")) {
            String groupIdsStr = requestMap.get("GroupIDs");
            groupIdsStr = groupIdsStr.replaceAll("%2C", ",");
            requestMap.put("GroupIDs", groupIdsStr);
        }
        RawResponse response = query(Const.MultiArticle, Utils.mapToPairList(requestMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, multiArticlesRequest.getPartner(), "", multiArticlesRequest.getAccessToken(),
                Const.MultiArticle, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        String jsonString = new String(response.getData());
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        MultiArticlesResponse getArticlesResponse = new MultiArticlesResponse();
        List<SingleArticleResponse.Result> articleList = new ArrayList<>();
        JSONObject result1 = jsonObject.getJSONObject("Result");
        JSONObject responseMetadataJson = jsonObject.getJSONObject("ResponseMetadata");
        CommonPo.ResponseMetadata responseMetadata = JSONObject.toJavaObject(responseMetadataJson, CommonPo.ResponseMetadata.class);
        getArticlesResponse.setResponseMetadata(responseMetadata);
        if (result1 == null) {
            return getArticlesResponse;
        }
        for (Map.Entry<String, Object> entry : ((Map<String, Object>) result1).entrySet()) {
            SingleArticleResponse.Result articleInfo = JSONObject.toJavaObject((JSONObject) entry.getValue(), SingleArticleResponse.Result.class);
            articleInfo.setGroupId(entry.getKey());
            articleList.add(articleInfo);
        }
        MultiArticlesResponse.Result result = new MultiArticlesResponse.Result();
        result.setArticleInfos(articleList);
        getArticlesResponse.setResult(result);
        return getArticlesResponse;
    }

    private void sendToMonitor(StreamConsumerService streamConsumerService, String partner, String category, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency) {
        if (needMonitor) {
            MonitorService monitorService = MonitorServiceImpl.getInstance(streamConsumerService.getAccessKey(), streamConsumerService.getSecretKey(), Mproxy);
            monitorService.monitor(partner, category, accessToken, action, httpCode, topRespCode, respData, latency);
        }
    }
}
