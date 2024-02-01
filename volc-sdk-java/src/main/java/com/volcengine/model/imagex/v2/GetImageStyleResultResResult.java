package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageStyleResultResResult
 */
@lombok.Data
public final class GetImageStyleResultResResult  {

    /**
     * <p>渲染结果图的 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    /**
     * <p>渲染详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RenderDetail")
    private List<GetImageStyleResultResResultRenderDetailItem> renderDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
