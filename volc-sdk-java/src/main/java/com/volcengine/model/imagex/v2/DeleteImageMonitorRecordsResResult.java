package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageMonitorRecordsResResult
 */
@lombok.Data
public final class DeleteImageMonitorRecordsResResult  {

    /**
     * <p>成功删除的报警记录列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeletedRecords")
    private List<String> deletedRecords;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
