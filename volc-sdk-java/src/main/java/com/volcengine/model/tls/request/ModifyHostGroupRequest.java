package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyHostGroupRequest {
    @JSONField(name = HOST_GROUP_ID)
    String hostGroupId;
    @JSONField(name = HOST_GROUP_NAME)
    String hostGroupName;
    @JSONField(name = HOST_GROUP_TYPE)
    String hostGroupType;
    @JSONField(name = HOST_IP_LIST)
    List<String> hostIpList;
    @JSONField(name = HOST_IDENTIFIER)
    String hostIdentifier;
    @JSONField(name = AUTO_UPDATE)
    Boolean autoUpdate;
    @JSONField(name = UPDATE_START_TIME)
    String updateStartTime;
    @JSONField(name = UPDATE_END_TIME)
    String updateEndTime;
    @JSONField(name = SERVICE_LOGGING)
    Boolean serviceLogging;

    /**
     * @param hostGroupId 机器组 ID
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @return 机器组 ID
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    /**
     * @return 机器组的名称
     */
    public String getHostGroupName() {
        return hostGroupName;
    }

    /**
     * @param hostGroupName 机器组的名称
     */
    public void setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }

    /**
     * @return 机器组的类型：IP、Label
     */
    public String getHostGroupType() {
        return hostGroupType;
    }

    /**
     * @param hostGroupType 机器组的类型：IP、Label
     */
    public void setHostGroupType(String hostGroupType) {
        this.hostGroupType = hostGroupType;
    }

    /**
     * @return 机器 IP 列表
     */
    public List<String> getHostIpList() {
        return hostIpList;
    }

    /**
     * @param hostIpList 机器 IP 列表
     */
    public void setHostIpList(List<String> hostIpList) {
        this.hostIpList = hostIpList;
    }

    /**
     * @return 机器标识。HostGroupType 为 Label 时必选
     */
    public String getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * @param hostIdentifier 机器标识。HostGroupType 为 Label 时必选
     */
    public void setHostIdentifier(String hostIdentifier) {
        this.hostIdentifier = hostIdentifier;
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
     * @return LogCollector 自动升级的开始时间
     */
    public String getUpdateStartTime() {
        return updateStartTime;
    }

    /**
     * @param updateStartTime LogCollector 自动升级的开始时间
     */
    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    /**
     * @return LogCollector 自动升级的结束时间
     */
    public String getUpdateEndTime() {
        return updateEndTime;
    }

    /**
     * @param updateEndTime LogCollector 自动升级的结束时间
     */
    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public Boolean getServiceLogging() {
        return serviceLogging;
    }

    public void setServiceLogging(Boolean serviceLogging) {
        this.serviceLogging = serviceLogging;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
