package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXCDNTopRequestDataReq {
    @JSONField(name = "ServiceIds")
    private String serviceIds;  // 传入多个用英文逗号分隔
    @JSONField(name = "DomainNames")
    private String domainNames; // 传入多个用英文逗号分隔
    @JSONField(name = "StartTime")
    private String startTime;   // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;     // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "KeyType")
    private String keyType;     // 需要Top的对象
    @JSONField(name = "ValueType")
    private String valueType;   // 单选Traffic/RequestCnt，代表按流量/请求次数排序 (KeyType=Domain时，只能为Traffic)
    @JSONField(name = "IPVersion")
    private String iPVersion;   // 单选IPv4/IPv6，不传为不限制； KeyType=Domain时无效
    @JSONField(name = "Country")
    private String country;
    @JSONField(name = "Limit")
    private String limit;          // 分页Limit，默认为0，即返回所有
    @JSONField(name = "Offset")
    private String offset;         // 分页Offset，默认为0
}
