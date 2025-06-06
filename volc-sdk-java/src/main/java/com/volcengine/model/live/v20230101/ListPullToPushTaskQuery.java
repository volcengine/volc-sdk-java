package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskQuery
 */
@lombok.Data
public final class ListPullToPushTaskQuery  {

    /**
     * <p>拉流转推任务的名称，不区分大小写，支持模糊查询。</p>
     *
     * <p>例如，`title` 取值为 `doc` 时，则返回任务名称为 `docspace`、`docs`、`DOC` 等 title 中包含 `doc` 关键词的所有任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页显示的数据条数，默认为 20，最大值为 500。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
