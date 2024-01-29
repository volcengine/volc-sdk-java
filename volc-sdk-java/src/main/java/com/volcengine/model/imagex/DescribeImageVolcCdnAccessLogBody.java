package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageVolcCdnAccessLogBody
 */
@lombok.Data
public final class DescribeImageVolcCdnAccessLogBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>地域。支持以下取值：</p>
     *
     * <p>- chinese_mainland：中国大陆，返回的日志包的名称不包含 outsideChineseMainland；</p>
     *
     * <p>- global：全球；</p>
     *
     * <p>- outside_chinese_mainland：全球（除中国大陆），返回的日志包的名称包含 outsideChineseMainland。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 该参数仅当您启用了中国大陆外加速区域时，配置才会生效，否则仅返回国内日志数据。</p>
     *
     * <p>- 您可以登录 [veImageX 控制台](https://console.volcengine.com/imagex/overview/)参考[域名配置 > 高级配置](https://www.volcengine.com/docs/508/127680#%E9%AB%98%E7%BA%A7%E9%85%8D%E7%BD%AE)开启全球加速，两个工作日左右全球加速启用生效。</p>
     *
     * <p>- 全球加速功能为 veImageX 计费项，具体计费详情请参考[后付费-按量计费](https://www.volcengine.com/docs/508/65935)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>查询日志开始时间戳，Unix 时间，单位为秒。</p>
     *
     * <p>例如：指定起始时间为`1641844915`，代表 2022-01-11 04:01:55 UTC。 在查询返回的日志列表中，第一个统计在内的日志包名称是domain\_20220111050000\_20220111060000.gz。该日志包中包含该域名在 05:00:00 和 05:59:59 之间的访问日志。</p>
     *
     * <p>StartTime 和 EndTime 之间的时间范围不能大于 30 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>查询日志结束时间戳，Unix 时间，单位为秒。</p>
     *
     * <p>例如：指定结束时间为`1641953589`，代表 2022-01-12 10:13:09 UTC。在查询返回的日志列表中，最后一个统计在内的日志包名称是 domain_20220112100000_20220112110000.gz。该日志包中包含该域名在 10:00:00 和 10:59:59 之间的访问日志。</p>
     *
     * <p>StartTime 和 EndTime 之间的时间范围不能大于 30 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>指定的页码，系统只返回该页面上的日志包数据。起始值为 `1`，如果指定页码不存在，则返回空值。</p>
     *
     * <p>:::tip</p>
     *
     * <p>建议第一次提交查询时指定页码为 1。您可以根据响应正文中的`TotalCount`和`PageSize`参数的值计算结果页数。之后在查询中指定`PageNum`来获取该页面上日志包。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>指定查询结果中每页包含的日志包数量。取值范围为 [10, 100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
