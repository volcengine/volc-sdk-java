package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.NameValuePair;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.log.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.LogConfig;
import com.volcengine.service.stream.LogService;

import java.net.Proxy;
import java.net.URLDecoder;
import java.util.*;


public class LogServiceImpl extends BaseServiceImpl implements LogService {
    private LogServiceImpl() {
        super(LogConfig.serviceInfo, LogConfig.apiInfoList);
    }

    private LogServiceImpl(Proxy proxy) {
        super(LogConfig.serviceInfo, proxy, LogConfig.apiInfoList);
    }

    public static LogService getInstance() {
        return new LogServiceImpl();
    }

    public static LogService getInstance(Proxy proxy) {
        return new LogServiceImpl(proxy);
    }


    @Override
    public LogResponse clickLog(ClickLogRequest clickLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(clickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse clickLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return clickLogResponse;
    }

    @Override
    public LogResponse stayLog(StayLogRequest stayLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(stayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.StayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse stayLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return stayLogResponse;
    }

    @Override
    public LogResponse videoPlayLog(VideoPlayLogRequest videoPlayLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoPlayLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return videoPlayLogResponse;
    }

    @Override
    public LogResponse videoOverLog(VideoOverLogRequest videoOverLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoOverLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoOverLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return videoOverLogResponse;
    }

    @Override
    public LogResponse singleShowLog(SingleShowLogRequest singleShowLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(singleShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.SingleShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse singleShowLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return singleShowLogResponse;
    }

    @Override
    public LogResponse multiShowLog(MultiShowLogRequest multiShowLogRequest) throws Exception {
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

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse multiShowLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return multiShowLogResponse;
    }

    @Override
    public LogResponse shareLog(ShareLogRequest shareLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(shareLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ShareLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse shareLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return shareLogResponse;
    }

    @Override
    public LogResponse favouriteLog(FavouriteLogRequest favouriteLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(favouriteLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.FavouriteLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse favouriteLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return favouriteLogResponse;
    }

    @Override
    public LogResponse verifyLog(VerifyLogRequest verifyLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(verifyLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VerifyLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse verifyLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return verifyLogResponse;
    }

    @Override
    public LogResponse followLog(FollowLogRequest followLogRequest) throws Exception {
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

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse followLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return followLogResponse;
    }

    @Override
    public LogResponse unfollowLog(FollowLogRequest unfollowLogRequest) throws Exception {
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

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse unfollowLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return unfollowLogResponse;
    }

    @Override
    public LogResponse followCardLog(FollowCardLogRequest followCardLogRequest) throws Exception {
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

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse followCardLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return followCardLogResponse;
    }

    @Override
    public LogResponse dislikeLog(DislikeLogRequest dislikeLogRequest) throws Exception {
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

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoPlayDrawLog(VideoPlayDrawLogRequest videoPlayDrawLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverDrawLog(VideoOverDrawLogRequest videoOverDrawLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoOverDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productShowLog(ProductShowLogRequest productShowLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(productShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse pushLog(PushLogRequest pushLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(pushLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.PushLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productClickLog(ProductClickLogRequest productClickLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(productClickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoPlayAutoLog(VideoPlayAutoLogRequest videoPlayAutoLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverAutoLog(VideoOverAutoLogRequest videoOverAutoLogRequest) throws Exception {
        Map<String, String> requestMap = Utils.paramsToMap(videoOverAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
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
}
