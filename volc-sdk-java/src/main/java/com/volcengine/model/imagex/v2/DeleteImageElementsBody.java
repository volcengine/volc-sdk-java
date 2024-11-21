package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageElementsBody
 */
@lombok.Data
public final class DeleteImageElementsBody  {

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
     * <p>待删除的 StoreUri 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageList")
    private List<String> imageList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
