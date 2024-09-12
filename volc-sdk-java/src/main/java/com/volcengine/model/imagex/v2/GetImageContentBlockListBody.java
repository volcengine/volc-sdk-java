package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentBlockListBody
 */
@lombok.Data
public final class GetImageContentBlockListBody  {

    /**
     * <p>每页条数，取值范围是[10,1000]。默认值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>页码，仅返回该页码上的任务。默认值为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>开始查询时间，unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>结束查询时间，unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>资源更新状态，取值如下所示：</p>
     *
     * <p>- `submitting`：提交中</p>
     *
     * <p>- `running`：执行中</p>
     *
     * <p>- `succeed`：成功</p>
     *
     * <p>- `failed`：失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "State")
    private String state;

    /**
     * <p>指定要查询的 URL，缺省情况下查询当前服务所有禁用任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>按时间排序，取值如下所示：</p>
     *
     * <p>- `asc`：正序</p>
     *
     * <p>- `desc`：逆序</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Order")
    private String order;

    /**
     * <p>域名，指定后将返回包含该域名的 URL 禁用任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
