package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetUrlFetchTaskResResult
 */
@lombok.Data
public final class GetUrlFetchTaskResResult  {

    /**
     * <p>异步任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     *
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Failed`：失败</p>
     *
     * <p>- `Success`：成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>资源下载链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>资源上传后的资源 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>任务开始时间戳，UTC 时间，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>完成任务总耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeCost")
    private Long timeCost;

    /**
     * <p>资源大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FSize")
    private Long fSize;

    /**
     * <p>动图帧数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameCnt")
    private Integer frameCnt;

    /**
     * <p>动图持续时间，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>图片类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageFormat")
    private String imageFormat;

    /**
     * <p>图片高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageHeight")
    private Integer imageHeight;

    /**
     * <p>图片宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageWidth")
    private Integer imageWidth;

    /**
     * <p>任务完成时间戳，UTC 时间，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>传入的回调地址，仅当`Status`取值`Failed`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>传入的回调内容，仅当`Status`取值`Failed`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBody")
    private String callbackBody;

    /**
     * <p>传入的回调内容类型，仅当`Status`取值`Failed`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBodyType")
    private String callbackBodyType;

    /**
     * <p>错误信息，仅当`Status`取值`Failed`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Err")
    private String err;

    /**
     * <p>错误码，仅当`Status`取值`Failed`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private Integer code;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
