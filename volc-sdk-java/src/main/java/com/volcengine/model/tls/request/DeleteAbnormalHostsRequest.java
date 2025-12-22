package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;

@Data
@NoArgsConstructor
public class DeleteAbnormalHostsRequest {
    @JSONField(name = HOST_GROUP_ID)
    private String hostGroupId;

    /**
     * @param hostGroupId 机器组的 ID
     */
    public DeleteAbnormalHostsRequest(String hostGroupId) {
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
        return this.hostGroupId != null;
    }
}
