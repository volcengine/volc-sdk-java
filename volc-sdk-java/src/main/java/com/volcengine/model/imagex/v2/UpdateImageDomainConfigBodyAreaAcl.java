package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyAreaAcl
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyAreaAcl  {

    /**
     * <p>是否开启区域限制，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：未开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>黑白名单设置类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `deny`：黑名单</p>
     *
     * <p>- `allow`：白名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "rule_type")
    private String ruleType;

    /**
     * <p>地区列表。取值请见[国家名称对照表](https://www.volcengine.com/docs/6454/131750)表格中国家简写该列内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "areas")
    private List<String> areas;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
