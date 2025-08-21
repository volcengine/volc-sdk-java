package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * SingleImageAuditBody
 */
@lombok.Data
public final class SingleImageAuditBody  {

    /**
     * <p>审核能力类型，用于指定审核任务所使用的审核模型。支持的取值如下所示。</p>
     *
     * <p>- `0`：基础审核能力；</p>
     *
     * <p>- `1`：智能审核能力。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditAbility")
    private Integer auditAbility;

    /**
     * <p>审核维度，根据审核能力的不同，其具体取值不同。基础审核与智能审核之间不支持混用。</p>
     *
     *
     *
     * <p>- 基础安全审核，仅当 `AuditAbility` 取值为 `0` 时，配置生效。</p>
     *
     *
     *
     * <p>	- `govern`：涉政</p>
     *
     * <p>	- `porn` ：涉黄	</p>
     *
     * <p>	- `illegal`：违法违规	</p>
     *
     * <p>	- `terror`：涉暴</p>
     *
     *
     *
     * <p>- 智能安全审核，仅当 `AuditAbility` 取值为 `1` 时，配置生效。</p>
     *
     *
     *
     * <p>	- 图像风险识别</p>
     *
     * <p>		- `porn` ：涉黄，主要适用于通用色情、色情动作、性行为、性暗示、性分泌物、色情动漫、色情裸露等涉黄场景的风险识别</p>
     *
     * <p>		- `sensitive1`：涉敏 1，具体指涉及暴恐风险	</p>
     *
     * <p>		- `sensitive2`：涉敏 2，具体值涉及政治内容风险</p>
     *
     * <p>		- `forbidden`：违禁，主要适用于打架斗殴、爆炸、劣迹艺人等场景的风险识别</p>
     *
     * <p>		- `uncomfortable`：引人不适，主要适用于恶心、恐怖、尸体、血腥等引人不适场景的风险识别</p>
     *
     * <p>		- `qrcode`：二维码，主要适用于识别常见二维码（QQ、微信、其他二维码等）</p>
     *
     * <p>		- `badpicture`：不良画面，主要适用于自我伤害、丧葬、不当车播、吸烟/纹身/竖中指等不良社会风气的风险识别	</p>
     *
     * <p>		- `sexy`：性感低俗，主要适用于舌吻、穿衣性行为、擦边裸露等多种性感低俗场景的风险识别</p>
     *
     * <p>		- `age`：年龄，主要适用于图中人物对应的年龄段识别</p>
     *
     * <p>		- `underage`：未成年相关，主要适用于儿童色情、儿童邪典等风险识别</p>
     *
     * <p>		- `quality`：图片质量，主要适用于图片模糊、纯色边框、纯色屏等风险识别</p>
     *
     * <p>	- 图文风险识别，您可在 [`AuditTextDimensions`](#audittextdimensions) 配置文字审核的维度。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>您可将智能安全审核的图像风险识别和图文风险识别搭配使用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDimensions")
    private List<String> auditDimensions;

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
     * <p>图片的公网可访问 URL，用于指定需要审核的图片资源地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>建议您根据实际业务情况，将该参数作为可区分审核图片 `ImageUri` 的自定义标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    /**
     * <p>智能安全审核类型下图文风险审核的具体维度，仅当 `AuditAbility` 取值为 `1` 时生效。支持的取值如下所示。</p>
     *
     * <p>- `ad`：广告，综合图像及文字内容智能识别广告；</p>
     *
     * <p>- `defraud`：诈骗，综合图像及文字内容智能识别诈骗；</p>
     *
     * <p>- `charillegal`：文字违规，存在涉黄、涉敏、违禁等违规文字。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>您可将 `AuditTextDimensions` 与 `AuditDimensions` 搭配使用，实现图像和图文内容的综合审核。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTextDimensions")
    private List<String> auditTextDimensions;

    /**
     * <p>是否异步进行审核，默认值为 `0`。支持的取值如下所示。</p>
     *
     * <p>- `0`：同步返回结果；</p>
     *
     * <p>- `1`：异步进行审核。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Async")
    private Integer async;

    /**
     * <p>审核结果（Detail 版本）以回调形式发送至您的回调地址，仅当 `Async` 取值为 `1` 时生效。支持以 `http://` 或者 `https://` 开头的地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
