package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageBackgroundColorsResResult
 */
@lombok.Data
public final class DeleteImageBackgroundColorsResResult  {

    /**
     * <p>删除失败的颜色列表。若全部删除失败，则接口将返回失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedList")
    private List<String> failedList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
