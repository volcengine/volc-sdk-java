package com.volcengine.service.cms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.ArticleFeedRequest;
import com.volcengine.model.request.ArticleGetVideoRequest;
import com.volcengine.model.request.ArticleMGetVideoRequest;
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

    private ArticleFeedResponse getFeedResult(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleFeedResponse res = JSON.parseObject(response.getData(), ArticleFeedResponse.class);
        if (res.getResponseMetadata() != null && res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
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
        if (res.getResponseMetadata() != null && res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
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
        if (res.getResponseMetadata() != null && res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        if (res.getBaseResp() != null && res.getBaseResp().getStatusCode() != 1000) {
            ArticleMGetVideoResponse.BaseResp baseResp = res.getBaseResp();
            throw new Exception("error: " + baseResp.getStatusMessage());
        }
        return res;
    }
}
