package com.volcengine.service.stream;

import com.volcengine.model.stream.log.*;
import com.volcengine.service.IBaseService;

public interface LogService extends IBaseService {

    /**
     * @Description: 点击上报
     * @param: clickLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse clickLog(ClickLogRequest clickLogRequest) throws Exception;

    /**
     * @Description: 详情页停留时长上报
     * @param: stayLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse stayLog(StayLogRequest stayLogRequest) throws Exception;

    /**
     * @Description: 视频播放开始事件上报
     * @param: videoPlayLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoPlayLog(VideoPlayLogRequest videoPlayLogRequest) throws Exception;

    /**
     * @Description: 视频播放结束事件上报
     * @param: videoOverLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoOverLog(VideoOverLogRequest videoOverLogRequest) throws Exception;

    /**
     * @Description: 客户端单条展现上报
     * @param: singleShowLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse singleShowLog(SingleShowLogRequest singleShowLogRequest) throws Exception;

    /**
     * @Description: 客户端多条展现上报
     * @param: multiShowLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse multiShowLog(MultiShowLogRequest multiShowLogRequest) throws Exception;

    /**
     * @Description: 视频/图文分享上报
     * @param: shareLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse shareLog(ShareLogRequest shareLogRequest) throws Exception;

    /**
     * @Description: 收藏事件上报
     * @param: favouriteLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse favouriteLog(FavouriteLogRequest favouriteLogRequest) throws Exception;

    /**
     * @Description: 数据回传验证
     * @param: verifyLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse verifyLog(VerifyLogRequest verifyLogRequest) throws Exception;

    /**
     * @Description: 点击关注
     * @param: followLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse followLog(FollowLogRequest followLogRequest) throws Exception;

    /**
     * @Description: 取消关注
     * @param: unfollowLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse unfollowLog(FollowLogRequest unfollowLogRequest) throws Exception;

    /**
     * @Description: 推人卡片
     * @param: followCardLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse followCardLog(FollowCardLogRequest followCardLogRequest) throws Exception;

    /**
     * @Description: 不感兴趣
     * @param: dislikeRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
     */
    LogResponse dislikeLog(DislikeLogRequest dislikeLogRequest) throws Exception;

    /**
     * @Description:  下滑播放开始
     * @param: videoPlayDrawLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoPlayDrawLog(VideoPlayDrawLogRequest videoPlayDrawLogRequest) throws Exception;

    /**
     * @Description:  滑动播放结束
     * @param: videoOverDrawLogRequest 
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoOverDrawLog(VideoOverDrawLogRequest videoOverDrawLogRequest) throws Exception;

    /**
     * @Description:  商品推广事件
     * @param: productShowLogRequest 
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse productShowLog(ProductShowLogRequest productShowLogRequest) throws Exception;

    /**
     * @Description:  push事件回传
     * @param: pushLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse pushLog(PushLogRequest pushLogRequest) throws Exception;

    /**
     * @Description: 点击商品
     * @param: productClickLogRequest 
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse productClickLog(ProductClickLogRequest productClickLogRequest) throws Exception;

    /**
     * @Description: 视频自动播放
     * @param: videoPlayAutoLogRequest 
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoPlayAutoLog(VideoPlayAutoLogRequest videoPlayAutoLogRequest) throws Exception;

    /**
     * @Description: 自动播放时长时间上报
     * @param: videoOverAutoLogRequest
     * @return com.volcengine.model.stream.log.LogResponse
     * @author zhangyuhang
    */
    LogResponse videoOverAutoLog(VideoOverAutoLogRequest videoOverAutoLogRequest) throws Exception;
}
