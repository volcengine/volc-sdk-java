package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthResponseAuthServerStatusCode
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthResponseAuthServerStatusCode  {

    /**
     * <p>指定鉴权失败时的鉴权状态码。默认值是 401。</p>
     *
     * <p>- 您可以指定范围在 400-499 中的一个或者多个状态码。多个状态码使用英文分号（;）分隔。</p>
     *
     * <p>- 您也可以指定 4xx 表示 400-499 中的任意一个状态码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fail_code")
    private String failCode;

    /**
     * <p>指定鉴权成功时的鉴权状态码。默认值是 200。</p>
     *
     * <p>- 您可以指定范围在 200-299 中的一个或者多个状态码。多个状态码使用英文分号（;）分隔。</p>
     *
     * <p>- 您也可以指定 2xx 表示 200-299 中的任意一个状态码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "success_code")
    private String successCode;

    /**
     * <p>如果鉴权状态码既不是 FailCode，又不是 SuccessCode 时，veImageX 处理鉴权请求的方式。取值如下所示： </p>
     *
     * <p>- `reject`：veImageX 认为鉴权失败。 </p>
     *
     * <p>- `pass`：veImageX 认为鉴权成功。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "default_action")
    private String defaultAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
