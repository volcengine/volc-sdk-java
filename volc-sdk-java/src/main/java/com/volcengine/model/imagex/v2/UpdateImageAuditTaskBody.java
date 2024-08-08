package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageAuditTaskBody
 */
@lombok.Data
public final class UpdateImageAuditTaskBody  {

    /**
     * <p>指定待更新审核任务所在的服务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1158717) 获取待更新任务对应的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

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
     * <p>		- `sensitive1` ：涉敏1，具体指涉及暴恐风险	</p>
     *
     * <p>		- `sensitive2`：涉敏2，具体值涉及政治内容风险</p>
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
     * <p>	- 图文风险识别，您可在 `AuditTextDimensions` 配置文字审核的维度。</p>
     *
     *
     *
     * <p>	:::tip</p>
     *
     * <p>	您可将智能安全审核的图像风险识别和图文风险识别搭配使用。</p>
     *
     * <p>	:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDimensions")
    private List<String> auditDimensions;

    /**
     * <p>仅当 `Type` 取值 `Upload` 时，配置生效。</p>
     *
     * <p>审核范围，取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：（默认）不限范围</p>
     *
     * <p>- `1`：指定范围</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableAuditRange")
    private Integer enableAuditRange;

    /**
     * <p>仅当 `EnableAuditRange` 取值 `1` 时，配置生效。</p>
     *
     * <p>指定前缀审核，若你希望对某个目录进行审核，请设置路径为对应的目录名，以`/`结尾。例如`123/`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditPrefix")
    private List<String> auditPrefix;

    /**
     * <p>仅当 `EnableAuditRange` 取值 `1` 时，配置生效。</p>
     *
     * <p>指定前缀不审核，若你希望对某个目录不进行审核，请设置路径为对应的目录名，以`/`结尾。例如`123/`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NoAuditPrefix")
    private List<String> noAuditPrefix;

    /**
     * <p>是否开启冻结，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：（默认）不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableFreeze")
    private Boolean enableFreeze;

    /**
     * <p>冻结措施，取值如下所示：</p>
     *
     * <p>- `recheck`：建议复审</p>
     *
     * <p>- `nopass`：审核不通过</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeType")
    private List<String> freezeType;

    /**
     * <p>冻结维度，取值需要与 `AuditDimensions` 审核维度保持一致或少于 `AuditDimensions`。</p>
     *
     *
     *
     * <p>例如，`AuditDimensions` 取值 ["pron","sexy"]，`AuditTextDimensions` 取值 ["ad"]，支持您将 `FreezeDimensions` 取值 ["pron","sexy","ad"] 、 ["pron","sexy"]、["pron","ad"] 和 ["sexy","ad"] 任意一种。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeDimensions")
    private List<String> freezeDimensions;

    /**
     * <p>冻结策略，当前仅支持取 `0`，表示禁用图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeStrategy")
    private Integer freezeStrategy;

    /**
     * <p>仅当 `Type` 为 `UrlFile` 时，配置生效。</p>
     *
     *
     *
     * <p>审核文件的 StoreUri，为 .txt 文件，该文件需上传至指定服务对应存储中。该 txt 文件内需填写待审核图片文件的 URL，每行填写一个，最多可填写 10000 行。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>是否开启回调，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：（默认）不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>回调类型，取值需要与 `AuditDimensions` 审核维度保持一致或少于 `AuditDimensions`。</p>
     *
     *
     *
     * <p>例如，`AuditDimensions` 取值 ["pron","sexy"]，`AuditTextDimensions` 取值 ["ad"]，支持您将 `FreezeDimensions` 取值 ["pron","sexy","ad"] 、 ["pron","sexy"]、["pron","ad"] 和 ["sexy","ad"] 任意一种。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDimensions")
    private List<String> callbackDimensions;

    /**
     * <p>回调图片类型，取值如下所示：</p>
     *
     * <p>- `normal`：正常图片</p>
     *
     * <p>	</p>
     *
     * <p>- `problem`：问题图片</p>
     *
     * <p>	</p>
     *
     * <p>- `frozen`：冻结图片</p>
     *
     * <p>	</p>
     *
     * <p>- `fail`：审核失败图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackImageTypes")
    private List<String> callbackImageTypes;

    /**
     * <p>回调 URL，veImageX 以 Post 方式向业务服务器发送 JSON 格式回调数据。具体回调参数请参考[回调内容](https://www.volcengine.com/docs/508/134676#%E5%9B%9E%E8%B0%83%E5%86%85%E5%AE%B9)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>任务地区。当前仅支持取值 `cn`，表示国内。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1158717) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>图片审核仅支持审核 5MB 以下的图片，若您的图片大小在 5MB~32MB，您可以开启大图审核功能，veImageX 会对图片压缩后再进行审核。开启后，将对压缩能力按照[基础图片处理](https://www.volcengine.com/docs/508/65935#%E5%9F%BA%E7%A1%80%E5%9B%BE%E5%83%8F%E5%A4%84%E7%90%86%E6%9C%8D%E5%8A%A1)进行计费。（您每月可使用 20TB 的免费额度）</p>
     *
     * <p>取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：（默认）不开启</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 若未开启大图审核且图片大小 ≥ 5 MB，可能会导致系统超时报错；</p>
     *
     * <p>- 若已开启大图审核但图片大小 ≥ 32 MB，可能会导致系统超时报错。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableLargeImageDetect")
    private Boolean enableLargeImageDetect;

    /**
     * <p>智能安全审核类型下图片文本审核的具体维度，取值如下所示：</p>
     *
     * <p>- `ad`：广告，综合图像及文字内容智能识别广告</p>
     *
     * <p>- `defraud`：诈骗，综合图像及文字内容智能识别诈骗</p>
     *
     * <p>- `charillegal`：文字违规，图片上存在涉黄、涉敏、违禁等违规文字</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>仅当 `AuditDimensions` 取值为智能安全审核模型时，您可将 `AuditTextDimensions` 与 `AuditDimensions` 搭配使用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTextDimensions")
    private List<String> auditTextDimensions;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
