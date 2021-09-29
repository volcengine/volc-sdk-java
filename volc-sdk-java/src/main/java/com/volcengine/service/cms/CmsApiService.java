package com.volcengine.service.cms;

import com.volcengine.model.request.ArticleFeedRequest;
import com.volcengine.model.request.ArticleGetVideoRequest;
import com.volcengine.model.request.ArticleMGetVideoRequest;
import com.volcengine.model.response.ArticleFeedResponse;
import com.volcengine.model.response.ArticleGetVideoResponse;
import com.volcengine.model.response.ArticleMGetVideoResponse;
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
     * @param articleGetVideoRequest - the getVideoByVid request
     * @return the getVideoByVid response
     * @throws Exception the exception
     */
    ArticleGetVideoResponse getVideoByVid(ArticleGetVideoRequest articleGetVideoRequest) throws Exception;

    /**
     * ArticleMGetVideoByVids
     * @param mGetVideoRequest - the mGetVideoByVids request
     * @return the mGetVideoByVids response
     * @throws Exception the exception
     */
    ArticleMGetVideoResponse mGetVideoByVids(ArticleMGetVideoRequest mGetVideoRequest) throws Exception;
}
