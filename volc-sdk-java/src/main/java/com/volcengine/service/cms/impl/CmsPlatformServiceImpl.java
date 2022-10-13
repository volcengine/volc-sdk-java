package com.volcengine.service.cms.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.cms.CmsConfig;
import com.volcengine.service.cms.CmsPlatformService;

import java.util.ArrayList;

public class CmsPlatformServiceImpl extends BaseServiceImpl implements CmsPlatformService {

    public CmsPlatformServiceImpl() {
        super(CmsConfig.platformServiceInfoMap.get(Const.REGION_CN_NORTH_1), CmsConfig.platformApiInfoMap);
    }

    public CmsPlatformServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, CmsConfig.platformApiInfoMap);
    }

    public CmsPlatformServiceImpl(String accessKey, String secretKey) {
        this();
        if (!accessKey.equals("")) {
            this.setAccessKey(accessKey);
        }
        if (!secretKey.equals("")) {
            this.setSecretKey(secretKey);
        }
    }

    /**
     * @deprecated 每次调用该方法都会新建一个实例，不建议使用该方法，可以参考Demo的使用方法
     *
     */
    public static CmsPlatformService getInstance() {
        return new CmsPlatformServiceImpl();
    }

    /**
     * @deprecated 每次调用该方法都会新建一个实例，不建议使用该方法，可以参考Demo的使用方法
     *
     */
    public static CmsPlatformService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = CmsConfig.platformServiceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new CmsPlatformServiceImpl(serviceInfo);
    }

    @Override
    public ArticleCreateResponse batchCreateSourceArticle(ArticleCreateRequest articleCreateRequest) throws Exception {
        RawResponse rawResponse = json(Const.BatchCreateSourceArticle, new ArrayList<>(), JSON.toJSONString(articleCreateRequest));
        return getBatchCreateSourceArticle(rawResponse);
    }

    @Override
    public ArticleUploadDetailResponse getArticleBatchUploadDetail(ArticleUploadDetailRequest articleUploadDetailRequest) throws Exception {
        RawResponse rawResponse = json(Const.GetArticleBatchUploadDetail, new ArrayList<>(), JSON.toJSONString(articleUploadDetailRequest));
        return getUploadDetail(rawResponse);
    }

    @Override
    public ArticleDeleteResponse deleteSourceArticle(ArticleDeleteRequest articleDeleteRequest) throws Exception {
        RawResponse rawResponse = json(Const.DeleteSourceArticle, new ArrayList<>(), JSON.toJSONString(articleDeleteRequest));
        return getDeleteArticle(rawResponse);
    }

    @Override
    public ArticleDeleteByOpenidResponse deleteSourceArticleByOpenid(ArticleDeleteByOpenidRequest articleDeleteByOpenidRequest) throws Exception {
        RawResponse rawResponse = json(Const.DeleteSourceArticleByOpenid, new ArrayList<>(), JSON.toJSONString(articleDeleteByOpenidRequest));
        return getDeleteArticleByOpenid(rawResponse);
    }

    @Override
    public ArticleEventNotifyResponse articleEventNotify(ArticleEventNotifyRequest articleEventNotifyRequest) throws Exception {
        RawResponse rawResponse = json(Const.ArticleEventNotify, new ArrayList<>(), JSON.toJSONString(articleEventNotifyRequest));
        return getArticleEventNotify(rawResponse);
    }

    private ArticleCreateResponse getBatchCreateSourceArticle(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleCreateResponse res = JSON.parseObject(response.getData(), ArticleCreateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    private ArticleUploadDetailResponse getUploadDetail(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleUploadDetailResponse res = JSON.parseObject(response.getData(), ArticleUploadDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    private ArticleDeleteResponse getDeleteArticle(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleDeleteResponse res = JSON.parseObject(response.getData(), ArticleDeleteResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    private ArticleDeleteByOpenidResponse getDeleteArticleByOpenid(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleDeleteByOpenidResponse res = JSON.parseObject(response.getData(), ArticleDeleteByOpenidResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    private ArticleEventNotifyResponse getArticleEventNotify(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ArticleEventNotifyResponse res = JSON.parseObject(response.getData(), ArticleEventNotifyResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }
}
