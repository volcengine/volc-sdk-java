package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetCVImageGenerateTaskBody
 */
@lombok.Data
public final class GetCVImageGenerateTaskBody  {

    /**
     * <p>指定文生图异步任务的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>创建文生图任务时，使用的[文生图系列模型](#使用说明)的接口的请求 JSON 字符串。</p>
     *
     *
     *
     * <p>例如，使用[查询通用 2.0L-文生图异步任务](https://www.volcengine.com/docs/6791/1359424#%E6%9F%A5%E8%AF%A2%E4%BB%BB%E5%8A%A1)，则 `ReqJson` 需要取值为：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "req_key": "high_aes_general_v20_L",</p>
     *
     * <p>    "task_id": "7418049665255653414",</p>
     *
     * <p>    "req_json": "{\"logo_info\":{\"add_logo\":true,\"position\":0,\"language\":0,\"logo_text_content\":\"这里是明水印内容\"},\"return_url\":true}"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReqJson")
    private Map<String, Object> reqJson;

    /**
     * <p>创建文生图任务时，使用的[文生图系列模型](#使用说明)的接口 Action 名称。</p>
     *
     *
     *
     * <p>例如，使用[查询通用 2.0L-文生图异步任务](https://www.volcengine.com/docs/6791/1359424#%E6%9F%A5%E8%AF%A2%E4%BB%BB%E5%8A%A1)，则 `ModelAction` 需要取值为 `CVSync2AsyncGetResult`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelAction")
    private String modelAction;

    /**
     * <p>创建文生图任务时，使用的[文生图系列模型](#使用说明)的接口 Version 名称。</p>
     *
     *
     *
     * <p>例如，使用[查询通用 2.0L-文生图异步任务](https://www.volcengine.com/docs/6791/1359424#%E6%9F%A5%E8%AF%A2%E4%BB%BB%E5%8A%A1)，则 `ModelVersion` 需要取值为 `2022-08-31`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelVersion")
    private String modelVersion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
