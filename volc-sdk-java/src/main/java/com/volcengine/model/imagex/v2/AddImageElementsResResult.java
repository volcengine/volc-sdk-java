package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddImageElementsResResult
 */
@lombok.Data
public final class AddImageElementsResResult  {

    /**
     * <p>添加失败的图片 URI 列表。若全部添加失败，则接口将返回失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedList")
    private List<String> failedList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
