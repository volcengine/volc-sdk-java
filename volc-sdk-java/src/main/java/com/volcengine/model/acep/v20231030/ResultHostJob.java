package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultHostJob
 */
@lombok.Data
public final class ResultHostJob  {

    /**
     * <p>job id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobId")
    private String jobId;

    /**
     * <p>云机ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>job状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>job创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>job更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private Long updateAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
