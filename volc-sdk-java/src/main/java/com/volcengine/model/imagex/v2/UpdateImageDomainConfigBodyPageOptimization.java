package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyPageOptimization
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyPageOptimization  {

    /**
     * <p>是否开启页面优化，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>表示需要优化的对象列表。该参数有以下取值： </p>
     *
     * <p>- `html`: （默认）表示 HTML 页面。 </p>
     *
     * <p>- `js`: 表示 Javascript 代码。 </p>
     *
     * <p>- `css`: 表示 CSS 代码。 </p>
     *
     * <p>:::tip</p>
     *
     * <p>如果对象列表包含 js 或者 js，html 也必须被包含。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "optimization_type")
    private List<String> optimizationType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
