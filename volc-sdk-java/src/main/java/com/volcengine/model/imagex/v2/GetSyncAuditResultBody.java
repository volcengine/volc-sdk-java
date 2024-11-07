package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetSyncAuditResultBody
 */
@lombok.Data
public final class GetSyncAuditResultBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditAbility")
    private Integer auditAbility;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDimensions")
    private List<String> auditDimensions;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableLargeImageDetect")
    private Boolean enableLargeImageDetect;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTextDimensions")
    private List<String> auditTextDimensions;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
