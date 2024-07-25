package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * PodMuteBody
 */
@lombok.Data
public final class PodMuteBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>暂停/恢复推流。</p>
     *
     * <p>- true：暂停推流。</p>
     *
     * <p>- false：恢复推流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mute")
    private Boolean mute;

    /**
     * <p>屏幕 ID 列表。若将该参数置空则对表示所有屏幕进行暂停或恢复推流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayList")
    private List<String> displayList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
