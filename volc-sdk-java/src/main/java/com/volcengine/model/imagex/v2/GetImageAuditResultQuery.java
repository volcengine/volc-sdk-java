package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuditResultQuery
 */
@lombok.Data
public final class GetImageAuditResultQuery  {

    /**
     * <p>任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1160409) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>审核场景，缺省情况下查询全部场景的任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `UrlFile`：上传 txt 审核文件处理场景</p>
     *
     * <p>- `Url`：上传审核图片 URL 处理场景</p>
     *
     * <p>- `Upload`：图片上传场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>问题类型，取值根据审核类型的不同其取值不同。缺省情况下返回全部类型任务。</p>
     *
     *
     *
     * <p>- 基础安全审核</p>
     *
     * <p>	- `govern`：涉政</p>
     *
     * <p>	- `porn` ：涉黄</p>
     *
     * <p>	- `illegal`：违法违规</p>
     *
     * <p>	- `terror`：涉暴</p>
     *
     * <p>- 智能安全审核</p>
     *
     * <p>	- 图像风险识别</p>
     *
     * <p>		- `porn` ：涉黄，主要适用于通用色情、色情动作、性行为、性暗示、性分泌物、色情动漫、色情裸露等涉黄场景的风险识别</p>
     *
     * <p>		- `sensitive1` ：涉敏1，具体指涉及暴恐风险</p>
     *
     * <p>		- `sensitive2`：涉敏2，具体值涉及政治内容风险</p>
     *
     * <p>		- `forbidden`：违禁，主要适用于打架斗殴、爆炸、劣迹艺人等场景的风险识别</p>
     *
     * <p>		- `uncomfortable`：引人不适，主要适用于恶心、恐怖、尸体、血腥等引人不适场景的风险识别</p>
     *
     * <p>		- `qrcode`：二维码，主要适用于识别常见二维码（QQ、微信、其他二维码等）</p>
     *
     * <p>		- `badpicture`：不良画面，主要适用于自我伤害、丧葬、不当车播、吸烟/纹身/竖中指等不良社会风气的风险识别</p>
     *
     * <p>		- `sexy`：性感低俗，主要适用于舌吻、穿衣性行为、擦边裸露等多种性感低俗场景的风险识别</p>
     *
     * <p>		- `age`：年龄，主要适用于图中人物对应的年龄段识别</p>
     *
     * <p>		- `underage`：未成年相关，主要适用于儿童色情、儿童邪典等风险识别</p>
     *
     * <p>		- `quality`：图片质量，主要适用于图片模糊、纯色边框、纯色屏等风险识别</p>
     *
     * <p>	- 图文风险识别</p>
     *
     * <p>		- `ad`：广告，综合图像及文字内容智能识别广告</p>
     *
     * <p>		- `defraud`：诈骗，综合图像及文字内容智能识别诈骗</p>
     *
     * <p>		- `charillegal`：文字违规，图片上存在涉黄、涉敏、违禁等违规文字</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Problem")
    private String problem;

    /**
     * <p>图片类型，缺省情况下返回全部类型任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `problem`：问题图片</p>
     *
     * <p>- `frozen`：冻结图片</p>
     *
     * <p>- `fail`：审核失败图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private String imageType;

    /**
     * <p>审核建议，缺省情况下返回全部任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `nopass`：建议不通过</p>
     *
     * <p>- `recheck`：建议复审</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditSuggestion")
    private String auditSuggestion;

    /**
     * <p>分页条数。取值范围为 (0,100\]，默认值为 10。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>上一次查询返回的位置标记，作为本次列举的起点信息。默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private Integer marker;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
