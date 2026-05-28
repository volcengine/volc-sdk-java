package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeBoundHostGroupsRequest {
    @JSONField(name = RULE_ID, serialize = false)
    private String ruleId;
    @JSONField(name = PAGE_NUMBER, serialize = false)
    private Integer pageNumber;
    @JSONField(name = PAGE_SIZE, serialize = false)
    private Integer pageSize;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean CheckValidation() {
        return this.ruleId != null;
    }
}
