package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * LaunchAppBody
 */
@lombok.Data
public final class LaunchAppBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定实例 ID 列表执行应用启动任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>需要启动的应用包名或组件名，例如：</p>
     *
     *
     *
     * <p>- 应用包名：`com.example.appname`</p>
     *
     * <p>	</p>
     *
     * <p>- 组件名（缩写形式）：`com.example.appname/.MainActivity`</p>
     *
     * <p>	</p>
     *
     * <p>- 组件名（完整形式的 Activity）：`com.example.appname/com.example.appname.MainActivity`</p>
     *
     * <p>	</p>
     *
     * <p>- 组件名（完整形式的 Service）：`com.example.appname/com.example.appname.MainService`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
