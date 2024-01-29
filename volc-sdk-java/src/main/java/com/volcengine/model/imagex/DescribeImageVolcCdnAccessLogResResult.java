package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageVolcCdnAccessLogResResult
 */
@lombok.Data
public final class DescribeImageVolcCdnAccessLogResResult  {

    /**
     * <p>加速域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>指定的每页日志包数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>指定的页码数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>日志包总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Long totalCount;

    /**
     * <p>查询的日志数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Logs")
    private List<DescribeImageVolcCdnAccessLogResResultLogsItem> logs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
