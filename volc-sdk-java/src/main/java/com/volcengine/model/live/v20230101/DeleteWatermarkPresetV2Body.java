package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteWatermarkPresetV2Body
 */
@lombok.Data
public final class DeleteWatermarkPresetV2Body  {

    /**
     * <p>水印模板的名称，您可以调用 [ListWatermarkPresetDetail](https://www.volcengine.com/docs/6469/1323353) 接口获取。</p>
     *
     * <p>:::tip</p>
     *
     * <p>PresetName 和 ID 二选一必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>水印模板的 ID，您可以调用 [ListWatermarkPresetDetail](https://www.volcengine.com/docs/6469/1323353) 接口获取。</p>
     *
     * <p>:::tip</p>
     *
     * <p>PresetName 和 ID 二选一必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
