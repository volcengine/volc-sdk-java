package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;

@Data
@NoArgsConstructor
public class DeleteHostGroupRequest {
    @JSONField(name = HOST_GROUP_ID)
    private String hostGroupId;

    /**
     * @param hostGroupId 机器组的 ID
     */
    public DeleteHostGroupRequest(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @param hostGroupId 机器组的 ID
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @return 机器组的 ID
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
