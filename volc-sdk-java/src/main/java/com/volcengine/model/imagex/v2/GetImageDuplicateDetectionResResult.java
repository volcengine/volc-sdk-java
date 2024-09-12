package com.volcengine.model.imagex.v2;


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
     * <p>回调地址，与请求参数中的`Callback`相同。具体异步去重信息请参考 [GetDedupTaskStatus](https://www.volcengine.com/docs/508/138909)接口。具体回调内容请参考[回调参数](https://www.volcengine.com/docs/508/138658#%E5%9B%9E%E8%B0%83%E5%8F%82%E6%95%B0) 。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
