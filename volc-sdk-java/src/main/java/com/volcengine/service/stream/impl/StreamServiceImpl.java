package com.volcengine.service.stream.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.stream.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.stream.StreamConfig;
import com.volcengine.service.stream.StreamService;
import org.apache.http.HttpHost;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamServiceImpl extends BaseServiceImpl implements StreamService {

    private StreamServiceImpl() {
        super(StreamConfig.serviceInfo, StreamConfig.apiInfoList);
    }

    private StreamServiceImpl(HttpHost proxy) {
        super(StreamConfig.serviceInfo, proxy, StreamConfig.apiInfoList);
    }

    public static StreamService getInstance() {
        return new StreamServiceImpl();
    }

    public static StreamService getInstance(HttpHost proxy) {
        return new StreamServiceImpl(proxy);
    }

    @Override
    public WapRegisterResponse wapRegister(WapRegisterRequest wapRegisterRequest) throws Exception {
        RawResponse response = query(Const.WapRegister, Utils.mapToPairList(Utils.paramsToMap(wapRegisterRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), WapRegisterResponse.class);
    }

    @Override
    public GetListResponse getList(GetListRequest getListRequest) throws Exception {
        RawResponse response = query(Const.ContentStream, Utils.mapToPairList(Utils.paramsToMap(getListRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetListResponse.class);
    }

    @Override
    public DiggResponse digg(DiggRequest diggRequest) throws Exception {
        RawResponse response = query(Const.Digg, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse bury(DiggRequest diggRequest) throws Exception {
        RawResponse response = query(Const.Bury, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse unDigg(DiggRequest diggRequest) throws Exception {
        RawResponse response = query(Const.UnDigg, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public DiggResponse unBury(DiggRequest diggRequest) throws Exception {
        RawResponse response = query(Const.UnBury, Utils.mapToPairList(Utils.paramsToMap(diggRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), DiggResponse.class);
    }

    @Override
    public GetArticleResponse getArticle(GetArticleRequest getArticleRequest) throws Exception {
        RawResponse response = query(Const.SingleArticleInfo, Utils.mapToPairList(Utils.paramsToMap(getArticleRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetArticleResponse.class);
    }

    @Override
    public GetArticlesResponse getArticles(GetArticlesRequest getArticlesRequest) throws Exception {
        RawResponse response = query(Const.MultiArticleInfo, Utils.mapToPairList(Utils.paramsToMap(getArticlesRequest)));
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
        RawResponse response = query(Const.Feedback, Utils.mapToPairList(Utils.paramsToMap(feedBackRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FeedBackResponse.class);
    }

    @Override
    public FollowResponse follow(FollowRequest followRequest) throws Exception {
        RawResponse response = query(Const.Follow, Utils.mapToPairList(Utils.paramsToMap(followRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowResponse.class);
    }

    @Override
    public UnfollowResponse unfollow(UnfollowRequest unfollowRequest) throws Exception {
        RawResponse response = query(Const.Unfollow, Utils.mapToPairList(Utils.paramsToMap(unfollowRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), UnfollowResponse.class);
    }

    @Override
    public CheckRelationResponse checkRelation(CheckRelationRequest checkRelationRequest) throws Exception {
        RawResponse response = query(Const.CheckRelation, Utils.mapToPairList(Utils.paramsToMap(checkRelationRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CheckRelationResponse.class);
    }

    @Override
    public GetFollowingListResponse getFollowingList(GetFollowingListRequest getFollowingListRequest) throws Exception {
        RawResponse response = query(Const.FollowingList, Utils.mapToPairList(Utils.paramsToMap(getFollowingListRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetFollowingListResponse.class);
    }

    @Override
    public RefreshTipsResponse refreshTips(RefreshTipsRequest refreshTipsRequest) throws Exception {
        RawResponse response = query(Const.RefreshTips, Utils.mapToPairList(Utils.paramsToMap(refreshTipsRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RefreshTipsResponse.class);
    }

    @Override
    public FollowArticlesResponse getFollowArticles(FollowArticlesRequest followArticlesRequest) throws Exception {
        RawResponse response = query(Const.FollowArticles, Utils.mapToPairList(Utils.paramsToMap(followArticlesRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), FollowArticlesResponse.class);
    }

    @Override
    public RecommendRelatedUserResponse recommendRelatedUser(RecommendRelatedUserRequest recommendRelatedUserRequest) throws Exception {
        RawResponse response = query(Const.RecommendRelatedUser, Utils.mapToPairList(Utils.paramsToMap(recommendRelatedUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendRelatedUserResponse.class);
    }

    @Override
    public RecommendCategoryUserResponse recommendCategoryUser(RecommendCategoryUserRequest recommendCategoryUserRequest) throws Exception {
        RawResponse response = query(Const.RecommendCategoryUser, Utils.mapToPairList(Utils.paramsToMap(recommendCategoryUserRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendCategoryUserResponse.class);
    }

    @Override
    public RecommendCategoryInfoResponse recommendCategoryInfo(RecommendCategoryInfoRequest recommendCategoryInfoRequest) throws Exception {
        RawResponse response = query(Const.RecommendCategoryInfo, Utils.mapToPairList(Utils.paramsToMap(recommendCategoryInfoRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RecommendCategoryInfoResponse.class);
    }

    @Override
    public RelatedArticleResponse relatedArticle(RelatedArticleRequest relatedArticleRequest) throws Exception {
        RawResponse response = query(Const.RelatedArticle, Utils.mapToPairList(Utils.paramsToMap(relatedArticleRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RelatedArticleResponse.class);
    }

    @Override
    public GetDiggListResponse getDiggList(GetDiggListRequest getDiggListRequest) throws Exception {
        RawResponse response = query(Const.DiggList, Utils.mapToPairList(Utils.paramsToMap(getDiggListRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetDiggListResponse.class);
    }

    @Override
    public GetVideoUrlResponse getVideoUrl(GetVideoUrlRequest getVideoUrlRequest) throws Exception {
        RawResponse response = query(Const.VideoUrl, Utils.mapToPairList(Utils.paramsToMap(getVideoUrlRequest)));
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
        RawResponse response = query(Const.UnionProduct, Utils.mapToPairList(Utils.paramsToMap(getUnionProductRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GetUnionProductResponse.class);
    }

    @Override
    public HotBoardResponse hotBoard(HotBoardRequest hotBoardRequest) throws Exception {
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(hotBoardRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardResponse.class);
    }

    @Override
    public HotBoardListResponse hotBoardList(HotBoardListRequest hotBoardListRequest) throws Exception {
        HotBoardBaseRequest request = HotBoardBaseRequest.builder()
                .accessToken(hotBoardListRequest.getAccessToken())
                .partner(hotBoardListRequest.getPartner())
                .timestamp(hotBoardListRequest.getTimestamp())
                .biz("list").build();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardListResponse.class);
    }

    @Override
    public HotBoardBoardResponse hotBoardBoard(HotBoardBoardRequest hotBoardBoardRequest) throws Exception {
        HotBoardBaseRequest request = HotBoardBaseRequest.builder()
                .accessToken(hotBoardBoardRequest.getAccessToken())
                .partner(hotBoardBoardRequest.getPartner())
                .timestamp(hotBoardBoardRequest.getTimestamp())
                .hotBoardGid(hotBoardBoardRequest.getHotBoardGid())
                .biz("board").build();
        RawResponse response = query(Const.HotBoard, Utils.mapToPairList(Utils.paramsToMap(request)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardBoardResponse.class);
    }

    @Override
    public HotBoardArticleResponse hotBoardArticle(HotBoardArticleRequest hotBoardArticleRequest) throws Exception {
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
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), HotBoardArticleResponse.class);
    }
}
