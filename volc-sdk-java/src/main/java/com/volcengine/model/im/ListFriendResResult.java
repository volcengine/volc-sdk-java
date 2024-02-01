package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListFriendResResult
 */
@lombok.Data
public final class ListFriendResResult  {

    /**
     * <p>好友详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FriendInfos")
    private List<ListFriendResResultFriendInfosItem> friendInfos;

    /**
     * <p>好友总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Long totalCount;

    /**
     * <p>是否还有下一页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一页起始位置。为负时表示后续没有成员数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Long nextCursor;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
