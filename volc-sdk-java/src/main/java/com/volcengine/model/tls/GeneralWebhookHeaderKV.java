package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.KEY;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
public class GeneralWebhookHeaderKV {

    /** 头部键. */
    @JSONField(name = KEY)
    private String key;

    /** 头部值. */
    @JSONField(name = VALUE)
    private String value;

    /**
     * 使用键值对构造 Webhook 头部.
     *
     * @param keyValue   头部键
     * @param valueValue 头部值
     */
    public GeneralWebhookHeaderKV(
            final String keyValue,
            final String valueValue) {
        this.key = keyValue;
        this.value = valueValue;
    }
}
