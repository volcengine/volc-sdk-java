package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListBindEncryptDRMResResult
 */
@lombok.Data
public final class ListBindEncryptDRMResResult  {

    /**
     * <p>DRM 加密配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DRMBindingList")
    private List<ListBindEncryptDRMResResultDRMBindingListItem> dRMBindingList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
