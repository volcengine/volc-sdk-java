package com.volcengine.service.stream.impl;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.NameValuePair;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.CommonPo;
import com.volcengine.model.stream.log.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.LogConfig;
import com.volcengine.service.stream.LogService;
import org.apache.commons.lang3.StringUtils;

import java.net.Proxy;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.parseObject;


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
        if (StringUtils.isBlank(clickLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.ClickLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(clickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse clickLogResponse = parseObject(response.getData(), LogResponse.class);
        return clickLogResponse;
    }

    @Override
    public LogResponse stayLog(StayLogRequest stayLogRequest) throws Exception {
        if (StringUtils.isBlank(stayLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.StayLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(stayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.StayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse stayLogResponse = parseObject(response.getData(), LogResponse.class);
        return stayLogResponse;
    }

    @Override
    public LogResponse videoPlayLog(VideoPlayLogRequest videoPlayLogRequest) throws Exception {
        if (StringUtils.isBlank(videoPlayLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoPlayLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoPlayLogResponse = parseObject(response.getData(), LogResponse.class);
        return videoPlayLogResponse;
    }

    @Override
    public LogResponse videoOverLog(VideoOverLogRequest videoOverLogRequest) throws Exception {
        if (StringUtils.isBlank(videoOverLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoOverLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoOverLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse videoOverLogResponse = parseObject(response.getData(), LogResponse.class);
        return videoOverLogResponse;
    }

    @Override
    public LogResponse singleShowLog(SingleShowLogRequest singleShowLogRequest) throws Exception {
        if (StringUtils.isBlank(singleShowLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.SingleShowLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(singleShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.SingleShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse singleShowLogResponse = parseObject(response.getData(), LogResponse.class);
        return singleShowLogResponse;
    }

    @Override
    public LogResponse multiShowLog(MultiShowLogRequest multiShowLogRequest) throws Exception {
        for (MultiShowLogRequest.Body body : multiShowLogRequest.getBody()) {
            if (StringUtils.isBlank(body.getReqId())) {
                return GenNoReqIdResponse(Const.MultiShowLog);
            }
        }
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
        LogResponse multiShowLogResponse = parseObject(response.getData(), LogResponse.class);
        return multiShowLogResponse;
    }

    @Override
    public LogResponse shareLog(ShareLogRequest shareLogRequest) throws Exception {
        if (StringUtils.isBlank(shareLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.ShareLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(shareLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ShareLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse shareLogResponse = parseObject(response.getData(), LogResponse.class);
        return shareLogResponse;
    }

    @Override
    public LogResponse favouriteLog(FavouriteLogRequest favouriteLogRequest) throws Exception {
        if (StringUtils.isBlank(favouriteLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.FavouriteLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(favouriteLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.FavouriteLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse favouriteLogResponse = parseObject(response.getData(), LogResponse.class);
        return favouriteLogResponse;
    }

    @Override
    public LogResponse verifyLog(VerifyLogRequest verifyLogRequest) throws Exception {
        if (StringUtils.isBlank(verifyLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VerifyLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(verifyLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VerifyLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse verifyLogResponse = parseObject(response.getData(), LogResponse.class);
        return verifyLogResponse;
    }

    @Override
    public LogResponse followLog(FollowLogRequest followLogRequest) throws Exception {
        for (FollowLogRequest.Body body : followLogRequest.getBody()) {
            if (StringUtils.isBlank(body.getReqId())) {
                return GenNoReqIdResponse(Const.FollowLog);
            }
        }
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
        LogResponse followLogResponse = parseObject(response.getData(), LogResponse.class);
        return followLogResponse;
    }

    @Override
    public LogResponse unfollowLog(FollowLogRequest unfollowLogRequest) throws Exception {
        for (FollowLogRequest.Body body : unfollowLogRequest.getBody()) {
            if (StringUtils.isBlank(body.getReqId())) {
                return GenNoReqIdResponse(Const.UnfollowLog);
            }
        }
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
        LogResponse unfollowLogResponse = parseObject(response.getData(), LogResponse.class);
        return unfollowLogResponse;
    }

    @Override
    public LogResponse followCardLog(FollowCardLogRequest followCardLogRequest) throws Exception {
        for (FollowCardLogRequest.Body body : followCardLogRequest.getBody()) {
            if (StringUtils.isBlank(body.getReqId())) {
                return GenNoReqIdResponse(Const.FollowCardLog);
            }
        }
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
        LogResponse followCardLogResponse = parseObject(response.getData(), LogResponse.class);
        return followCardLogResponse;
    }

    @Override
    public LogResponse dislikeLog(DislikeLogRequest dislikeLogRequest) throws Exception {
        for (DislikeLogRequest.Body body : dislikeLogRequest.getBody()) {
            if (StringUtils.isBlank(body.getReqId())) {
                return GenNoReqIdResponse(Const.DislikeLog);
            }
        }
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
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoPlayDrawLog(VideoPlayDrawLogRequest videoPlayDrawLogRequest) throws Exception {
        if (StringUtils.isBlank(videoPlayDrawLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoPlayDrawLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverDrawLog(VideoOverDrawLogRequest videoOverDrawLogRequest) throws Exception {
        if (StringUtils.isBlank(videoOverDrawLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoOverDrawLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoOverDrawLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverDrawLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productShowLog(ProductShowLogRequest productShowLogRequest) throws Exception {
        if (StringUtils.isBlank(productShowLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.ProductShowLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(productShowLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductShowLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse pushLog(PushLogRequest pushLogRequest) throws Exception {
        if (StringUtils.isBlank(pushLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.PushLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(pushLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.PushLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse productClickLog(ProductClickLogRequest productClickLogRequest) throws Exception {
        if (StringUtils.isBlank(productClickLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.ProductClickLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(productClickLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.ProductClickLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoPlayAutoLog(VideoPlayAutoLogRequest videoPlayAutoLogRequest) throws Exception {
        if (StringUtils.isBlank(videoPlayAutoLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoPlayAutoLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoPlayAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoPlayAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
        return logResponse;
    }

    @Override
    public LogResponse videoOverAutoLog(VideoOverAutoLogRequest videoOverAutoLogRequest) throws Exception {
        if (StringUtils.isBlank(videoOverAutoLogRequest.getReqId())) {
            return GenNoReqIdResponse(Const.VideoOverAutoLog);
        }
        Map<String, String> requestMap = Utils.paramsToMap(videoOverAutoLogRequest);
        Map<String, String> paramsMap = paramsFilter(requestMap);
        RawResponse response = post(Const.VideoOverAutoLog, Utils.mapToPairList(requestMap), Utils.mapToPairList(paramsMap));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LogResponse logResponse = parseObject(response.getData(), LogResponse.class);
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
}
