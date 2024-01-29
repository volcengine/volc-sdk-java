package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * FetchImageUrlResResult
 */
@lombok.Data
public final class FetchImageUrlResResult  {

    /**
     * <p>源文件 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>迁移后的文件 URI，包含 bucket/key 两部分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>文件大小，单位为 byte。同步处理情况下有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FSize")
    private Long fSize;

    /**
     * <p>图片宽，在同步处理情况下、迁移至图像处理服务且为图片资源时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageWidth")
    private Integer imageWidth;

    /**
     * <p>图片高，在同步处理情况下、迁移至图像处理服务且为图片资源时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageHeight")
    private Integer imageHeight;

    /**
     * <p>图片类型，在同步处理情况下、迁移至图像处理服务且为图片资源时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageFormat")
    private String imageFormat;

    /**
     * <p>动图持续时间，在同步处理情况下、迁移至图像处理服务且为图片资源时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Long duration;

    /**
     * <p>图片帧数，在同步处理情况下、迁移至图像处理服务且为图片资源时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameCnt")
    private Integer frameCnt;

    /**
     * <p>完成任务总耗时，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeCost")
    private Long timeCost;

    /**
     * <p>任务结束执行时间戳，UTC 时间，单位为 ns。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>任务开始执行时间戳，UTC 时间，单位为 ns。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>异步任务 ID，仅当`Async`取值`true`，即采用异步时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
