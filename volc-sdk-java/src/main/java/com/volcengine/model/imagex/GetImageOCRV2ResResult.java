package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetImageOCRV2ResResult
 */
@lombok.Data
public final class GetImageOCRV2ResResult  {

    /**
     * <p>指定的识别场景。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Scene")
    private String scene;

    /**
     * <p>营业执照场景识别结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LicenseResult")
    private Map<String, GetImageOCRV2ResResultLicenseResult> licenseResult;

    /**
     * <p>通用场景识别结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GeneralResult")
    private List<GetImageOCRV2ResResultGeneralResultItem> generalResult;

    /**
     * <p>设备识别场景识别的文本信息。根据您识别设备的不同取值含义分别为：</p>
     *
     *
     *
     * <p>- 当设备为冰点仪时，表示液体冰点温度值，例如`44.89`。</p>
     *
     * <p>	</p>
     *
     * <p>- 当设备为制动液测试仪时，表示制动液含水量程度。例如`Middle`表示中等。</p>
     *
     * <p>	</p>
     *
     * <p>- 当设备为温度计时，表示测量的温度值。例如`37.8`。</p>
     *
     * <p>	</p>
     *
     * <p>- 当设备为机油仪时，表示机油的剩余使用寿命的估计值，例如`93.8`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstructmentResult")
    private String instructmentResult;

    /**
     * <p>缺陷检测场景识别结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DefectResult")
    private List<GetImageOCRV2ResResultDefectResultItem> defectResult;

    /**
     * <p>定制化保留字段，默认为空 如果输入参数内Extra.Enable设置为True，该字段返回的结果依赖于算子结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private GetImageOCRV2ResResultExtra extra;

    /**
     * <p>定制化保留字段，默认为空 如果输入参数内Extra.Enable设置为True，该字段返回的结果依赖于算子结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraOutput")
    private GetImageOCRV2ResResultExtraOutput extraOutput;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
