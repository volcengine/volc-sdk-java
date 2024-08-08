package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * RunCommandBody
 */
@lombok.Data
public final class RunCommandBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID 列表，对多个实例批量执行命令操作时，支持的最大实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>待执行的命令，支持的最大长度为 1024 字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Command")
    private String command;

    /**
     * <p>权限类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PermissionType")
    private String permissionType;

    /**
     * <p>异步命令执行的超时时长，单位为 s，默认值为 300，取值范围为 [0,21600]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeoutSeconds")
    private Integer timeoutSeconds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
