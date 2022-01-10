package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.log.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.LogConfig;
import com.volcengine.service.stream.LogService;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;

import java.net.URLDecoder;
import java.util.List;


public class LogServiceImpl extends BaseServiceImpl implements LogService {
    private LogServiceImpl() {
        super(LogConfig.serviceInfo, LogConfig.apiInfoList);
    }

    private LogServiceImpl(HttpHost proxy) {
        super(LogConfig.serviceInfo, proxy, LogConfig.apiInfoList);
    }

    public static LogService getInstance() {
        return new LogServiceImpl();
    }

    public static LogService getInstance(HttpHost proxy) {
        return new LogServiceImpl(proxy);
    }

    @Override
    public LogResponse clickLog(ClickLogRequest clickLogRequest) throws Exception {
        RawResponse response = query(Const.ClickLog, Utils.mapToPairList(Utils.paramsToMap(clickLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse clickLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return clickLogResponse;
    }

    @Override
    public LogResponse stayLog(StayLogRequest stayLogRequest) throws Exception {
        RawResponse response = query(Const.StayLog, Utils.mapToPairList(Utils.paramsToMap(stayLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse stayLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return stayLogResponse;
    }

    @Override
    public LogResponse videoPlayLog(VideoPlayLogRequest videoPlayLogRequest) throws Exception {
        RawResponse response = query(Const.VideoPlayLog, Utils.mapToPairList(Utils.paramsToMap(videoPlayLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoPlayLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return videoPlayLogResponse;
    }

    @Override
    public LogResponse videoOverLog(VideoOverLogRequest videoOverLogRequest) throws Exception {
        RawResponse response = query(Const.VideoOverLog, Utils.mapToPairList(Utils.paramsToMap(videoOverLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoOverLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return videoOverLogResponse;
    }

    @Override
    public LogResponse singleShowLog(SingleShowLogRequest singleShowLogRequest) throws Exception {
        RawResponse response = query(Const.SingleShowLog, Utils.mapToPairList(Utils.paramsToMap(singleShowLogRequest)));
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
        RawResponse response = query(Const.ShareLog, Utils.mapToPairList(Utils.paramsToMap(shareLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse shareLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return shareLogResponse;
    }

    @Override
    public LogResponse favouriteLog(FavouriteLogRequest favouriteLogRequest) throws Exception {
        RawResponse response = query(Const.FavouriteLog, Utils.mapToPairList(Utils.paramsToMap(favouriteLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse favouriteLogResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return favouriteLogResponse;
    }

    @Override
    public LogResponse verifyLog(VerifyLogRequest verifyLogRequest) throws Exception {
        RawResponse response = query(Const.VerifyLog, Utils.mapToPairList(Utils.paramsToMap(verifyLogRequest)));
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
//        jsonBody = "{" + URLDecoder.decode(jsonBody, "UTF-8") + "}";
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
        RawResponse response = query(Const.VideoPlayDrawLog, Utils.mapToPairList(Utils.paramsToMap(videoPlayDrawLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverDrawLog(VideoOverDrawLogRequest videoOverDrawLogRequest) throws Exception {
        RawResponse response = query(Const.VideoOverDrawLog, Utils.mapToPairList(Utils.paramsToMap(videoOverDrawLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productShowLog(ProductShowLogRequest productShowLogRequest) throws Exception {
        RawResponse response = query(Const.ProductShowLog, Utils.mapToPairList(Utils.paramsToMap(productShowLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse pushLog(PushLogRequest pushLogRequest) throws Exception {
        RawResponse response = query(Const.PushLog, Utils.mapToPairList(Utils.paramsToMap(pushLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productClickLog(ProductClickLogRequest productClickLogRequest) throws Exception {
        RawResponse response = query(Const.ProductClickLog, Utils.mapToPairList(Utils.paramsToMap(productClickLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoPlayAutoLog(VideoPlayAutoLogRequest videoPlayAutoLogRequest) throws Exception {
        RawResponse response = query(Const.VideoPlayAutoLog, Utils.mapToPairList(Utils.paramsToMap(videoPlayAutoLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverAutoLog(VideoOverAutoLogRequest videoOverAutoLogRequest) throws Exception {
        RawResponse response = query(Const.VideoOverAutoLog, Utils.mapToPairList(Utils.paramsToMap(videoOverAutoLogRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = JSON.parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }
}
