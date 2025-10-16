package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * UpdateAuthKeyBodyAuthDetailListItem
 */
@lombok.Data
public final class UpdateAuthKeyBodyAuthDetailListItem  {

    /**
     * <p>自定义鉴权密钥，支持由大小写字母（A - Z、a - z）和数字（0 - 9）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecretKey")
    private String secretKey;

    /**
     * <p>加密字符串生成算法，取值及含义如下所示。</p>
     *
     * <p>- `md5`：标准 MD5 算法。当 `AuthType` 取值为 `TypeA`、`TypeB`、`TypeC` 时，该参数取值必须为 `md5`。</p>
     *
     * <p>- `md5_custom`：自定义 MD5 算法。当 `AuthType` 取值为 `TypeCustom` 时，该参数取值必须为 `md5_custom`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>鉴权参数的名称。仅当 `AuthType` 取值为 `TypeCustom` 时，需配置该参数。</p>
     *
     * <p>该参数取值为 Key-Value 对。默认值为 `{"volcSecret":"volcSecret","volcTime":"volcTime"}`。您可以自定义 `volcSecret` 和 `volcTime` 对应的 value，例如 `{"volcSecret":"sign","volcTime":"expire"}`，表示分别将 `sign` 作为加密字符串的鉴权参数名称、`expire` 作为过期时间的鉴权参数名称，从而实现 URL 鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private Map<String, String> authField;

    /**
     * <p>生成加密字符串所需字段。仅当 `AuthType` 取值为 `TypeCustom` 时，需配置该参数。</p>
     *
     * <p>默认无加密字段，但推荐至少包含 `SecretKey`（鉴权密钥）和 `volcTime`（过期时间）。 例如参数取值为 `["SecretKey","volcTime","Domain"]`，则加密字符串可根据 `md5({SecretKey}{volcTime}{Domain})` 计算得出。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    /**
     * <p>鉴权类型。取值如下：</p>
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
     * <p>- 当 `SceneType` 取值为 `push` 时，取值仅支持 `TypeB` 和 `TypeCustom`。</p>
     *
     * <p>- 更多有关 A、B、C 类型鉴权的信息，详见[配置 URL 鉴权](https://www.volcengine.com/docs/6469/1274178)。</p>
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
