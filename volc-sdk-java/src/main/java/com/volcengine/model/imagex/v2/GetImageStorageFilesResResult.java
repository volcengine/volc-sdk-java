package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageStorageFilesResResult
 */
@lombok.Data
public final class GetImageStorageFilesResResult  {

    /**
     * <p>文件列表</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Items")
    private List<GetImageStorageFilesResResultItemsItem> items;

    /**
     * <p>是否还有更多文件，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是，还有文件信息未列出</p>
     *
     * <p>- `false`：否，已列出所有文件信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>`HasMore` 取值 `true` 时，即本次查询还有未列举到的文件信息时。`Marker` 作为起始条目位置标记，您需要在下一次列举时传入该值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    /**
     * <p>返回目录名称的数组集合。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CommonPrefix")
    private List<String> commonPrefix;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
