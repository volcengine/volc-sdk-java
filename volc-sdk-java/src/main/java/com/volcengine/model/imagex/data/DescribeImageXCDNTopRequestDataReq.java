package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXCDNTopRequestDataReq {
    @JSONField(name = "ServiceIds")
    private String ServiceIds;  // 传入多个用英文逗号分隔
    @JSONField(name = "DomainNames")
    private String DomainNames; // 传入多个用英文逗号分隔
    @JSONField(name = "StartTime")
    private String StartTime;   // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String EndTime;     // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "KeyType")
    private String KeyType;     // 需要Top的对象
    @JSONField(name = "ValueType")
    private String ValueType;   // 单选Traffic/RequestCnt，代表按流量/请求次数排序 (KeyType=Domain时，只能为Traffic)
    @JSONField(name = "IPVersion")
    private String IPVersion;   // 单选IPv4/IPv6，不传为不限制； KeyType=Domain时无效
    @JSONField(name = "Country")
    private String Country;
    @JSONField(name = "Limit")
    private String Limit;          // 分页Limit，默认为0，即返回所有
    @JSONField(name = "Offset")
    private String Offset;         // 分页Offset，默认为0
}
