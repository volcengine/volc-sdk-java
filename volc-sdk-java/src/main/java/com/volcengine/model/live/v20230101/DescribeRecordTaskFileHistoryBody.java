package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryBody
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryBody  {

    /**
     * <p>域名空间名称。由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，默认查询所有流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定 `Stream`，必须同时指定 `App` 的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>开始录制时间，RFC3339 格式的 UTC 时间，精度为 s。当您查询指定录制任务详情时，DateFrom 应设置为开始时间之前的任意时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateFrom")
    private String dateFrom;

    /**
     * <p>结束录制时间，结束时间需晚于 `DateFrom`，且与 `DateFrom` 间隔不超过 7天，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTo")
    private String dateTo;

    /**
     * <p>分页查询页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>单个分页中，查询的结果数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>录制文件保存位置。默认取值为 tos。</p>
     *
     * <p>- tos</p>
     *
     * <p>- vod</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
