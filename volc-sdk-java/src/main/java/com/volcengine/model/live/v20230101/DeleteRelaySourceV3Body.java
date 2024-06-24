package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRelaySourceV3Body
 */
@lombok.Data
public final class DeleteRelaySourceV3Body  {

    /**
     * <p>直播流使用的域名所属的域名空间，您可以调用 [DescribeRelaySourceV3](https://www.volcengine.com/docs/6469/1126874) 接口获取待删除配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用 [DescribeRelaySourceV3](https://www.volcengine.com/docs/6469/1126874) 接口获取待删除配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
