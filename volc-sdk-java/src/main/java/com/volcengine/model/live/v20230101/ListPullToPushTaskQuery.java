package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskQuery
 */
@lombok.Data
public final class ListPullToPushTaskQuery  {

    /**
     * <p>页码，默认值为 1，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页数量，取值范围为 \[1,500\]，默认值为 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>任务名称。不区分大小写，支持模糊查询。</p>
     *
     * <p>例如，`title` 取值为 `doc` 时，则返回任务名称为 `docspace`、`docs`、`DOC` 等包含 `doc` 关键词的任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
