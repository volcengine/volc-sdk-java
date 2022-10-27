package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.CommonPo;
import com.volcengine.model.stream.log.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.LogConfig;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.MonitorService;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;

import java.net.URLDecoder;
import java.util.*;


public class LogServiceImpl extends BaseServiceImpl implements LogService {
    static HttpHost Mproxy;
    boolean needMonitor;

    private LogServiceImpl() {
        super(LogConfig.serviceInfo, LogConfig.apiInfoList);
        needMonitor = true;
    }

    private LogServiceImpl(HttpHost proxy) {
        super(LogConfig.serviceInfo, proxy, LogConfig.apiInfoList);
        needMonitor = true;
    }

    //单例
    private volatile static LogServiceImpl instance = null;

    public static LogService getInstance() {
        if (instance == null) {
            synchronized (LogServiceImpl.class) {
                if (instance == null) {
                    instance = new LogServiceImpl();
                }
            }
        }
        return instance;
    }

    public static LogService getInstance(HttpHost proxy) {
        if (instance == null) {
            synchronized (LogServiceImpl.class) {
                if (instance == null) {
                    instance = new LogServiceImpl(proxy);
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
    public LogResponse clickLog(ClickLogRequest clickLogRequest) throws Exception {
//        if (StringUtils.isBlank(clickLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.ClickLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(clickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, clickLogRequest.getPartner(), clickLogRequest.getCategory(), clickLogRequest.getAccessToken(),
                Const.ClickLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse stayLog(StayLogRequest stayLogRequest) throws Exception {
//        if (StringUtils.isBlank(stayLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.StayLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(stayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.StayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, stayLogRequest.getPartner(), stayLogRequest.getCategory(), stayLogRequest.getAccessToken(),
                Const.StayLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoPlayLog(VideoPlayLogRequest videoPlayLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoPlayLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoPlayLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoPlayLogRequest.getPartner(), videoPlayLogRequest.getCategory(), videoPlayLogRequest.getAccessToken(),
                Const.VideoPlayLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoOverLog(VideoOverLogRequest videoOverLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoOverLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoOverLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoOverLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoOverLogRequest.getPartner(), videoOverLogRequest.getCategory(), videoOverLogRequest.getAccessToken(),
                Const.VideoOverLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse singleShowLog(SingleShowLogRequest singleShowLogRequest) throws Exception {
//        if (StringUtils.isBlank(singleShowLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.SingleShowLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(singleShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.SingleShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, singleShowLogRequest.getPartner(), singleShowLogRequest.getCategory(), singleShowLogRequest.getAccessToken(),
                Const.SingleShowLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse multiShowLog(MultiShowLogRequest multiShowLogRequest) throws Exception {
//        for (MultiShowLogRequest.Body body : multiShowLogRequest.getBody()) {
//            if (StringUtils.isBlank(body.getReqId())) {
//                return GenNoReqIdResponse(Const.MultiShowLog);
//            }
//        }
        long start = System.currentTimeMillis();
        List<NameValuePair> nameValuePairList = Utils.mapToPairList(Utils.paramsToMap(multiShowLogRequest));
        String jsonBody = "";
        for (NameValuePair nameValuePair : nameValuePairList) {
            if (nameValuePair.getName().equals("Body")) {
                jsonBody = nameValuePair.getValue();
            }
        }
        jsonBody = "[" + URLDecoder.decode(jsonBody, "UTF-8") + "]";
        nameValuePairList.removeIf(n -> n.getName().equals("Body"));
        RawResponse response = json(Const.MultiShowLog, nameValuePairList, jsonBody);
        long end = System.currentTimeMillis();
        sendToMonitor(instance, multiShowLogRequest.getPartner(), "", multiShowLogRequest.getAccessToken(),
                Const.MultiShowLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse shareLog(ShareLogRequest shareLogRequest) throws Exception {
//        if (StringUtils.isBlank(shareLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.ShareLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(shareLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ShareLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, shareLogRequest.getPartner(), shareLogRequest.getCategory(), shareLogRequest.getAccessToken(),
                Const.ShareLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse favouriteLog(FavouriteLogRequest favouriteLogRequest) throws Exception {
//        if (StringUtils.isBlank(favouriteLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.FavouriteLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(favouriteLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.FavouriteLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, favouriteLogRequest.getPartner(), favouriteLogRequest.getCategory(), favouriteLogRequest.getAccessToken(),
                Const.FavouriteLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse verifyLog(VerifyLogRequest verifyLogRequest) throws Exception {
//        if (StringUtils.isBlank(verifyLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VerifyLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(verifyLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VerifyLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, verifyLogRequest.getPartner(), "", verifyLogRequest.getAccessToken(),
                Const.VerifyLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse followLog(FollowLogRequest followLogRequest) throws Exception {
//        for (FollowLogRequest.Body body : followLogRequest.getBody()) {
//            if (StringUtils.isBlank(body.getReqId())) {
//                return GenNoReqIdResponse(Const.FollowLog);
//            }
//        }
        long start = System.currentTimeMillis();
        List<NameValuePair> nameValuePairList = Utils.mapToPairList(Utils.paramsToMap(followLogRequest));
        String jsonBody = "";
        for (NameValuePair nameValuePair : nameValuePairList) {
            if (nameValuePair.getName().equals("Body")) {
                jsonBody = nameValuePair.getValue();
                break;
            }
        }
        jsonBody = URLDecoder.decode(jsonBody, "UTF-8");
        nameValuePairList.removeIf(n -> n.getName().equals("Body"));
        RawResponse response = json(Const.FollowLog, nameValuePairList, jsonBody);
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followLogRequest.getPartner(), "", followLogRequest.getAccessToken(),
                Const.FollowLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse unfollowLog(FollowLogRequest unfollowLogRequest) throws Exception {
//        for (FollowLogRequest.Body body : unfollowLogRequest.getBody()) {
//            if (StringUtils.isBlank(body.getReqId())) {
//                return GenNoReqIdResponse(Const.UnfollowLog);
//            }
//        }
        long start = System.currentTimeMillis();
        List<NameValuePair> nameValuePairList = Utils.mapToPairList(Utils.paramsToMap(unfollowLogRequest));
        String jsonBody = "";
        for (NameValuePair nameValuePair : nameValuePairList) {
            if (nameValuePair.getName().equals("Body")) {
                jsonBody = nameValuePair.getValue();
            }
        }
        jsonBody = URLDecoder.decode(jsonBody, "UTF-8");
        nameValuePairList.removeIf(n -> n.getName().equals("Body"));
        RawResponse response = json(Const.UnfollowLog, nameValuePairList, jsonBody);
        long end = System.currentTimeMillis();
        sendToMonitor(instance, unfollowLogRequest.getPartner(), "", unfollowLogRequest.getAccessToken(),
                Const.UnfollowLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse followCardLog(FollowCardLogRequest followCardLogRequest) throws Exception {
//        for (FollowCardLogRequest.Body body : followCardLogRequest.getBody()) {
//            if (StringUtils.isBlank(body.getReqId())) {
//                return GenNoReqIdResponse(Const.FollowCardLog);
//            }
//        }
        long start = System.currentTimeMillis();
        List<NameValuePair> nameValuePairList = Utils.mapToPairList(Utils.paramsToMap(followCardLogRequest));
        String jsonBody = "";
        for (NameValuePair nameValuePair : nameValuePairList) {
            if (nameValuePair.getName().equals("Body")) {
                jsonBody = nameValuePair.getValue();
            }
        }
        jsonBody = URLDecoder.decode(jsonBody, "UTF-8");
        nameValuePairList.removeIf(n -> n.getName().equals("Body"));
        RawResponse response = json(Const.FollowCardLog, nameValuePairList, jsonBody);
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followCardLogRequest.getPartner(), "", followCardLogRequest.getAccessToken(),
                Const.FollowCardLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse dislikeLog(DislikeLogRequest dislikeLogRequest) throws Exception {
//        for (DislikeLogRequest.Body body : dislikeLogRequest.getBody()) {
//            if (StringUtils.isBlank(body.getReqId())) {
//                return GenNoReqIdResponse(Const.DislikeLog);
//            }
//        }
        long start = System.currentTimeMillis();
        List<NameValuePair> nameValuePairList = Utils.mapToPairList(Utils.paramsToMap(dislikeLogRequest));
        String jsonBody = "";
        for (NameValuePair nameValuePair : nameValuePairList) {
            if (nameValuePair.getName().equals("Body")) {
                jsonBody = nameValuePair.getValue();
                break;
            }
        }
        jsonBody = "[" + URLDecoder.decode(jsonBody, "UTF-8") + "]";
        nameValuePairList.removeIf(n -> n.getName().equals("Body"));
        RawResponse response = json(Const.DislikeLog, nameValuePairList, jsonBody);
        long end = System.currentTimeMillis();
        sendToMonitor(instance, dislikeLogRequest.getPartner(), "", dislikeLogRequest.getAccessToken(),
                Const.DislikeLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoPlayDrawLog(VideoPlayDrawLogRequest videoPlayDrawLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoPlayDrawLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoPlayDrawLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoPlayDrawLogRequest.getPartner(), videoPlayDrawLogRequest.getCategory(), videoPlayDrawLogRequest.getAccessToken(),
                Const.VideoPlayDrawLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoOverDrawLog(VideoOverDrawLogRequest videoOverDrawLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoOverDrawLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoOverDrawLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoOverDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoOverDrawLogRequest.getPartner(), videoOverDrawLogRequest.getCategory(), videoOverDrawLogRequest.getAccessToken(),
                Const.VideoOverDrawLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse productShowLog(ProductShowLogRequest productShowLogRequest) throws Exception {
//        if (StringUtils.isBlank(productShowLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.ProductShowLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(productShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, productShowLogRequest.getPartner(), productShowLogRequest.getCategory(), productShowLogRequest.getAccessToken(),
                Const.ProductShowLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse pushLog(PushLogRequest pushLogRequest) throws Exception {
//        if (StringUtils.isBlank(pushLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.PushLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(pushLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.PushLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, pushLogRequest.getPartner(), pushLogRequest.getCategory(), pushLogRequest.getAccessToken(),
                Const.PushLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse productClickLog(ProductClickLogRequest productClickLogRequest) throws Exception {
//        if (StringUtils.isBlank(productClickLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.ProductClickLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(productClickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, productClickLogRequest.getPartner(), productClickLogRequest.getCategory(), productClickLogRequest.getAccessToken(),
                Const.ProductClickLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoPlayAutoLog(VideoPlayAutoLogRequest videoPlayAutoLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoPlayAutoLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoPlayAutoLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoPlayAutoLogRequest.getPartner(), videoPlayAutoLogRequest.getCategory(), videoPlayAutoLogRequest.getAccessToken(),
                Const.VideoPlayAutoLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    @Override
    public LogResponse videoOverAutoLog(VideoOverAutoLogRequest videoOverAutoLogRequest) throws Exception {
//        if (StringUtils.isBlank(videoOverAutoLogRequest.getReqId())) {
//            return GenNoReqIdResponse(Const.VideoOverAutoLog);
//        }
        long start = System.currentTimeMillis();
        Map<String, String> requestMap = Utils.paramsToMap(videoOverAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, videoOverAutoLogRequest.getPartner(), videoOverAutoLogRequest.getCategory(), videoOverAutoLogRequest.getAccessToken(),
                Const.VideoOverAutoLog, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LogResponse.class);
    }

    private Map<String, String> paramsFilter(Map<String, String> requestMap) {
        Map<String, String> paramsMap = new HashMap<>();
        for (String s : requestMap.keySet()) {
            paramsMap.put(s, requestMap.get(s));
        }
        paramsMap.remove("Timestamp");
        paramsMap.remove("Partner");
        paramsMap.remove("AccessToken");
        return paramsMap;
    }


    private LogResponse GenNoReqIdResponse(String action) {
        CommonPo.ResponseMetadata.Error error = new CommonPo.ResponseMetadata.Error();
        error.setCode("params invalid");
        error.setCodeN(22);
        error.setMessage("need reqId.");
        CommonPo.ResponseMetadata responseMetadata = new CommonPo.ResponseMetadata();
        responseMetadata.setAction(action);
        responseMetadata.setRegion("cn-north-1");
        responseMetadata.setRequestId("");
        responseMetadata.setService("content");
        responseMetadata.setVersion(Const.ContentVersion);
        responseMetadata.setError(error);

        LogResponse logResponse = new LogResponse();
        logResponse.setResponseMetadata(responseMetadata);
        return logResponse;
    }

    private void sendToMonitor(LogService logService, String partner, String category, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency) {
        if (needMonitor) {
            MonitorService monitorService = MonitorServiceImpl.getInstance(logService.getAccessKey(), logService.getSecretKey(), Mproxy);
            monitorService.monitor(partner, category, accessToken, action, httpCode, topRespCode, respData, latency);
        }
    }
}
