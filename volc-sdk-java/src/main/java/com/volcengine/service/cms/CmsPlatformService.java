package com.volcengine.service.cms;

import com.volcengine.model.request.ArticleCreateRequest;
import com.volcengine.model.request.ArticleDeleteByOpenidRequest;
import com.volcengine.model.request.ArticleDeleteRequest;
import com.volcengine.model.request.ArticleUploadDetailRequest;
import com.volcengine.model.response.ArticleCreateResponse;
import com.volcengine.model.response.ArticleDeleteByOpenidResponse;
import com.volcengine.model.response.ArticleDeleteResponse;
import com.volcengine.model.response.ArticleUploadDetailResponse;
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
}
