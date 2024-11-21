package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddDomainV1ResResult
 */
@lombok.Data
public final class AddDomainV1ResResult  {

    /**
     * <p>新增域名内容安全审核工单，仅对内</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BPMLink")
    private String bPMLink;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>新增域名内容安全审核工单ID，仅对内</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BPMID")
    private String bPMID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
