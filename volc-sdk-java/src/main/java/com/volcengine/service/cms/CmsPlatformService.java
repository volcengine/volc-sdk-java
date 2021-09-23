package com.volcengine.service.cms;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.IBaseService;

public interface CmsPlatformService extends IBaseService {
    /**
     * ArticleBatchCreateSourceArticle
     *
     * @param articleCreateRequest - the batchCreateSourceArticle request
     * @return the batchCreateSourceArticle response
     * @throws Exception the exception
     */
    ArticleCreateResponse batchCreateSourceArticle(ArticleCreateRequest articleCreateRequest) throws Exception;

    /**
     * ArticleGetArticleBatchUploadDetail
     *
     * @param articleUploadDetailRequest - the getArticleBatchUploadDetail request
     * @return the getArticleBatchUploadDetail response
     * @throws Exception the exception
     */
    ArticleUploadDetailResponse getArticleBatchUploadDetail(ArticleUploadDetailRequest articleUploadDetailRequest) throws Exception;

    /**
     * ArticleDeleteSourceArticle
     *
     * @param articleDeleteRequest - the deleteSourceArticle request
     * @return the deleteSourceArticle response
     * @throws Exception the exception
     */
    ArticleDeleteResponse deleteSourceArticle(ArticleDeleteRequest articleDeleteRequest) throws Exception;

    /**
     * ArticleDeleteSourceArticleByOpenid
     * @param articleDeleteByOpenidRequest - the deleteSourceArticleByOpenid request
     * @return the deleteSourceArticleByOpenid response
     * @throws Exception the exception
     */
    ArticleDeleteByOpenidResponse deleteSourceArticleByOpenid(ArticleDeleteByOpenidRequest articleDeleteByOpenidRequest) throws Exception;

    /**
     * ArticleArticleEventNotify
     * @param articleEventNotifyRequest - the articleEventNotify request
     * @return the articleEventNotify response
     * @throws Exception the exception
     */
    ArticleEventNotifyResponse articleEventNotify(ArticleEventNotifyRequest articleEventNotifyRequest) throws Exception;
}
