package com.volcengine.service.cms;

import com.volcengine.model.request.ArticleCreateRequest;
import com.volcengine.model.request.ArticleUploadDetailRequest;
import com.volcengine.model.response.ArticleCreateResponse;
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
}
