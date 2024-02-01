package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadErrorCodeAllResResultErrorCodeDataItem
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeAllResResultErrorCodeDataItem  {

    /**
     * <p>当`GroupBy`取值`ErrorCode`时出现，表示错误码内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private String errorCode;

    /**
     * <p>当`GroupBy`取值`ErrorCode`时出现，表示错误码的描述信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeDesc")
    private String errorCodeDesc;

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>当`GroupBy`取值`Region`时出现，表示地区类型。</p>
     *
     * <p>* `Country`：国家；</p>
     *
     * <p>* `Province`：省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionType")
    private String regionType;

    /**
     * <p>当`GroupBy`取值`Isp`时出现，则表示运营商信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    /**
     * <p>错误码数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>当`GroupBy`取值**非**`ErrorCode`时出现，表示错误码详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Details")
    private List<DescribeImageXUploadErrorCodeAllResResultErrorCodeDataItemDetailsItem> details;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
