package com.volcengine.service.stream;

import com.volcengine.model.stream.consumer.*;
import com.volcengine.service.IBaseService;

public interface StreamConsumerService extends IBaseService {

    void SetNeedMonitor(boolean open);

    /**
     * 新版关注
     * @param followActionRequest
     * @return com.volcengine.model.stream.consumer.FollowActionResponse
     * @author zhangyuhang
    */
    FollowActionResponse followAction(FollowActionRequest followActionRequest) throws Exception;

    /**
     * 新版取消关注
     * @param unfollowActionRequest
     * @return com.volcengine.model.stream.consumer.UnfollowActionResponse
     * @author zhangyuhang
    */
    UnfollowActionResponse unfollowAction(UnfollowActionRequest unfollowActionRequest) throws Exception;

    /**
     * 新版获取关注列表
     * @param followListRequest
     * @return com.volcengine.model.stream.consumer.FollowListResponse
     * @author zhangyuhang
    */
    FollowListResponse followList(FollowListRequest followListRequest) throws Exception;

    /**
     * 新版获取关注关系
     * @param followCheckRequest
     * @return com.volcengine.model.stream.consumer.FollowCheckResponse
     * @author zhangyuhang
    */
    FollowCheckResponse followCheck(FollowCheckRequest followCheckRequest) throws Exception;

    /**
     * 获取文章信息(已废弃)
     * @param singleArticleRequest
     * @return com.volcengine.model.stream.consumer.SingleArticleResponse
     * @author zhangyuhang
    */
    SingleArticleResponse singleArticle(SingleArticleRequest singleArticleRequest) throws Exception;

    /**
     * 获取文章信息
     * @param singleArticleRequest
     * @return com.volcengine.model.stream.consumer.SingleArticleResponseV2
     */
    SingleArticleResponseV2 singleArticleV2(SingleArticleRequest singleArticleRequest) throws Exception;

    /**
     * 批量获取文章信息(已废弃)
     * @param multiArticlesRequest
     * @return com.volcengine.model.stream.consumer.MultiArticlesResponse
     * @author zhangyuhang
    */
    MultiArticlesResponse multiArticles(MultiArticlesRequest multiArticlesRequest) throws Exception;

    /**
     * 批量获取文章信息
     * @param multiArticlesRequest
     * @return com.volcengine.model.stream.consumer.MultiArticlesResponse
     */
    MultiArticlesResponseV2 multiArticlesV2(MultiArticlesRequest multiArticlesRequest) throws Exception;
}
