package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultImageResource
 */
@lombok.Data
public final class ResultImageResource  {

    /**
     * <p>当前镜像被实例化的数量，包括所有已启动（开机）和未启动（未开机）的实例。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodNum")
    private Long podNum;

    /**
     * <p>镜像 ID。没有 ID 时显示镜像地址。</p>
     *
     * <p>若某镜像未被实例化，即对应的 PodNum 为 0，且非已预热镜像，则不予展示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
