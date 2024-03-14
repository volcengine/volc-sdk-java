package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultPageOptimization
 */
@lombok.Data
public final class GetDomainConfigResResultPageOptimization  {

    /**
     * <p>是否开启页面优化，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：启用</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>需要优化的对象列表，取值如下所示： </p>
     *
     * <p>- `html`: 表示 HTML 页面。 </p>
     *
     * <p>- `js`: 表示 Javascript 代码。 </p>
     *
     * <p>- `css`: 表示 CSS 代码。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "optimization_type")
    private List<String> optimizationType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
