package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * PodDataDeleteBody
 */
@lombok.Data
public final class PodDataDeleteBody  {

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
     * <p>待清理数据的路径列表；仅支持清理 `/sdcard` 和 `/data` 目录下的数据，避免误删除。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FilePathList")
    private List<String> filePathList;

    /**
     * <p>按应用包名，清理已安装第三方应用的数据（系统应用不支持）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageList")
    private List<String> packageList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
