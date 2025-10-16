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

    /**
     * <p>鉴权类型，取值如下：</p>
     *
     * <p>- `TypeA`：A 类型。</p>
     *
     * <p>- `TypeB`：B 类型。</p>
     *
     * <p>- `TypeC`：C 类型。</p>
     *
     * <p>- `TypeCustom`：自定义类型。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>更多有关 A、B、C 类型鉴权的信息，详见[配置 URL 鉴权](https://www.volcengine.com/docs/6469/1274178)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthType")
    private String authType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
