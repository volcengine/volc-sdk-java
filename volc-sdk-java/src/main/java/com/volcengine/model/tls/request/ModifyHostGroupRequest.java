package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyHostGroupRequest {
    @JSONField(name=HOST_GROUP_ID)
    String hostGroupId;
    @JSONField(name=HOST_GROUP_NAME)
    String hostGroupName;
    @JSONField(name=HOST_GROUP_TYPE)
    String hostGroupType;
    @JSONField(name=HOST_IP_LIST)
    List<String> hostIpList;
    @JSONField(name=HOST_IDENTIFIER)
    String hostIdentifier;
}
