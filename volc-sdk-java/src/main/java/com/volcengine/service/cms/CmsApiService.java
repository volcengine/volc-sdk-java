package com.volcengine.service.cms;

import com.volcengine.model.request.ArticleFeedRequest;
import com.volcengine.model.request.ArticleVideoRequest;
import com.volcengine.model.response.ArticleFeedResponse;
import com.volcengine.model.response.ArticleVideoResponse;
import com.volcengine.service.IBaseService;

public interface CmsApiService extends IBaseService {

    /**
     * ArticleFeed
     *
     * @param articleFeedRequest - the feed request
     * @return the feed response
     * @throws Exception the exception
     */
    ArticleFeedResponse feed(ArticleFeedRequest articleFeedRequest) throws Exception;

    /**
     * ArticleGetVideoByVid
     * @param articleVideoRequest - the getVideoByVid request
     * @return the getVideoByVid response
     * @throws Exception the exception
     */
    ArticleVideoResponse getVideoByVid(ArticleVideoRequest articleVideoRequest) throws Exception;
}
