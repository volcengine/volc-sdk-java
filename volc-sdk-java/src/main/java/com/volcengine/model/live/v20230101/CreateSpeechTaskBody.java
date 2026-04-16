package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBody
 */
@lombok.Data
public final class CreateSpeechTaskBody  {

    /**
     * <p>任务名称。该名称在所有运行中的任务中必须唯一。长度为 1-64 个字节。可包含以下字符：</p>
     *
     * <p>- 数字（0-9）</p>
     *
     * <p>- 大写字母（A-Z）</p>
     *
     * <p>- 小写字母（a-z）</p>
     *
     * <p>- 中文</p>
     *
     * <p>- 下划线（_）</p>
     *
     * <p>- 中划线（-）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private CreateSpeechTaskBodyRule rule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
