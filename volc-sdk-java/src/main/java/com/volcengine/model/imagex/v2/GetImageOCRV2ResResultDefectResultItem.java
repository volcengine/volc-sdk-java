package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageOCRV2ResResultDefectResultItem
 */
@lombok.Data
public final class GetImageOCRV2ResResultDefectResultItem  {

    /**
     * <p>识别出的缺陷类别编号，当前仅在取值为 0 时，表示漏油。</p>
     *
     * <p>:::tip</p>
     *
     * <p>其他缺陷类别编号识别还在训练增加中。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassLabel")
    private Integer classLabel;

    /**
     * <p>识别出的文本块的坐标位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Location")
    private List<Integer> location;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
