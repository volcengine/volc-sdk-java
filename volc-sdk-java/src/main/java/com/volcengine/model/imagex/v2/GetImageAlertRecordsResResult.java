package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAlertRecordsResResult
 */
@lombok.Data
public final class GetImageAlertRecordsResResult  {

    /**
     * <p>是否有更多记录，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>记录总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>告警记录列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlertRecords")
    private List<GetImageAlertRecordsResResultAlertRecordsItem> alertRecords;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
