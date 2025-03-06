package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardUserInfo;
import lombok.Data;
import java.util.List;

@Data
public class DeleteVipOrBlackListUserInfoRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "DeleteAll")
    Integer DeleteAll;
    @JSONField(name = "DeleteUserList")
    List<AwardUserInfo> DeleteUserList;
    @JSONField(name = "Id")
    Long Id;
}
