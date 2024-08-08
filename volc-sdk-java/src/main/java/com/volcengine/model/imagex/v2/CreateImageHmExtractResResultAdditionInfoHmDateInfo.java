package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmExtractResResultAdditionInfoHmDateInfo
 */
@lombok.Data
public final class CreateImageHmExtractResResultAdditionInfoHmDateInfo  {

    /**
     * <p>使用 `tracev2` 模型生成背景水印图层的生成周期的开始时间，Unix 时间戳，精度为秒。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>例如：您于 6 月 5 日上午 9 时许调用 CreateHiddenWatermarkImage 接口生成 `tracev2` 模型的水印图层，在 6 月 10 日提取该模型网页截图的水印时，API 将会返回自生成时刻起至当前提取时刻所处的一个时间区间（无法精准至时分秒），该时间区间长度固定为 7 天。返回值如下所示：</p>
     *
     *
     *
     * <p>- `HmCode` 为 `0`，表示处于生成的第一周内</p>
     *
     * <p>- `StartDate` 为 `1717516800`，表示 2024 年 6 月 5 日 00:00:00</p>
     *
     * <p>- `EndDate` 为 `1718121600`，表示 2024 年 6 月 12 日 00:00:00</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartDate")
    private Integer startDate;

    /**
     * <p>使用 `tracev2` 模型生成背景水印图层的生成周期的结束时间，Unix 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndDate")
    private Integer endDate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
