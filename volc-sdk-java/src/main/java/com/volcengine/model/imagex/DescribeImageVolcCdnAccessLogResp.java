package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageVolcCdnAccessLogResp {
    @JSONField(name = "Domain")
    private String domain;
    @JSONField(name = "PageSize")
    private Integer pageSize;
    @JSONField(name = "PageNum")
    private Integer pageNum;
    @JSONField(name = "TotalCount")
    private Integer totalCount;
    @JSONField(name = "Logs")
    private List<DescribeImageVolcCdnAccessLogRespLog> logs;
}
