package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CloseAppBody
 */
@lombok.Data
public final class CloseAppBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定实例 ID 列表执行应用关闭任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>需要关闭的应用包名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
