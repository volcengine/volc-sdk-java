package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAiGenerateTaskResResult
 */
@lombok.Data
public final class GetImageAiGenerateTaskResResult  {

    /**
     * <p>生成的处理图 URI，固定为 4 个长宽比为 1:1 的方图。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Uris")
    private List<String> uris;

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     * <p>- `Success`：处理成功</p>
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>- `Failed`：处理失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AestheticScores")
    private List<Double> aestheticScores;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDScores")
    private List<Double> sDScores;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
