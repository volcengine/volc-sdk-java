package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateVerifyContentResResult
 */
@lombok.Data
public final class CreateVerifyContentResResult  {

    /**
     * <p>校验内容记录值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>主机记录</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubDomain")
    private String subDomain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
