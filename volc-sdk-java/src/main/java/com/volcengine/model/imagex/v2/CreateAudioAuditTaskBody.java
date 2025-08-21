package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateAudioAuditTaskBody
 */
@lombok.Data
public final class CreateAudioAuditTaskBody  {

    /**
     * <p>任务类型，当前仅支持取值为 `audit`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>审核任务场景。取值如下所示：</p>
     *
     * <p>- `UrlFile`：存量文件处理，针对已有存储内的文件请求获取审核结果。传入方式是 `ResUri` 方式，即在 TXT 文件（审核文件）内填写了待审核文件 URL，并将该 TXT 文件上传至指定服务后获取并传入该文件的 StoreUri。</p>
     *
     * <p>- `Upload`：上传场景，针对上传文件到指定服务下的场景。可通过 `EnableAuditRange` 参数指定审核的范围，例如对指定上传到某目录下的文件进行审核。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

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
     * <p>- 智能安全审核，仅当 `AuditAbility` 取值为 `1` 时，配置生效。</p>
     *
     *
     *
     * <p>	- 图像风险识别</p>
     *
     * <p>		- `audio_porn` ：涉黄，主要适用于通用色情、色情动作、性行为、性暗示、性分泌物、色情动漫、色情裸露等涉黄场景的风险识别</p>
     *
     * <p>		- `audio_sensitive1` ：涉敏1，具体指涉及暴恐风险	</p>
     *
     * <p>		- `audio_sensitive2`：涉敏2，具体值涉及政治内容风险</p>
     *
     * <p>		- `audio_forbidden`：违禁，主要适用于打架斗殴、爆炸、劣迹艺人等场景的风险识别</p>
     *
     * <p>		- `audio_uncomfortable`：引人不适，主要适用于恶心、恐怖、尸体、血腥等引人不适场景的风险识别</p>
     *
     * <p>		- `audio_qrcode`：二维码，主要适用于识别常见二维码（QQ、微信、其他二维码等）</p>
     *
     * <p>		- `audio_badpicture`：不良画面，主要适用于自我伤害、丧葬、不当车播、吸烟/纹身/竖中指等不良社会风气的风险识别	</p>
     *
     * <p>		- `audio_sexy`：性感低俗，主要适用于舌吻、穿衣性行为、擦边裸露等多种性感低俗场景的风险识别</p>
     *
     * <p>		- `audio_age`：年龄，主要适用于图中人物对应的年龄段识别</p>
     *
     * <p>		- `audio_underage`：未成年相关，主要适用于儿童色情、儿童邪典等风险识别</p>
     *
     * <p>		- `audio_quality`：图片质量，主要适用于图片模糊、纯色边框、纯色屏等风险识别</p>
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
     * <p>是否开启审核范围配置，仅当 `Type` 取值为 `Upload` 时生效。默认值为 `0`。支持的取值如下所示。</p>
     *
     * <p>- `0`：不限范围；</p>
     *
     * <p>- `1`：指定前缀匹配（需配合 `AuditPrefix` 或 `NoAuditPrefix` 使用）；</p>
     *
     * <p>- `2`：指定通配符匹配（需配合 `AuditPrefix` 或 `NoAuditPrefix` 使用）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableAuditRange")
    private Integer enableAuditRange;

    /**
     * <p>指定需要审核的文件前缀列表，仅当 `EnableAuditRange` 取值为 `1` 时生效。若需要对某个目录进行审核，请设置路径为对应的目录名并以 `/` 结尾，例如 `123/test/`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditPrefix")
    private List<String> auditPrefix;

    /**
     * <p>指定不进行审核的文件前缀列表，仅当 `EnableAuditRange` 取值为 `1` 时生效。若需要对某个目录不进行审核，请设置路径为对应的目录名并以 `/` 结尾，例如 `123/test/`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NoAuditPrefix")
    private List<String> noAuditPrefix;

    /**
     * <p>是否开启冻结功能，默认值为 `false`。支持的取值如下所示。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `false`：不开启。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>开启冻结功能后，需配合 `FreezeType`、`FreezeDimensions` 和 `FreezeStrategy` 使用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableFreeze")
    private Boolean enableFreeze;

    /**
     * <p>冻结措施，仅当 `EnableFreeze` 为 `true` 时生效。支持的取值如下所示。</p>
     *
     * <p>- `recheck`：建议复审；</p>
     *
     * <p>- `nopass`：审核不通过。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeType")
    private List<String> freezeType;

    /**
     * <p>冻结维度，取值需要与 `AuditDimensions` 审核维度保持一致或少于 `AuditDimensions`。例如，若 `AuditDimensions` 取值为 `["porn","sexy"]`，`AuditTextDimensions` 取值为 `["ad"]`，则支持以下任意一种组合：</p>
     *
     * <p>- `["porn","sexy","ad"]`</p>
     *
     * <p>- `["porn","sexy"]`</p>
     *
     * <p>- `["porn","ad"]`</p>
     *
     * <p>- `["sexy","ad"]`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeDimensions")
    private List<String> freezeDimensions;

    /**
     * <p>冻结策略，当前仅支持取值为 `0`，表示禁用音频。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeStrategy")
    private Integer freezeStrategy;

    /**
     * <p>审核文件的 StoreUri，仅当 `Type` 为 `UrlFile` 时生效。该文件为 .txt 格式，需上传至指定服务对应存储中，文件内容为待审核文件的 URL 列表，每行一个 URL，最多支持 10000 行。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>是否开启审核结果回调功能，默认值为 `false`。支持的取值如下所示。</p>
     *
     * <p>- `true`：开启回调；</p>
     *
     * <p>- `false`：不开启回调。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>开启回调功能后，需配合 `CallbackUrl`、`CallbackDimensions` 和 `CallbackImageTypes` 使用。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>回调类型，取值需要与 `AuditDimensions` 审核维度保持一致或少于 `AuditDimensions`。例如，若 `AuditDimensions` 取值为 `["porn","sexy"]`，`AuditTextDimensions` 取值为 `["ad"]`，则支持以下任意一种组合：</p>
     *
     * <p>- `["porn","sexy","ad"]`</p>
     *
     * <p>- `["porn","sexy"]`</p>
     *
     * <p>- `["porn","ad"]`</p>
     *
     * <p>- `["sexy","ad"]`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDimensions")
    private List<String> callbackDimensions;

    /**
     * <p>指定需要回调的图片类型，需配合 `EnableCallback` 使用。支持的取值如下所示。</p>
     *
     * <p>- `normal`：正常图片；</p>
     *
     * <p>- `problem`：问题图片；</p>
     *
     * <p>- `frozen`：冻结图片；</p>
     *
     * <p>- `fail`：审核失败图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackImageTypes")
    private List<String> callbackImageTypes;

    /**
     * <p>接收审核结果回调的 URL，veImageX 将以 POST 方式向该地址发送 JSON 格式的回调数据。需配合 `EnableCallback` 参数开启回调功能使用。回调数据格式请参考[回调内容文档](https://www.volcengine.com/docs/508/134676#%E5%9B%9E%E8%B0%83%E5%86%85%E5%AE%B9)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>指定审核任务所属的地区。当前仅支持国内地区，取值为 `cn`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>指定通配符匹配的审核范围，支持使用 `*` 进行多字符匹配和 `?` 进行单字符匹配。不同通配符需用逗号隔开。例如 `/a/*b/c` 匹配 `/a/testb/c`，`/a/b/c/test12?/*` 匹配 `/a/b/c/test123/file.mp4`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Auditwildcard")
    private List<String> auditwildcard;

    /**
     * <p>指定通配符匹配的不审核范围，支持使用 `*` 进行多字符匹配和 `?` 进行单字符匹配。不同通配符需用逗号隔开。例如 `/a/*b/c` 匹配 `/a/testb/c`，`/a/b/c/test12?/*` 匹配 `/a/b/c/test123/file.mp4`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NoAuditwildcard")
    private List<String> noAuditwildcard;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
