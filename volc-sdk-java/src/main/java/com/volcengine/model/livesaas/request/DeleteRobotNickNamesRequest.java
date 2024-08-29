package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.util.List;

@Data
public class DeleteRobotNickNamesRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotNickNameIds")
    List<Long> RobotNickNameIds;
}
