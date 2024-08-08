package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResponseResponseError
 */
@lombok.Data
public final class ResponseResponseError  {

    /**
     * <p>状态消息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>错误码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CodeN")
    private Integer codeN;

    /**
     * <p>具体的错误描述信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>返回对应的中文错误信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessText")
    private String businessText;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
