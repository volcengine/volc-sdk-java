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
     * <p>- `md5`：标准 MD5 算法；</p>
     *
     * <p>- `md5_custom`：自定义 MD5 算法。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>鉴权参数字段名称，当前开启域名 URL 地址鉴权时，会通过对地址中的加密字符串和过期时间校验实现 URL 鉴权。默认加密字符串信息的 key 值为 `volcSecret`，过期时间信息的 key 值为 `volcTime`。</p>
     *
     *
     *
     * <p>默认情况下表示`{"volcSecret":"volcSecret","volcTime":"volcTime"}`，您可以自定义参数名，例如，</p>
     *
     * <p>`{"volcSecret":"sign","volcTime":"expire"}</p>
     *
     * <p>`。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private Map<String, String> authField;

    /**
     * <p>生成加密字符串所需字段。对称加密算法	`EncryptionAlgorithm`，加密字段存在差异。</p>
     *
     * <p>- 当加密算法使用 `md5` 时：默认加密字段为 `["AppName","StreamName","key","expireTime"]`，且不支持修改； </p>
     *
     * <p>-	当加密算法使用 `md5_custom` 时：默认无加密字段，但推荐至少包含 `key`	和 `volcTime`。同时您还可以自定义	`Domain`、`AppName`、`StreamName` 等字段。	例如，选择	key、volcTime	和	Domain	作为加密字段，则取值为	`["key","volcTime","Domain"]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
