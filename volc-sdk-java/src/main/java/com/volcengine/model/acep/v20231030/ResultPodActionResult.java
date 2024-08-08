package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodActionResult
 */
@lombok.Data
public final class ResultPodActionResult  {

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>错误信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    /**
     * <p>操作执行是否成功：</p>
     *
     *
     *
     * <p>- true：成功；</p>
     *
     * <p>- false：失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Boolean success;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
