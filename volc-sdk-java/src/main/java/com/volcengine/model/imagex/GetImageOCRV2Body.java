package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageOCRV2Body
 */
@lombok.Data
public final class GetImageOCRV2Body  {

    /**
     * <p>待识别的图片 URL，满足公网可访问。仅当 `StoreUri` 为空时取值有效，两者都为空时报错。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>待识别图片文件的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>图片OCR识别场景，取值如下所示：</p>
     *
     * <p>- `general`：通用场景，用于通用印刷体场景识别文本信息。</p>
     *
     * <p>- `license`：营业执照场景，用于识别营业执照中社会信用代码等文本信息。</p>
     *
     * <p>- `instrument`：设备识别场景，用于一些设备显示文字识别。</p>
     *
     * <p>- `defect`：缺陷检测场景</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>当前仅支持识别图片中**简体中文**和**简体英文**这两种文本信息。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Scene")
    private String scene;

    /**
     * <p>待识别的设备名称，仅当 `Scene` 为 `Instrument` 时，配置有效。取值如下所示：</p>
     *
     * <p>- `freezing-point-tester`：冰点仪</p>
     *
     * <p>- `brake-fluid-tester`：制动液测试仪</p>
     *
     * <p>- `thermometer`： 温度计</p>
     *
     * <p>- `oil-tester`：机油仪</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstrumentName")
    private String instrumentName;

    /**
     * <p>定制化保留字段，如果是正常调用忽略该字段，若为定制化需求则需要和算法开发者对齐调用方式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private GetImageOCRV2BodyExtra extra;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
