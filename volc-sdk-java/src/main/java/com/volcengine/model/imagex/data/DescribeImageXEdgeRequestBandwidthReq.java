package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXEdgeRequestBandwidthReq {
    @JSONField(name = "ServiceIds")
    private String serviceIds;   // 传入多个用英文逗号分隔
    @JSONField(name = "DomainNames")
    private String domainNames;  // 传入多个用英文逗号分隔
    @JSONField(name = "Regions")
    private String regions;      // cdn区域。支持参数：中国大陆、亚太一区、亚太二区、亚太三区、欧洲区、北美区、南美区、中东区。传入多个用英文逗号分割。不传表示不过滤。
    @JSONField(name = "UserCountry")
    private String userCountry;  // 客户端国家。支持参数：中国、海外、美国等。传入多个用英文逗号分割。不传表示不过滤。
    @JSONField(name = "UserProvince")
    private String userProvince; // 客户端省份。传入多个用英文逗号分割。不传表示不过滤。
    @JSONField(name = "Protocols")
    private String protocols;    // 过滤网络协议。支持参数：HTTP、HTTPS。传入多个用英文逗号分割。不传为不过滤。
    @JSONField(name = "Isp")
    private String isp;          // 过滤运营商。传入多个用英文逗号分割。不传为不过滤。
    @JSONField(name = "GroupBy")
    private String groupBy;      // 维度拆分的维度值。不传表示不拆分维度。传入多个用英文逗号分隔。支持DomainName
    @JSONField(name = "StartTime")
    private String startTime;    // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;      // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "Interval")
    private String interval;     // 时间粒度，单位秒。支持300,3600,86400。不传默认查询时间段全部数据
}
