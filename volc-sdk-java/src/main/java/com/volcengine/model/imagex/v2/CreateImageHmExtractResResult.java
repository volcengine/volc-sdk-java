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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
