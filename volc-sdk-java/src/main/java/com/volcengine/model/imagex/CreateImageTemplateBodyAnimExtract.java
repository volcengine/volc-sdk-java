package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateBodyAnimExtract
 */
@lombok.Data
public final class CreateImageTemplateBodyAnimExtract  {

    /**
     * <p>动图截帧策略，取值如下所示：</p>
     *
     * <p>- `0`：智能模式，从动图首帧开始逐帧检测当前帧亮度是否大于 80，并最终返回第一个亮度大于 80 的帧。</p>
     *
     * <p>- `1`：全局最优，从动图首帧开始逐帧检测并返回亮度最大的一帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Strategy")
    private Integer strategy;

    /**
     * <p>动图异步处理超时时间，单位为 ms。默认为 1500，取值负数时表示无超时时间。若在指定时间范围内处理未完成则返回失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timeout")
    private Integer timeout;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
