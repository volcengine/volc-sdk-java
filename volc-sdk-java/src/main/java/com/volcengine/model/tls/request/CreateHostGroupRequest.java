package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateHostGroupRequest {
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

    public boolean CheckValidation() {
        if (this.hostGroupName == null || this.hostGroupType == null) {
            return false;
        }
        return true;
    }
}
