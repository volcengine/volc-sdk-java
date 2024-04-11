package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * DescribeAuthResResultAuthListItemAuthDetailListItem
 */
@lombok.Data
public final class DescribeAuthResResultAuthListItemAuthDetailListItem  {

    /**
     * <p>自定义鉴权密钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecretKey")
    private String secretKey;

    /**
     * <p>对称加密算法。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>自定义推拉流地址中，鉴权参数 `volcSecret` 和 `volcTime` 的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private Map<String, String> authField;

    /**
     * <p>生成加密字符串使用的加密字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
