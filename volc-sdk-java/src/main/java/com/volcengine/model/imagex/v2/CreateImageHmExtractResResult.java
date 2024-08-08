package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmExtractResResult
 */
@lombok.Data
public final class CreateImageHmExtractResResult  {

    /**
     * <p>响应码，具体取值如下所示：</p>
     *
     * <p>* `-1`：盲水印为空；</p>
     *
     * <p>* `0`：`info`不为空时表示盲水印提取成功。</p>
     *
     * <p>:::tip</p>
     *
     * <p>提取失败时显示接口错误。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    /**
     * <p>提取出的盲水印文本信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private String info;

    /**
     * <p>仅当 `Algorithm` 取值为 `tracev2` 时，有返回值。</p>
     *
     *
     *
     * <p>编码附加信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdditionInfo")
    private CreateImageHmExtractResResultAdditionInfo additionInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
