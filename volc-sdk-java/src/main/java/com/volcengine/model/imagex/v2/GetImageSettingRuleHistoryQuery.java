package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSettingRuleHistoryQuery
 */
@lombok.Data
public final class GetImageSettingRuleHistoryQuery  {

    /**
     * <p>应用 ID，您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppId。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>配置项 ID，您可以通过[调用获取配置项列表](https://www.volcengine.com/docs/508/1324617)的方式获取所需的配置项 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingId")
    private String settingId;

    /**
     * <p>分页偏移量，用于控制分页查询返回结果的起始位置，以便对数据进行分页展示和浏览。默认值为 0。</p>
     *
     * <p>:::tip</p>
     *
     * <p>例如，指定分页条数 Limit = 10，分页偏移量 Offset = 10，表示从查询结果的第 11 条记录开始返回数据，共展示 10 条数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>分页查询时，显示的每页数据的最大条数。取值范围为 [1,100]，默认值为 10。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
