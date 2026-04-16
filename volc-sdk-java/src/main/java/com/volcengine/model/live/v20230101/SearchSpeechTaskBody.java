package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * SearchSpeechTaskBody
 */
@lombok.Data
public final class SearchSpeechTaskBody  {

    /**
     * <p>任务状态。默认返回所有状态的任务。取值如下：</p>
     *
     * <p>- `running`：运行中。</p>
     *
     * <p>- `done`：已结束。</p>
     *
     * <p>- `prestop`：关闭中。</p>
     *
     * <p>- `init`：准备中。</p>
     *
     * <p>- `prepare`：启动中。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStatus")
    private List<String> taskStatus;

    /**
     * <p>任务名称。默认返回所有任务。长度为 1-64 个字节。不支持模糊搜索，英文区分大小写。可包含以下字符：</p>
     *
     * <p>- 数字（0-9）</p>
     *
     * <p>- 大写字母（A-Z）</p>
     *
     * <p>- 小写字母（a-z）</p>
     *
     * <p>- 中文</p>
     *
     * <p>- 下划线（_）</p>
     *
     * <p>- 中划线（-）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>返回创建时间在该时间点及之后的任务。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。默认返回所有任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeSt")
    private String createTimeSt;

    /**
     * <p>返回创建时间在该时间点及之前的任务。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。默认返回所有任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeEd")
    private String createTimeEd;

    /**
     * <p>分页查询页码。取值为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>分页查询数量。取值大于 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
