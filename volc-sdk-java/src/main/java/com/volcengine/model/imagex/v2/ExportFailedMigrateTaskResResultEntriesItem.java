package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ExportFailedMigrateTaskResResultEntriesItem
 */
@lombok.Data
public final class ExportFailedMigrateTaskResResultEntriesItem  {

    /**
     * <p>文件地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>失败原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>失败错误码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
