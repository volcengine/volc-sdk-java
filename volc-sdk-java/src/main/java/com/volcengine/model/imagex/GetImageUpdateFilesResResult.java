package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageUpdateFilesResResult
 */
@lombok.Data
public final class GetImageUpdateFilesResResult  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>符合条件的 URL 总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>符合条件的 URL 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateUrls")
    private List<GetImageUpdateFilesResResultUpdateUrlsItem> updateUrls;

    /**
     * <p>当前存储状态，取值为：正常、未审核、禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
