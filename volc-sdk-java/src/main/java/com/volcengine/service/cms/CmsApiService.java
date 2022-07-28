package com.volcengine.service.cms;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
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

    /**
     * GetGoodsRelatedArticles
     * @param getGoodsRelatedArticlesRequest - the getGoodsRelatedArticles request
     * @return the getGoodsRelatedArticles response
     * @throws Exception the exception
     */
    ArticleGetGoodsRelatedResponse getGoodsRelatedArticles(ArticleGetGoodsRelatedRequest getGoodsRelatedArticlesRequest) throws Exception;

    /**
     * mGetGoodsRelatedArticles
     * @param mGetGoodsRelatedRequest - the mGetGoodsRelatedArticles request
     * @return the mGetGoodsRelatedArticles response
     * @throws Exception the exception
     */
    ArticleMGetGoodsRelatedResponse mGetGoodsRelatedArticles(ArticleMGetGoodsRelatedRequest mGetGoodsRelatedRequest) throws Exception;

    /**
     * articleSearch
     * @param searchRequest - the articleSearch request
     * @return the articleSearch response
     * @throws Exception the exception
     */
    ArticleSearchResponse articleSearch(ArticleSearchRequest searchRequest) throws Exception;

    /**
     * relatedFeed
     * @param relatedFeedRequest - the relatedFeed request
     * @return the relatedFeed response
     * @throws Exception the exception
     */
    ArticleRelatedFeedResponse relatedFeed(ArticleRelatedFeedRequest relatedFeedRequest) throws Exception;
}
