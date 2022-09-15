package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_ID;
import static com.volcengine.model.tls.Const.IP;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteHostRequest {
    @JSONField(name = HOST_GROUP_ID)
    private String hostGroupId;
    @JSONField(name = IP)
    private String ip;

}
