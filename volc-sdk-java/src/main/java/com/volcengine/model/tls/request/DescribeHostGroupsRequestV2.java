package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeHostGroupsRequestV2 {
    @JSONField(name = HOST_GROUP_ID, serialize = false)
    private String hostGroupId;
    @JSONField(name = HOST_GROUP_NAME, serialize = false)
    private String hostGroupName;
    @JSONField(name = PAGE_NUMBER, serialize = false)
    private Integer pageNumber;
    @JSONField(name = PAGE_SIZE, serialize = false)
    private Integer pageSize;
    @JSONField(name = HOST_IDENTIFIER, serialize = false)
    private String hostIdentifier;
    @JSONField(name = AUTO_UPDATE, serialize = false)
    private Boolean autoUpdate;
    @JSONField(name = IAM_PROJECT_NAME, serialize = false)
    private String iamProjectName;
    @JSONField(name = SERVICE_LOGGING, serialize = false)
    private Boolean serviceLogging;
    @JSONField(name = HIDDEN, serialize = false)
    private Boolean hidden;

    public String getHostGroupId() {
        return hostGroupId;
    }

    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    public String getHostGroupName() {
        return hostGroupName;
    }

    public void setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getHostIdentifier() {
        return hostIdentifier;
    }

    public void setHostIdentifier(String hostIdentifier) {
        this.hostIdentifier = hostIdentifier;
    }

    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    public Boolean getServiceLogging() {
        return serviceLogging;
    }

    public void setServiceLogging(Boolean serviceLogging) {
        this.serviceLogging = serviceLogging;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public boolean CheckValidation() {
        return true;
    }
}
