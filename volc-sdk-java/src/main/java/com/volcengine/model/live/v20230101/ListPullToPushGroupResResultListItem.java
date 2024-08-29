package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushGroupResResultListItem
 */
@lombok.Data
public final class ListPullToPushGroupResResultListItem  {

    /**
     * <p>群组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>群组所属的项目名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>群组的标签信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<ListPullToPushGroupResResultListItemTagsItem> tags;

    /**
     * <p>群组的状态，取值及含义如下所示。</p>
     *
     * <p>- `0`: 可用;</p>
     *
     * <p>- `1`: 已删除，不可用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Float status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
