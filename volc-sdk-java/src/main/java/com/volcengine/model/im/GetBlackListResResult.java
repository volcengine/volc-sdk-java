package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetBlackListResResult
 */
@lombok.Data
public final class GetBlackListResResult  {

    /**
     * <p>黑名单用户详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlackListInfos")
    private List<GetBlackListResResultBlackListInfosItem> blackListInfos;

    /**
     * <p>黑名单用户总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Long totalCount;

    /**
     * <p>是否还有下一页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一页起始下标。为负时表示后续没有成员数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Long nextCursor;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
