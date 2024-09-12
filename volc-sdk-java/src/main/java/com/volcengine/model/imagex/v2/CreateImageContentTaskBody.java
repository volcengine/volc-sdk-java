package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageContentTaskBody
 */
@lombok.Data
public final class CreateImageContentTaskBody  {

    /**
     * <p>操作类型。取值如下所示：</p>
     *
     * <p>- `refresh_url`：刷新 URL</p>
     *
     * <p>- `refresh_dir`：目录刷新（支持根目录刷新）</p>
     *
     * <p>- `preload_url`：预热 URL</p>
     *
     * <p>- `block_url`：禁用 URL</p>
     *
     * <p>- `unblock_url`：解禁 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>资源 URL 或者目录。</p>
     *
     * <p>- 当`TaskType`取值`refresh_url`，一次可提交的最大限额为 2000 个；</p>
     *
     * <p>- 当`TaskType`取值`refresh_dir`，一次可提交的最大限额为 50 个；</p>
     *
     * <p>- 当`TaskType`取值`preload_url`，一次可提交的最大限额为 2000 个；</p>
     *
     * <p>- 当`TaskType`取值`block_url`，一次可提交的最大限额为 2000 个；</p>
     *
     * <p>- 当`TaskType`取值`unblock_url`，一次可提交的最大限额为 2000 个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Urls")
    private List<String> urls;

    /**
     * <p>仅当 `TaskType` 为 `refresh_dir` 使用目录刷新时，可通过此配置开启前缀刷新。取值如下所示：  </p>
     *
     * <p>- `true`：开启前缀刷新 </p>
     *
     * <p>- `false`：（默认）关闭前缀刷新，进行标准的目录匹配刷新。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrefixRefreshDir")
    private Boolean prefixRefreshDir;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
