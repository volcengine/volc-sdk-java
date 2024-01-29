package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetDedupTaskStatusResResult
 */
@lombok.Data
public final class GetDedupTaskStatusResResult  {

    /**
     * <p>异步任务状态，取值如下所示：</p>
     *
     * <p>* 0：任务进行中</p>
     *
     * <p>* 1：任务执行成功</p>
     *
     * <p>* 2：任务执行失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>分组结果，若输入 2 个以上原图时，将按组返回内容相同的图片，每组的图片个数非固定值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Groups")
    private Map<String, List<String>> groups;

    /**
     * <p>图片评分，仅在两张图片对比才返回 Score 字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private String score;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
