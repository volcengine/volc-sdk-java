package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyHostGroupsAutoUpdateRequest {
    @JSONField(name = HOST_GROUP_IDS)
    String[] hostGroupIds;

    @JSONField(name = AUTO_UPDATE)
    Boolean autoUpdate;

    @JSONField(name = UPDATE_START_TIME)
    String updateStartTime;

    @JSONField(name = UPDATE_END_TIME)
    String updateEndTime;

    /**
     * @param hostGroupIds    机器组 ID 列表
     * @param autoUpdate      机器组服务器中安装的 LogCollector 是否开启自动升级功能
     * @param updateStartTime LogCollector 的自动升级的开始时间
     * @param updateEndTime   LogCollector 的自动升级的结束时间
     */
    public ModifyHostGroupsAutoUpdateRequest(String[] hostGroupIds, Boolean autoUpdate, String updateStartTime, String updateEndTime) {
        this.hostGroupIds = hostGroupIds;
        this.autoUpdate = autoUpdate;
        this.updateStartTime = updateStartTime;
        this.updateEndTime = updateEndTime;
    }

    /**
     * @return 机器组 ID 列表
     */
    public String[] getHostGroupIds() {
        return hostGroupIds;
    }

    /**
     * @param hostGroupIds 机器组 ID 列表
     */
    public void setHostGroupIds(String[] hostGroupIds) {
        this.hostGroupIds = hostGroupIds;
    }

    /**
     * @return 机器组服务器中安装的 LogCollector 是否开启自动升级功能
     */
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * @param autoUpdate 机器组服务器中安装的 LogCollector 是否开启自动升级功能
     */
    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * @return LogCollector 的自动升级的开始时间
     */
    public String getUpdateStartTime() {
        return updateStartTime;
    }

    /**
     * @param updateStartTime LogCollector 的自动升级的开始时间
     */
    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    /**
     * @return LogCollector 的自动升级的开始时间
     */
    public String getUpdateEndTime() {
        return updateEndTime;
    }

    /**
     * @param updateEndTime LogCollector 的自动升级的开始时间
     */
    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.hostGroupIds == null) {
            return false;
        }
        return true;
    }
}
