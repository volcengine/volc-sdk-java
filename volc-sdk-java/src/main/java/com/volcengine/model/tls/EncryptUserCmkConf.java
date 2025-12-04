package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
public class EncryptUserCmkConf {
    @JSONField(name = KMS_ENCRYPT_USER_CMK_CONF_USER_CMK_ID)
    private String userCmkID;
    @JSONField(name = KMS_ENCRYPT_USER_CMK_CONF_TRN)
    private String trn;
    @JSONField(name = KMS_ENCRYPT_USER_CMK_CONF_REGION_ID)
    private String regionId;
}
