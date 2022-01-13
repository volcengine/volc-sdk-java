package com.volcengine.service.stream;

import com.volcengine.model.stream.*;
import com.volcengine.service.IBaseService;

public interface StreamService extends IBaseService {

    /**
     * @Description: 获取accessToken
     * @param: genTokenRequest
     * @return com.volcengine.model.stream.GenTokenResponse
     * @author zhangyuhang
    */
    WapRegisterResponse wapRegister(WapRegisterRequest wapRegisterRequest) throws Exception;

    /**
     * @Description: 获取列表页
     * @param: getListRequest
     * @return com.volcengine.model.stream.GetListResponse
     * @author zhangyuhang
    */
    GetListResponse getList(GetListRequest getListRequest) throws Exception;

    /**
     * @Description: 点赞
     * @param: getDiggCountRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse digg(DiggRequest diggRequest) throws Exception;

    /**
     * @Description: 踩
     * @param: getDiggCountRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse bury(DiggRequest diggRequest) throws Exception;

    /**
     * @Description: 取消点赞
     * @param: getDiggCountRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse unDigg(DiggRequest diggRequest) throws Exception;

    /**
     * @Description: 取消踩
     * @param: getDiggCountRequest
     * @return com.volcengine.model.stream.GetDiggCountResponse
     * @author zhangyuhang
    */
    DiggResponse unBury(DiggRequest diggRequest) throws Exception;
    /**
     * @Description: 通过groupId获取文章内容
     * @param: getCollectionArticleRequest
     * @return com.volcengine.model.stream.GetCollectionArticleResponse
     * @author zhangyuhang
    */
    GetArticleResponse getArticle(GetArticleRequest getArticleRequest) throws Exception;

    /**
     * @Description: 通过groupIds批量获取文章内容
     * @param: getCollectionArticlesRequest
     * @return com.volcengine.model.stream.GetCollectionArticlesResponse
     * @author zhangyuhang
    */
    GetArticlesResponse getArticles(GetArticlesRequest getArticlesRequest) throws Exception;

    /**
     * @Description: 举报
     * @param: feedBackRequest
     * @return com.volcengine.model.stream.FeedBackResponse
     * @author zhangyuhang
    */
    FeedBackResponse feedBack(FeedBackRequest feedBackRequest) throws Exception;

    /**
     * @Description: 关注
     * @param: followRequest
     * @return com.volcengine.model.stream.FollowResponse
     * @author zhangyuhang
    */
    FollowResponse follow(FollowRequest followRequest) throws Exception;

    /**
     * @Description: 取消关注
     * @param: unfollowRequest
     * @return com.volcengine.model.stream.UnfollowResponse
     * @author zhangyuhang
    */
    UnfollowResponse unfollow(UnfollowRequest unfollowRequest) throws Exception;

    /**
     * @Description: 获取关注关系
     * @param: checkRelationRequest
     * @return com.volcengine.model.stream.CheckRelationResponse
     * @author zhangyuhang
    */
    CheckRelationResponse checkRelation(CheckRelationRequest checkRelationRequest) throws Exception;

    /**
     * @Description: 关注列表
     * @param: getFollowingListRequest
     * @return com.volcengine.model.stream.GetFollowingListResponse
     * @author zhangyuhang
    */
    GetFollowingListResponse getFollowingList(GetFollowingListRequest getFollowingListRequest) throws Exception;

    /**
     * @Description: 关注频道更新提示
     * @param: refreshTipsRequest
     * @return com.volcengine.model.stream.RelatedArticleResponse
     * @author zhangyuhang
    */
    RefreshTipsResponse refreshTips(RefreshTipsRequest refreshTipsRequest) throws Exception;

    /**
     * @Description: 关注作者最新发文
     * @param: followArticlesRequest
     * @return com.volcengine.model.stream.FollowArticlesResponse
     * @author zhangyuhang
    */
    FollowArticlesResponse getFollowArticles(FollowArticlesRequest followArticlesRequest) throws Exception;

    /**
     * @Description: 相关作者
     * @param: recommendRelatedUserRequest
     * @return com.volcengine.model.stream.RecommendRelatedUserResponse
     * @author zhangyuhang
    */
    RecommendRelatedUserResponse recommendRelatedUser(RecommendRelatedUserRequest recommendRelatedUserRequest) throws Exception;

    /**
     * @Description: 推人
     * @param: recommendCategoryUserRequest
     * @return com.volcengine.model.stream.RecommendCategoryUserResponse
     * @author zhangyuhang
    */
    RecommendCategoryUserResponse recommendCategoryUser(RecommendCategoryUserRequest recommendCategoryUserRequest) throws Exception;

    /**
     * @Description: 获取推人分类
     * @param: recommendCategoryInfoRequest
     * @return com.volcengine.model.stream.RecommendCategoryInfoResponse
     * @author zhangyuhang
    */
    RecommendCategoryInfoResponse recommendCategoryInfo(RecommendCategoryInfoRequest recommendCategoryInfoRequest) throws Exception;
    /**
     * @Description: 相关推荐
     * @param: relatedArticleRequest
     * @return com.volcengine.model.stream.RelatedArticleResponse
     * @author zhangyuhang
    */
    RelatedArticleResponse relatedArticle(RelatedArticleRequest relatedArticleRequest) throws Exception;
    
    /**
     * @Description: 获取点赞列表
     * @param: getDiggListRequest
     * @return com.volcengine.model.stream.GetDiggListResponse
     * @author zhangyuhang
    */
    GetDiggListResponse getDiggList(GetDiggListRequest getDiggListRequest) throws Exception;

    /**
     * @Description: 获取视频url
     * @param: getVideoUrlRequest
     * @return com.volcengine.model.stream.GetVideoUrlResponse
     * @author zhangyuhang
     */
    GetVideoUrlResponse getVideoUrl(GetVideoUrlRequest getVideoUrlRequest) throws Exception;

    /**
     * @Description: 获取商品推广
     * @param: getUnionProductRequest
     * @return com.volcengine.model.stream.GetVideoUrlResponse
     * @author zhangyuhang
    */
    GetUnionProductResponse getUnionProduct(GetUnionProductRequest getUnionProductRequest) throws Exception;

    /**
     * @Description: 热点分发
     * @param: hotBoardRequest
     * @return com.volcengine.model.stream.HotBoardResponse
     * @author zhangyuhang
    */
    HotBoardResponse hotBoard(HotBoardRequest hotBoardRequest) throws Exception;
}
