package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * LaunchAppsBody
 */
@lombok.Data
public final class LaunchAppsBody  {

    /**
     * <p>实例所归属的业务 ID。可通过调用 [ListPod](https://www.volcengine.com/docs/6394/75749) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID。可通过调用 [ListPod](https://www.volcengine.com/docs/6394/75749) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>包名列表，最大长度 20。可通过调用 [GetPodAppList](https://www.volcengine.com/docs/6394/658689) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageNameList")
    private List<String> packageNameList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
