package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
public class EncryptConf {
    @JSONField(name = KMS_ENABLE)
    private boolean enable;
    @JSONField(name = KMS_ENCRYPT_TYPE)
    private String encryptType;
    @JSONField(name = KMS_ENCRYPT_USER_CMK_CONF)
    private EncryptUserCmkConf encryptUserCmkConf;

    public EncryptConf() {
        this(true, "default", null);
    }

    public EncryptConf(boolean enable) {
        this.enable = enable;
        this.encryptType = "default";
    }

    public EncryptConf(boolean enable, String encryptType) {
        this(enable, encryptType, null);
    }
}
