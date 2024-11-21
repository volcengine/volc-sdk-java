package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddImageElementsBody
 */
@lombok.Data
public final class AddImageElementsBody  {

    /**
     * <p>要素类型，取值如下所示：</p>
     *
     * <p>* image：图片要素；</p>
     *
     * <p>* background：背景要素；</p>
     *
     * <p>* mask：蒙版要素。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>待添加的图片 URI 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Images")
    private List<String> images;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
