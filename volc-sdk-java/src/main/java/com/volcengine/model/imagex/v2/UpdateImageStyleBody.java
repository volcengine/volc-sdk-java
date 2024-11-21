package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageStyleBody
 */
@lombok.Data
public final class UpdateImageStyleBody  {

    /**
     * <p>是否执行对上传图像的样式渲染和渲染结果图上传操作，默认为``。取值如下所示：</p>
     *
     * <p>* true：将所有已上传至该样式的图像以更新后的样式数据进行重新处理，并将结果图上传至该样式所绑定服务的存储中。其更新后的结果图 Uri 请在[获取样式详情](https://www.volcengine.com/docs/508/127401)中获取。</p>
     *
     * <p>* false：（默认）不执行上述操作。</p>
     *
     * <p>:::tip</p>
     *
     * <p>建议您仅在手动保存样式或关闭当前页面时指定`DoUpload`为`TRUE`，可节省后端渲染成本。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DoUpload")
    private Boolean doUpload;

    /**
     * <p>更新的样式结构，包含图片编辑、文字编辑、背景等自定义参数配置，具体请参考[样式结构](https://www.volcengine.com/docs/508/127402)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Style")
    private Map<String, Object> style;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
