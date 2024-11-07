package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateCVImageGenerateTaskResResult
 */
@lombok.Data
public final class CreateCVImageGenerateTaskResResult  {

    /**
     * <p>任务 ID，用于查询结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>根据指定的文生图模型接口信息，接收的该接口响应的 JSON 数据。</p>
     *
     *
     *
     * <p>例如，例如使用[通用 2.0S-文生图异步](https://www.volcengine.com/docs/6791/1347773)，则 RespJson 接收到的相应信息为：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "code": 10000,</p>
     *
     * <p>    "data": {</p>
     *
     * <p>        "task_id": "7418048504813240370"</p>
     *
     * <p>    },</p>
     *
     * <p>    "message": "Success",</p>
     *
     * <p>    "request_id": "2024092411365866C579D2A96A35DA62A9",</p>
     *
     * <p>    "status": 10000,</p>
     *
     * <p>    "time_elapsed": "23.099216ms"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RespJson")
    private Map<String, Object> respJson;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
