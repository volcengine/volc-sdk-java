package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetPodMetricResResult
 */
@lombok.Data
public final class GetPodMetricResResult  {

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>CPU 使用量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CPUUsage")
    private Double cPUUsage;

    /**
     * <p>理论分配的 CPU 核数。例如，单 node 8C12G 为例，单开 8 核，双开 4 核，以此类推。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CPUAlloc")
    private Double cPUAlloc;

    /**
     * <p>单 pod 最大可使用核数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CPUMax")
    private Double cPUMax;

    /**
     * <p>总内存，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MemTotal")
    private Long memTotal;

    /**
     * <p>理论分配的内存数，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MemAlloc")
    private Long memAlloc;

    /**
     * <p>实际已使用内存，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MemUsage")
    private Long memUsage;

    /**
     * <p>磁盘总量，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DiskTotal")
    private Long diskTotal;

    /**
     * <p>实际已使用磁盘容量，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DiskUsage")
    private Long diskUsage;

    /**
     * <p>Data 分区每秒读请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadOPS")
    private Integer readOPS;

    /**
     * <p>Data 分区每秒写请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WriteOPS")
    private Integer writeOPS;

    /**
     * <p>pod 上行带宽（出向），单位 byte/s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidth")
    private Long upBandwidth;

    /**
     * <p>pod 下行带宽（入向），单位 byte/s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidth")
    private Long downBandwidth;

    /**
     * <p>上行丢包率，小于 1 的数，小数点后保留 4 位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpLoss")
    private Double upLoss;

    /**
     * <p>下行丢包率，小于 1 的数，小数点后保留 4 位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownLoss")
    private Double downLoss;

    /**
     * <p>时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private Long timeStamp;

    /**
     * <p>Data 分区 IO 请求平均响应时间，单位为 ms，保留两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IOwait")
    private Double iOwait;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
