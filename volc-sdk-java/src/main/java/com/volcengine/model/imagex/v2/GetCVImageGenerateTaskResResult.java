package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVImageGenerateTaskResResult
 */
@lombok.Data
public final class GetCVImageGenerateTaskResResult  {

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     * <p>- `in_queue`：任务已提交</p>
     *
     * <p>- `generating`：任务处理中</p>
     *
     * <p>- `done`：任务处理完成</p>
     *
     * <p>- `not_found`：任务未找到，可能原因是无此任务或任务已过期（12小时）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>最终上传至 veImageX 服务的结果图访问 URL，数量为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    /**
     * <p>根据指定的文生图模型接口信息，接收的该接口响应的 JSON 数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RespJson")
    private Map<String, Object> respJson;

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>结果图访问 URL，数量为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUris")
    private List<String> storeUris;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
