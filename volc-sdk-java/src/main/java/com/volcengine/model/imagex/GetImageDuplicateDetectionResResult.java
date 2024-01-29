package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetImageDuplicateDetectionResResult
 */
@lombok.Data
public final class GetImageDuplicateDetectionResResult  {

    /**
     * <p>图片评分，仅在只上传两张图片并对比时才返回 Score 字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private String score;

    /**
     * <p>分组结果，若输入 2 个以上原图时，将按组返回内容相同的图片，每组的图片个数非固定值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Groups")
    private Map<String, List<String>> groups;

    /**
     * <p>异步任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
