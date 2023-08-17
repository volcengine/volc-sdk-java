package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeHostGroupRequest {
    private String hostGroupId;

    /**
     * @param hostGroupId 机器组 ID
     */
    public DescribeHostGroupRequest(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
