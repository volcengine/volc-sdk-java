package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAuthKeyResResult
 */
@lombok.Data
public final class UpdateAuthKeyResResult  {

    /**
     * <p>版本号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionID")
    private Integer versionID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
