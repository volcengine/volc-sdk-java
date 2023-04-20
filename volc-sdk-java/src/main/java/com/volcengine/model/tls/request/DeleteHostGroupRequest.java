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

    public DeleteHostGroupRequest(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

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
