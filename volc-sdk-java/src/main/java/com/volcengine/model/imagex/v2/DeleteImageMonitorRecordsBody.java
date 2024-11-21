package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageMonitorRecordsBody
 */
@lombok.Data
public final class DeleteImageMonitorRecordsBody  {

    /**
     * <p>待删除的报警记录 Marker 列表，您可通过调用 [GetImageAlertRecords](https://www.volcengine.com/docs/508/1112187) 获取所需值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Markers")
    private List<String> markers;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
