package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksResResultTasksItemProgress
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItemProgress  {

    /**
     * <p>迁移成功文件数</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessCnt")
    private Long successCnt;

    /**
     * <p>失败原因。仅当 `Status`=`Failed` 时有值。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>失败错误码。仅当 `Status`=`Failed` 时有值。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    /**
     * <p>迁移文件总量，单位为 byte</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalAmount")
    private Long totalAmount;

    /**
     * <p>迁移成功文件量，单位为 byte</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessAmount")
    private Long successAmount;

    /**
     * <p>总文件数</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCnt")
    private Long totalCnt;

    /**
     * <p>迁移失败文件数</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailCnt")
    private Long failCnt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
