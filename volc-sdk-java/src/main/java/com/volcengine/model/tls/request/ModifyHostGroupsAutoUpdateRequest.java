package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyHostGroupsAutoUpdateRequest {
    @JSONField(name = HOST_GROUP_IDS)
    String[] hostGroupIds;

    @JSONField(name = AUTO_UPDATE)
    Boolean autoUpdate;

    @JSONField(name = UPDATE_START_TIME)
    String updateStartTime;

    @JSONField(name = UPDATE_END_TIME)
    String updateEndTime;
}
