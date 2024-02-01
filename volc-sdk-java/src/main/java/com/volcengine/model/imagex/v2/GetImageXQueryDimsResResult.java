package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageXQueryDimsResResult
 */
@lombok.Data
public final class GetImageXQueryDimsResResult  {

    /**
     * <p>上报数据中出现的维度信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dim")
    private List<String> dim;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
