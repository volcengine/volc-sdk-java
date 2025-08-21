package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * BatchImageAuditBodyInputsItem
 */
@lombok.Data
public final class BatchImageAuditBodyInputsItem  {

    /**
     * <p>是否开启大图审核功能。默认值为 `false`。支持的取值如下所示。</p>
     *
     * <p>- `true`：开启大图审核，系统会对 5MB~32MB 的图片进行压缩后再审核；</p>
     *
     * <p>- `false`：不开启大图审核。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 未开启时若图片大小 ≥ 5 MB，可能导致系统超时报错；</p>
     *
     * <p>- 已开启时若图片大小 ≥ 32 MB，可能导致系统超时报错；</p>
     *
     * <p>- 开启后将对压缩能力按照[基础图片处理](https://www.volcengine.com/docs/508/65935#%E5%9F%BA%E7%A1%80%E5%9B%BE%E5%83%8F%E5%A4%84%E7%90%86%E6%9C%8D%E5%8A%A1)进行计费（每月有 20TB 免费额度）。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableLargeImageDetect")
    private Boolean enableLargeImageDetect;

    /**
     * <p>待审核图片的访问地址，支持以下两种形式：</p>
     *
     * <p>- 公网可访问的 URL 地址；</p>
     *
     * <p>- 火山引擎对象存储（TOS）的唯一 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>自定义标识，用于区分待审核图片 `ImageUri` 的唯一标识，建议根据实际业务需求设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
