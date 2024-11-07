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
     * <p>最终上传至 veImageX 服务的结果图存储 URI，数量为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    /**
     * <p>根据指定的文生图模型接口信息，接收的该接口响应的 JSON 数据。</p>
     *
     *
     *
     * <p>例如，使用[查询通用 2.0L-文生图异步任务](https://www.volcengine.com/docs/6791/1359424#%E6%9F%A5%E8%AF%A2%E4%BB%BB%E5%8A%A1)，则 RespJson 接收到的相应信息为：</p>
     *
     *
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "code": 10000,</p>
     *
     * <p>    "data": {</p>
     *
     * <p>        "binary_data_base64": [],</p>
     *
     * <p>        "image_urls": [</p>
     *
     * <p>            "https://xxx"</p>
     *
     * <p>        ],</p>
     *
     * <p>        "resp_data": "{\"pe_result\":\"\",\"predict_tags_result\":\"\",\"rephraser_result\":\"壮观的场景，展现了千军万马。画面中，穿着衣服的士兵们身着铠甲，手持长矛，整齐划一地行进在大地上。他们的身后是蓝天白云，而前方则是无尽的草原。\",\"request_id\":\"fffabb8c284a97530802576961c87939e9ab3b28b8a185f03e753420b1c9abe2\"}",</p>
     *
     * <p>        "status": "done"</p>
     *
     * <p>    },</p>
     *
     * <p>    "message": "Success",</p>
     *
     * <p>    "request_id": "20240926173705355DAC3521C41B25CBE5",</p>
     *
     * <p>    "status": 10000,</p>
     *
     * <p>    "time_elapsed": "1.616183051s"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RespJson")
    private Map<String, Object> respJson;

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
