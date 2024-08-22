package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetImagePreheatingQuery
 */
@lombok.Data
public final class GetImagePreheatingQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定需要查询的镜像 ID 列表。多个镜像 ID 使用英文 "," 分隔。列表最大长度为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageIdList")
    private String imageIdList;

    /**
     * <p>机房 ID。用于指定希望查询的镜像所在的特定机房。若该参数置空，系统将默认返回所有机房中的指定镜像的预热数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcId")
    private String dcId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
