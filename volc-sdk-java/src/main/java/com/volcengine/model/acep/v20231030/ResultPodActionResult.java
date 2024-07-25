package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodActionResult
 */
@lombok.Data
public final class ResultPodActionResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Boolean success;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
