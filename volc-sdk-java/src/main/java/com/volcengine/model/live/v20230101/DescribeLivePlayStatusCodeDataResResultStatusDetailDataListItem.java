package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItem  {

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>每个时间点的粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItem> statusDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
