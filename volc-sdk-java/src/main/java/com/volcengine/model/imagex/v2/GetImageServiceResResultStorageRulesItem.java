package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesItem
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesItem  {

    /**
     * <p>文件前缀，例如设置为 `prefix` 后，规则将只对名称以 `prefix` 开头的存储资源生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>策略类型，固定取值 `Upload`，表示按上传时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Event")
    private String event;

    /**
     * <p>策略天数，按照 Event 事件 Day 天后执行 Action 事件，即当匹配文件的上传时间符合指定天数后，自动按照处理策略对资源进行处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Day")
    private Integer day;

    /**
     * <p>策略命中后需要执行的操作，取值如下所示：</p>
     *
     *
     *
     * <p>- `DELETE`：删除文件</p>
     *
     * <p>- `IA`：文件转低频存储</p>
     *
     * <p>- `ARCHIVE`：文件转归档存储</p>
     *
     * <p>- `COLD_ARCHIVE`：文件转冷归档存储</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>是否启用策略，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentAction")
    private String nonCurrentAction;

    /**
     * <p>非当前天数。取值范围为 `[ ]`，单位为，默认值为``。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentDay")
    private Integer nonCurrentDay;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
