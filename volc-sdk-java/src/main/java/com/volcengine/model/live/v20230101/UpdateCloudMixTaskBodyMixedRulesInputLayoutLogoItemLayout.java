package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskBodyMixedRulesInputLayoutLogoItemLayout
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesInputLayoutLogoItemLayout  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X")
    private Integer x;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y")
    private Integer y;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Integer w;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "H")
    private Integer h;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
