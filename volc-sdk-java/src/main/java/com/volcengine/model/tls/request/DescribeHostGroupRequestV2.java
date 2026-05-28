package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;

@Data
@NoArgsConstructor
public class DescribeHostGroupRequestV2 {
    @JSONField(name = HOST_GROUP_ID, serialize = false)
    private String hostGroupId;

    public DescribeHostGroupRequestV2(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    public String getHostGroupId() {
        return hostGroupId;
    }

    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    public boolean CheckValidation() {
        return this.hostGroupId != null;
    }
}
