package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * StartRecordingBody
 */
@lombok.Data
public final class StartRecordingBody  {

    /**
     * <p>实例所属业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>设置最大录屏时长，单位：秒。</p>
     *
     * <p>支持设置的最大值为 14400，即 4 小时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationLimit")
    private Integer durationLimit;

    /**
     * <p>录屏请求的唯一标识。</p>
     *
     * <p>为避免由于网络等原因造成重复请求，同一 `RoundId` 在 5 分钟内只可使用一次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoundId")
    private String roundId;

    /**
     * <p>是否保存录屏文件在云手机实例：</p>
     *
     *
     *
     * <p>- true：上传录屏文件到火山引擎对象存储，并保存录屏文件在云手机实例中；</p>
     *
     * <p>	</p>
     *
     * <p>- false：默认值，上传录屏文件到火山引擎对象存储，上传完成后，删除保存在云手机实例中的文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSavedOnPod")
    private Boolean isSavedOnPod;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
