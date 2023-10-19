package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateDenyConfigBodyDenyConfigListItem
 */
@lombok.Data
public final class UpdateDenyConfigBodyDenyConfigListItem  {

    /**
     * <p>黑名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyList")
    private List<String> denyList;

    /**
     * <p>白名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowList")
    private List<String> allowList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
