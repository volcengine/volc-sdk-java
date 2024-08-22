package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListImageResourceQuery
 */
@lombok.Data
public final class ListImageResourceQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定需要查询的镜像 ID 列表。多个镜像 ID 使用英文 "," 分隔。</p>
     *
     * <p>该参数置空时，系统将默认返回业务下所有镜像 ID 的分布情况。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageIdList")
    private String imageIdList;

    /**
     * <p>分页偏移量，默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
