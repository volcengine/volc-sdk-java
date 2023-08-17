package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;
import static com.volcengine.model.tls.Const.IP;

@Data
@NoArgsConstructor
public class DeleteHostRequest {
    @JSONField(name = HOST_GROUP_ID)
    private String hostGroupId;
    @JSONField(name = IP)
    private String ip;

    /**
     * @param hostGroupId 机器组的 ID
     * @param ip 机器的 IP
     */
    public DeleteHostRequest(String hostGroupId, String ip) {
        this.hostGroupId = hostGroupId;
        this.ip = ip;
    }

    /**
     * @return 机器组的 ID
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    /**
     * @param hostGroupId 机器组的 ID
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    /**
     * @return 机器的 IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip 机器的 IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean CheckValidation() {
        if (this.hostGroupId == null || this.ip == null) {
            return false;
        }
        return true;
    }
}
