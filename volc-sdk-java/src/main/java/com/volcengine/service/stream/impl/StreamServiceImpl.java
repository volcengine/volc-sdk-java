package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.MonitorService;
import com.volcengine.service.stream.StreamConfig;
import com.volcengine.service.stream.StreamService;
import org.apache.http.HttpHost;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamServiceImpl extends BaseServiceImpl implements StreamService {
    static HttpHost Mproxy;

    boolean needMonitor;

    private StreamServiceImpl() {
        super(StreamConfig.serviceInfo, StreamConfig.apiInfoList);
        needMonitor = true;
    }

    private StreamServiceImpl(HttpHost proxy) {
        super(StreamConfig.serviceInfo, proxy, StreamConfig.apiInfoList);
        needMonitor = true;
    }

    //单例
    private volatile static StreamServiceImpl instance = null;

    public static StreamService getInstance() {
        if (instance == null) {
            synchronized (StreamServiceImpl.class) {
                if (instance == null) {
                    instance = new StreamServiceImpl();
                }
            }
        }
        return instance;
    }

    public static StreamService getInstance(HttpHost proxy) {
        if (instance == null) {
            synchronized (StreamServiceImpl.class) {
                if (instance == null) {
                    instance = new StreamServiceImpl(proxy);
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
    public WapRegisterResponse wapRegister(WapRegisterRequest wapRegisterRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.WapRegister, Utils.mapToPairList(Utils.paramsToMap(wapRegisterRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, wapRegisterRequest.getPartner(), "", "",
                Const.WapRegister, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), WapRegisterResponse.class);
    }

    @Override
    public GetListResponse getList(GetListRequest getListRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.ContentStream, Utils.mapToPairList(Utils.paramsToMap(getListRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getListRequest.getPartner(), getListRequest.getCategory(), getListRequest.getAccessToken(),
                Const.ContentStream, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetListResponse.class);
    }

    @Override
    public GetListResponseV2 getListV2(GetListRequest getListRequest) throws Exception {
        getListRequest.setApiVersion(4);
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.ContentStreamV2, Utils.mapToPairList(Utils.paramsToMap(getListRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getListRequest.getPartner(), getListRequest.getCategory(), getListRequest.getAccessToken(),
                Const.ContentStreamV2, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetListResponseV2.class);
    }
    
    @Override
    public DiggResponse digg(DiggRequest diggRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.Digg, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, diggRequest.getPartner(), "", diggRequest.getAccessToken(),
                Const.Digg, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse bury(DiggRequest diggRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.Bury, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, diggRequest.getPartner(), "", diggRequest.getAccessToken(),
                Const.Bury, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse unDigg(DiggRequest diggRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.UnDigg, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, diggRequest.getPartner(), "", diggRequest.getAccessToken(),
                Const.UnDigg, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse unBury(DiggRequest diggRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.UnBury, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, diggRequest.getPartner(), "", diggRequest.getAccessToken(),
                Const.UnBury, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public GetArticleResponse getArticle(GetArticleRequest getArticleRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.SingleArticleInfo, Utils.mapToPairList(Utils.paramsToMap(getArticleRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getArticleRequest.getPartner(), "", getArticleRequest.getAccessToken(),
                Const.SingleArticleInfo, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetArticleResponse.class);
    }

    @Override
    public GetArticlesResponse getArticles(GetArticlesRequest getArticlesRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.MultiArticleInfo, Utils.mapToPairList(Utils.paramsToMap(getArticlesRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getArticlesRequest.getPartner(), "", getArticlesRequest.getAccessToken(),
                Const.MultiArticleInfo, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        String jsonString = new String(response.getData());
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        GetArticlesResponse getArticlesResponse = new GetArticlesResponse();
        List<GetArticleResponse.Result> articleList = new ArrayList<>();
        JSONObject result1 = jsonObject.getJSONObject("Result");
        JSONObject responseMetadataJson = jsonObject.getJSONObject("ResponseMetadata");
        CommonPo.ResponseMetadata responseMetadata = JSONObject.toJavaObject(responseMetadataJson, CommonPo.ResponseMetadata.class);
        getArticlesResponse.setResponseMetadata(responseMetadata);
        if (result1 == null) {
            return getArticlesResponse;
        }
        for (Map.Entry<String, Object> entry : ((Map<String, Object>) result1).entrySet()) {
            GetArticleResponse.Result articleInfo = JSONObject.toJavaObject((JSONObject) entry.getValue(), GetArticleResponse.Result.class);
            articleInfo.setGroupId(entry.getKey());
            articleList.add(articleInfo);
        }
        GetArticlesResponse.Result result = new GetArticlesResponse.Result();
        result.setArticleInfos(articleList);
        getArticlesResponse.setResult(result);
        return getArticlesResponse;
    }

    @Override
    public FeedBackResponse feedBack(FeedBackRequest feedBackRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.Feedback, Utils.mapToPairList(Utils.paramsToMap(feedBackRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, feedBackRequest.getPartner(), "", feedBackRequest.getAccessToken(),
                Const.Feedback, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FeedBackResponse.class);
    }

    @Override
    public FollowResponse follow(FollowRequest followRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.Follow, Utils.mapToPairList(Utils.paramsToMap(followRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followRequest.getPartner(), "", followRequest.getAccessToken(),
                Const.Follow, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowResponse.class);
    }

    @Override
    public UnfollowResponse unfollow(UnfollowRequest unfollowRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.Unfollow, Utils.mapToPairList(Utils.paramsToMap(unfollowRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, unfollowRequest.getPartner(), "", unfollowRequest.getAccessToken(),
                Const.Unfollow, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UnfollowResponse.class);
    }

    @Override
    public CheckRelationResponse checkRelation(CheckRelationRequest checkRelationRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.CheckRelation, Utils.mapToPairList(Utils.paramsToMap(checkRelationRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, checkRelationRequest.getPartner(), "", checkRelationRequest.getAccessToken(),
                Const.CheckRelation, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CheckRelationResponse.class);
    }

    @Override
    public GetFollowingListResponse getFollowingList(GetFollowingListRequest getFollowingListRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.FollowingList, Utils.mapToPairList(Utils.paramsToMap(getFollowingListRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getFollowingListRequest.getPartner(), "", getFollowingListRequest.getAccessToken(),
                Const.FollowingList, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetFollowingListResponse.class);
    }

    @Override
    public RefreshTipsResponse refreshTips(RefreshTipsRequest refreshTipsRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RefreshTips, Utils.mapToPairList(Utils.paramsToMap(refreshTipsRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, refreshTipsRequest.getPartner(), "", refreshTipsRequest.getAccessToken(),
                Const.RefreshTips, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RefreshTipsResponse.class);
    }

    @Override
    public FollowArticlesResponse getFollowArticles(FollowArticlesRequest followArticlesRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.FollowArticles, Utils.mapToPairList(Utils.paramsToMap(followArticlesRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, followArticlesRequest.getPartner(), "", followArticlesRequest.getAccessToken(),
                Const.FollowArticles, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowArticlesResponse.class);
    }

    @Override
    public RecommendRelatedUserResponse recommendRelatedUser(RecommendRelatedUserRequest recommendRelatedUserRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RecommendRelatedUser, Utils.mapToPairList(Utils.paramsToMap(recommendRelatedUserRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, recommendRelatedUserRequest.getPartner(), "", recommendRelatedUserRequest.getAccessToken(),
                Const.RecommendRelatedUser, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendRelatedUserResponse.class);
    }

    @Override
    public RecommendCategoryUserResponse recommendCategoryUser(RecommendCategoryUserRequest recommendCategoryUserRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RecommendCategoryUser, Utils.mapToPairList(Utils.paramsToMap(recommendCategoryUserRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, recommendCategoryUserRequest.getPartner(), "", recommendCategoryUserRequest.getAccessToken(),
                Const.RecommendCategoryUser, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendCategoryUserResponse.class);
    }

    @Override
    public RecommendCategoryInfoResponse recommendCategoryInfo(RecommendCategoryInfoRequest recommendCategoryInfoRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RecommendCategoryInfo, Utils.mapToPairList(Utils.paramsToMap(recommendCategoryInfoRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, recommendCategoryInfoRequest.getPartner(), "", recommendCategoryInfoRequest.getAccessToken(),
                Const.RecommendCategoryInfo, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendCategoryInfoResponse.class);
    }

    @Override
    public RelatedArticleResponse relatedArticle(RelatedArticleRequest relatedArticleRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RelatedArticle, Utils.mapToPairList(Utils.paramsToMap(relatedArticleRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, relatedArticleRequest.getPartner(), "", relatedArticleRequest.getAccessToken(),
                Const.RelatedArticle, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RelatedArticleResponse.class);
    }

    @Override
    public RelatedArticleResponseV2 relatedArticleV2(RelatedArticleRequest relatedArticleRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.RelatedArticleV2, Utils.mapToPairList(Utils.paramsToMap(relatedArticleRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, relatedArticleRequest.getPartner(), "", relatedArticleRequest.getAccessToken(),
                Const.RelatedArticleV2, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RelatedArticleResponseV2.class);
    }

    @Override
    public GetDiggListResponse getDiggList(GetDiggListRequest getDiggListRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.DiggList, Utils.mapToPairList(Utils.paramsToMap(getDiggListRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getDiggListRequest.getPartner(), "", getDiggListRequest.getAccessToken(),
                Const.DiggList, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDiggListResponse.class);
    }

    @Override
    public GetVideoUrlResponse getVideoUrl(GetVideoUrlRequest getVideoUrlRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.VideoUrl, Utils.mapToPairList(Utils.paramsToMap(getVideoUrlRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getVideoUrlRequest.getPartner(), "", getVideoUrlRequest.getAccessToken(),
                Const.VideoUrl, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        String jsonString = new String(response.getData());
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        GetVideoUrlResponse getVideoUrlResponse = new GetVideoUrlResponse();
        JSONObject result1 = jsonObject.getJSONObject("Result");
        JSONObject responseMetadataJson = jsonObject.getJSONObject("ResponseMetadata");
        CommonPo.ResponseMetadata responseMetadata = JSONObject.toJavaObject(responseMetadataJson, CommonPo.ResponseMetadata.class);
        getVideoUrlResponse.setResponseMetadata(responseMetadata);
        if (result1 == null) {
            return getVideoUrlResponse;
        }
        JSONObject resultData = result1.getJSONObject("data");
        GetVideoUrlResponse.Result videoUrlResult = JSONObject.toJavaObject(resultData, GetVideoUrlResponse.Result.class);
        getVideoUrlResponse.setResult(videoUrlResult);
        return getVideoUrlResponse;
    }

    @Override
    public GetUnionProductResponse getUnionProduct(GetUnionProductRequest getUnionProductRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.UnionProduct, Utils.mapToPairList(Utils.paramsToMap(getUnionProductRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, getUnionProductRequest.getPartner(), "", getUnionProductRequest.getAccessToken(),
                Const.UnionProduct, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetUnionProductResponse.class);
    }

    @Override
    public HotBoardResponse hotBoard(HotBoardRequest hotBoardRequest) throws Exception {
        long start = System.currentTimeMillis();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(hotBoardRequest)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, hotBoardRequest.getPartner(), "", hotBoardRequest.getAccessToken(),
                Const.HotBoard, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardResponse.class);
    }

    @Override
    public HotBoardListResponse hotBoardList(HotBoardListRequest hotBoardListRequest) throws Exception {
        long start = System.currentTimeMillis();
        HotBoardBaseRequest request = HotBoardBaseRequest.builder()
                .accessToken(hotBoardListRequest.getAccessToken())
                .partner(hotBoardListRequest.getPartner())
                .timestamp(hotBoardListRequest.getTimestamp())
                .biz("list").build();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(request)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, hotBoardListRequest.getPartner(), "", hotBoardListRequest.getAccessToken(),
                Const.HotBoard, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardListResponse.class);
    }

    @Override
    public HotBoardBoardResponse hotBoardBoard(HotBoardBoardRequest hotBoardBoardRequest) throws Exception {
        long start = System.currentTimeMillis();
        HotBoardBaseRequest request = HotBoardBaseRequest.builder()
                .accessToken(hotBoardBoardRequest.getAccessToken())
                .partner(hotBoardBoardRequest.getPartner())
                .timestamp(hotBoardBoardRequest.getTimestamp())
                .hotBoardGid(hotBoardBoardRequest.getHotBoardGid())
                .biz("board").build();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(request)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, hotBoardBoardRequest.getPartner(), "", hotBoardBoardRequest.getAccessToken(),
                Const.HotBoard, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardBoardResponse.class);
    }

    @Override
    public HotBoardArticleResponse hotBoardArticle(HotBoardArticleRequest hotBoardArticleRequest) throws Exception {
        long start = System.currentTimeMillis();
        HotBoardBaseRequest request = HotBoardBaseRequest.builder()
                .accessToken(hotBoardArticleRequest.getAccessToken())
                .partner(hotBoardArticleRequest.getPartner())
                .timestamp(hotBoardArticleRequest.getTimestamp())
                .offset(hotBoardArticleRequest.getOffset())
                .limit(hotBoardArticleRequest.getLimit())
                .hotBoardGid(hotBoardArticleRequest.getHotBoardGid())
                .collectionID(hotBoardArticleRequest.getCollectionID())
                .from(hotBoardArticleRequest.getFrom())
                .biz("article").build();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(request)));
        long end = System.currentTimeMillis();
        sendToMonitor(instance, hotBoardArticleRequest.getPartner(), "", hotBoardArticleRequest.getAccessToken(),
                Const.HotBoard, response.getHttpCode(), response.getCode(), response.getData(), end - start);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardArticleResponse.class);
    }

    private void sendToMonitor(StreamService streamService, String partner, String category, String accessToken, String action, int httpCode, int topRespCode, byte[] respData, long latency) {
        if (needMonitor) {
            MonitorService monitorService = MonitorServiceImpl.getInstance(streamService.getAccessKey(), streamService.getSecretKey(), Mproxy);
            monitorService.monitor(partner, category, accessToken, action, httpCode, topRespCode, respData, latency);
        }
    }
}
