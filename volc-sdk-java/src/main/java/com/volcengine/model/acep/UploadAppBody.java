package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UploadAppBody
 */
@lombok.Data
public final class UploadAppBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>自定义应用 ID：</p>
     *
     *
     *
     * <p>- 如不指定，则自动生成</p>
     *
     * <p>	</p>
     *
     * <p>- 如指定，需保证应用 ID 在业务维度唯一</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用名称，如不填写，则默认返回空值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>应用类型：</p>
     *
     *
     *
     * <p>- 0：其他</p>
     *
     * <p>	</p>
     *
     * <p>- 1：视频</p>
     *
     * <p>	</p>
     *
     * <p>- 2：游戏</p>
     *
     * <p>	</p>
     *
     * <p>- 3：效率</p>
     *
     * <p>	</p>
     *
     * <p>- 4：办公</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppType")
    private Integer appType;

    /**
     * <p>应用的横竖屏：</p>
     *
     *
     *
     * <p>- 0：竖屏</p>
     *
     * <p>	</p>
     *
     * <p>- 270：横屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rotation")
    private Integer rotation;

    /**
     * <p>上传方式，目前仅支持设为 0，即 HTTP 下载地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadType")
    private Integer uploadType;

    /**
     * <p>应用下载 URL 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>应用描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppDesc")
    private String appDesc;

    /**
     * <p>应用文件解析类型：</p>
     *
     *
     *
     * <p>- 0，解析；前向兼容，默认解析并且转存到火山引擎对象存储</p>
     *
     * <p>	</p>
     *
     * <p>- 1，不解析，透传地址，不转存到火山引擎对象存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParseFlag")
    private Integer parseFlag;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraInfo")
    private com.volcengine.model.acep.v20231030.RequestAppUploadExtra extraInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
