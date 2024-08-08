package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * PodDataTransferBody
 */
@lombok.Data
public final class PodDataTransferBody  {

    /**
     * <p>实例所归属的业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>源实例 ID，可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginPodId")
    private String originPodId;

    /**
     * <p>目的实例 ID 列表，将源实例的数据迁移到多个其他实例上。支持的最大目的实例数量为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstPodIdList")
    private List<String> dstPodIdList;

    /**
     * <p>实例数据迁移操作方式，目前仅支持 `0` 源实例属性覆盖目的实例属性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
