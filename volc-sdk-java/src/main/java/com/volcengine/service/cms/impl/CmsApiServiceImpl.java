package com.volcengine.service.cms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.beans.cms.BaseResp;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.CmsConfig;

import java.util.ArrayList;

public class CmsApiServiceImpl extends BaseServiceImpl implements CmsApiService {

    private CmsApiServiceImpl() {
        super(CmsConfig.apiServiceInfoMap.get(Const.REGION_CN_NORTH_1), CmsConfig.apiApiInfoMap);
    }

    private CmsApiServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, CmsConfig.apiApiInfoMap);
    }

    public static CmsApiService getInstance() {
        return new CmsApiServiceImpl();
    }

    public static CmsApiService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = CmsConfig.apiServiceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new CmsApiServiceImpl(serviceInfo);
    }

    @Override
    public ArticleFeedResponse feed(ArticleFeedRequest articleFeedRequest) throws Exception {
        RawResponse response = json(Const.Feed, new ArrayList<>(), JSON.toJSONString(articleFeedRequest));
        return getFeedResult(response);
    }

    @Override
    public ArticleGetVideoResponse getVideoByVid(ArticleGetVideoRequest articleGetVideoRequest) throws Exception {
        RawResponse response = json(Const.GetVideoByVid, new ArrayList<>(), JSON.toJSONString(articleGetVideoRequest));
        return getVideoResult(response);
    }

    @Override
    public ArticleMGetVideoResponse mGetVideoByVids(ArticleMGetVideoRequest mGetVideoRequest) throws Exception {
        RawResponse response = json(Const.MGetVideoByVids, new ArrayList<>(), JSON.toJSONString(mGetVideoRequest));
        return mGetVideoResult(response);
    }

    @Override
    public ArticleGetGoodsRelatedResponse getGoodsRelatedArticles(ArticleGetGoodsRelatedRequest getGoodsRelatedArticlesRequest) throws Exception {
        RawResponse response = json(Const.GetGoodsRelatedArticles, new ArrayList<>(), JSON.toJSONString(getGoodsRelatedArticlesRequest));
        return getGoodsRelatedArticlesResult(response);
    }

    @Override
    public ArticleMGetGoodsRelatedResponse mGetGoodsRelatedArticles(ArticleMGetGoodsRelatedRequest mGetGoodsRelatedRequest) throws Exception {
        RawResponse response = json(Const.MGetGoodsRelatedArticles, new ArrayList<>(), JSON.toJSONString(mGetGoodsRelatedRequest));
        return mGetGoodsRelatedArticlesResult(response);
    }

    @Override
    public ArticleSearchResponse articleSearch(ArticleSearchRequest searchRequest) throws Exception {
        RawResponse response = json(Const.CmsSearch, new ArrayList<>(), JSON.toJSONString(searchRequest));
        return articleSearchResult(response);
    }

    @Override
    public ArticleRelatedFeedResponse relatedFeed(ArticleRelatedFeedRequest relatedFeedRequest) throws Exception {
        RawResponse response = json(Const.RelatedFeed, new ArrayList<>(), JSON.toJSONString(relatedFeedRequest));
        return relatedFeedResult(response);
    }

    private ArticleFeedResponse getFeedResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleFeedResponse res = JSON.parseObject(response.getData(), ArticleFeedResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        if (res.getBaseResp() != null && res.getBaseResp().getStatusCode() != 1000) {
            ArticleFeedResponse.BaseResp baseResp = res.getBaseResp();
            throw new Exception("error: " + baseResp.getStatusMessage());
        }
        return res;
    }

    private ArticleGetVideoResponse getVideoResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleGetVideoResponse res = JSON.parseObject(response.getData(), ArticleGetVideoResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        if (res.getBaseResp() != null && res.getBaseResp().getStatusCode() != 1000) {
            ArticleGetVideoResponse.BaseResp baseResp = res.getBaseResp();
            throw new Exception("error: " + baseResp.getStatusMessage());
        }
        return res;
    }

    private ArticleMGetVideoResponse mGetVideoResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleMGetVideoResponse res = JSON.parseObject(response.getData(), ArticleMGetVideoResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        if (res.getBaseResp() != null && res.getBaseResp().getStatusCode() != 1000) {
            ArticleMGetVideoResponse.BaseResp baseResp = res.getBaseResp();
            throw new Exception("error: " + baseResp.getStatusMessage());
        }
        return res;
    }

    private ArticleGetGoodsRelatedResponse getGoodsRelatedArticlesResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleGetGoodsRelatedResponse res = JSON.parseObject(response.getData(), ArticleGetGoodsRelatedResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        checkBaseResp(res.getBaseResp());
        return res;
    }

    private ArticleMGetGoodsRelatedResponse mGetGoodsRelatedArticlesResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleMGetGoodsRelatedResponse res = JSON.parseObject(response.getData(), ArticleMGetGoodsRelatedResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        checkBaseResp(res.getBaseResp());
        return res;
    }

    private ArticleSearchResponse articleSearchResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleSearchResponse res = JSON.parseObject(response.getData(), ArticleSearchResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        checkBaseResp(res.getBaseResp());
        return res;
    }

    private ArticleRelatedFeedResponse relatedFeedResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleRelatedFeedResponse res = JSON.parseObject(response.getData(), ArticleRelatedFeedResponse.class);
        checkResponseMetadata(res.getResponseMetadata());
        checkBaseResp(res.getBaseResp());
        return res;
    }


    private void checkResponseMetadata(ResponseMetadata metadata) throws Exception {
        if (metadata != null && metadata.getError() != null) {
            throw new Exception(metadata.getRequestId() + " error: " + metadata.getError().getMessage());
        }
    }

    private void checkBaseResp(BaseResp baseResp) throws Exception {
        if (baseResp != null && baseResp.getStatusCode() != 1000) {
            throw new Exception("error: " + baseResp.getStatusMessage());
        }
    }
}
