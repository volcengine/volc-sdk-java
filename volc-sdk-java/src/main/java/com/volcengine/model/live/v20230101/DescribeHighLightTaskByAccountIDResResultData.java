package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHighLightTaskByAccountIDResResultData
 */
@lombok.Data
public final class DescribeHighLightTaskByAccountIDResResultData  {

    /**
     * <p>高光剪辑任务的生产结果列表，包含多个生产回调结果。每个结果包含以下信息：</p>
     *
     * <p>- `code`：生产回调的状态码；</p>
     *
     * <p>- `status`：生产状态码；</p>
     *
     * <p>- `message`：生产描述信息；</p>
     *
     * <p>- `exception`：异常信息；</p>
     *
     * <p>- `TaskID`：高光剪辑任务的唯一标识符；</p>
     *
     * <p>- `Output`：高光剪辑生产结果的详细信息；</p>
     *
     * <p>- `ExtraData`：自定义的其他信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProducedResults")
    private List<HighlightCallbackInfo> producedResults;

    /**
     * <p>高光剪辑任务所属的账号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>创建高光剪辑任务时使用的参数配置，以 JSON 字符串格式传递。包含任务名称、类型、模型、输入源、高光剪辑参数、高光混剪参数、直播参数、点播参数、字幕参数和回调参数等详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private String rule;

    /**
     * <p>高光剪辑任务的状态，可能的取值如下所示。</p>
     *
     * <p>- `init`：任务初始化状态；</p>
     *
     * <p>- `pending`：任务等待启动阶段；</p>
     *
     * <p>- `prepare`：任务启动状态；</p>
     *
     * <p>- `running`：任务生产状态；</p>
     *
     * <p>- `prestop`：任务准备结束状态；</p>
     *
     * <p>- `done`：任务完成状态；</p>
     *
     * <p>- `error`：任务报错状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>高光剪辑任务的唯一标识符，用于查询特定任务的详情信息。该标识符在创建任务时生成，通过此标识符可获取任务状态、生产结果等详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
