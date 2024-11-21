package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageElementsResResult
 */
@lombok.Data
public final class GetImageElementsResResult  {

    /**
     * <p>要素总个数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Double total;

    /**
     * <p>要素列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageList")
    private List<GetImageElementsResResultImageListItem> imageList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
