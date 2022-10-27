package com.volcengine.service.stream;

import com.volcengine.model.stream.*;
import com.volcengine.service.IBaseService;

public interface StreamService extends IBaseService {

    void SetNeedMonitor(boolean open);

    /**
     *    获取accessToken
     * @param wapRegisterRequest
     * @return com.volcengine.model.stream.GenTokenResponse
     * @author zhangyuhang
    */
    WapRegisterResponse wapRegister(WapRegisterRequest wapRegisterRequest) throws Exception;

    /**
     *    获取列表页
     * @param getListRequest
     * @return com.volcengine.model.stream.GetListResponse
     * @author zhangyuhang
    */
    GetListResponse getList(GetListRequest getListRequest) throws Exception;

    /**
     *    点赞
     * @param diggRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse digg(DiggRequest diggRequest) throws Exception;

    /**
     *    踩
     * @param diggRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse bury(DiggRequest diggRequest) throws Exception;

    /**
     *    取消点赞
     * @param diggRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse unDigg(DiggRequest diggRequest) throws Exception;

    /**
     *    取消踩
     * @param diggRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse unBury(DiggRequest diggRequest) throws Exception;

    /**
     *    通过groupId获取文章内容
     * @param getArticleRequest
     * @return com.volcengine.model.stream.GetCollectionArticleResponse
     * @author zhangyuhang
    */
    @Deprecated
    GetArticleResponse getArticle(GetArticleRequest getArticleRequest) throws Exception;

    /**
     *    通过groupIds批量获取文章内容
     * @param getArticlesRequest
     * @return com.volcengine.model.stream.GetCollectionArticlesResponse
     * @author zhangyuhang
    */
    @Deprecated
    GetArticlesResponse getArticles(GetArticlesRequest getArticlesRequest) throws Exception;

    /**
     *    举报
     * @param feedBackRequest
     * @return com.volcengine.model.stream.FeedBackResponse
     * @author zhangyuhang
    */
    FeedBackResponse feedBack(FeedBackRequest feedBackRequest) throws Exception;

    /**
     *    关注
     * @param followRequest
     * @return com.volcengine.model.stream.FollowResponse
     * @author zhangyuhang
    */
    @Deprecated
    FollowResponse follow(FollowRequest followRequest) throws Exception;

    /**
     *    取消关注
     * @param unfollowRequest
     * @return com.volcengine.model.stream.UnfollowResponse
     * @author zhangyuhang
    */
    @Deprecated
    UnfollowResponse unfollow(UnfollowRequest unfollowRequest) throws Exception;

    /**
     *    获取关注关系
     * @param checkRelationRequest
     * @return com.volcengine.model.stream.CheckRelationResponse
     * @author zhangyuhang
    */
    @Deprecated
    CheckRelationResponse checkRelation(CheckRelationRequest checkRelationRequest) throws Exception;

    /**
     *    关注列表
     * @param getFollowingListRequest
     * @return com.volcengine.model.stream.GetFollowingListResponse
     * @author zhangyuhang
    */
    @Deprecated
    GetFollowingListResponse getFollowingList(GetFollowingListRequest getFollowingListRequest) throws Exception;

    /**
     *    关注频道更新提示
     * @param refreshTipsRequest
     * @return com.volcengine.model.stream.RelatedArticleResponse
     * @author zhangyuhang
    */
    @Deprecated
    RefreshTipsResponse refreshTips(RefreshTipsRequest refreshTipsRequest) throws Exception;

    /**
     *    关注作者最新发文
     * @param followArticlesRequest
     * @return com.volcengine.model.stream.FollowArticlesResponse
     * @author zhangyuhang
    */
    @Deprecated
    FollowArticlesResponse getFollowArticles(FollowArticlesRequest followArticlesRequest) throws Exception;

    /**
     *    相关作者
     * @param recommendRelatedUserRequest
     * @return com.volcengine.model.stream.RecommendRelatedUserResponse
     * @author zhangyuhang
    */
    RecommendRelatedUserResponse recommendRelatedUser(RecommendRelatedUserRequest recommendRelatedUserRequest) throws Exception;

    /**
     *    推人
     * @param recommendCategoryUserRequest
     * @return com.volcengine.model.stream.RecommendCategoryUserResponse
     * @author zhangyuhang
    */
    RecommendCategoryUserResponse recommendCategoryUser(RecommendCategoryUserRequest recommendCategoryUserRequest) throws Exception;

    /**
     *    获取推人分类
     * @param recommendCategoryInfoRequest
     * @return com.volcengine.model.stream.RecommendCategoryInfoResponse
     * @author zhangyuhang
    */
    RecommendCategoryInfoResponse recommendCategoryInfo(RecommendCategoryInfoRequest recommendCategoryInfoRequest) throws Exception;
    /**
     *    相关推荐
     * @param relatedArticleRequest
     * @return com.volcengine.model.stream.RelatedArticleResponse
     * @author zhangyuhang
    */
    RelatedArticleResponse relatedArticle(RelatedArticleRequest relatedArticleRequest) throws Exception;
    
    /**
     *    获取点赞列表
     * @param getDiggListRequest
     * @return com.volcengine.model.stream.GetDiggListResponse
     * @author zhangyuhang
    */
    GetDiggListResponse getDiggList(GetDiggListRequest getDiggListRequest) throws Exception;

    /**
     *    获取视频url
     * @param getVideoUrlRequest
     * @return com.volcengine.model.stream.GetVideoUrlResponse
     * @author zhangyuhang
     */
    @Deprecated
    GetVideoUrlResponse getVideoUrl(GetVideoUrlRequest getVideoUrlRequest) throws Exception;

    /**
     *    获取商品推广
     * @param getUnionProductRequest
     * @return com.volcengine.model.stream.GetVideoUrlResponse
     * @author zhangyuhang
    */
    GetUnionProductResponse getUnionProduct(GetUnionProductRequest getUnionProductRequest) throws Exception;

    /**
     *    热点分发
     * @param hotBoardRequest
     * @return com.volcengine.model.stream.HotBoardResponse
     * @author zhangyuhang
    */
    HotBoardResponse hotBoard(HotBoardRequest hotBoardRequest) throws Exception;

    /**
     *    热点分发list
     * @param hotBoardListRequest
     * @return com.volcengine.model.stream.HotBoardListResponse
     * @author zhangyuhang
     */
    HotBoardListResponse hotBoardList(HotBoardListRequest hotBoardListRequest) throws Exception;

    /**
     *    热点分发
     * @param hotBoardBoardRequest
     * @return com.volcengine.model.stream.HotBoardBoardResponse
     * @author zhangyuhang
     */
    HotBoardBoardResponse hotBoardBoard(HotBoardBoardRequest hotBoardBoardRequest) throws Exception;

    /**
     *    热点分发
     * @param hotBoardArticleRequest
     * @return com.volcengine.model.stream.HotBoardArticleResponse
     * @author zhangyuhang
     */
    HotBoardArticleResponse hotBoardArticle(HotBoardArticleRequest hotBoardArticleRequest) throws Exception;
}
