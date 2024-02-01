package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageTaskStrategyBodyRunStrategy
 */
@lombok.Data
public final class UpdateImageTaskStrategyBodyRunStrategy  {

    /**
     * <p>源下载 QPS 限制。如取值不为空，则长度必须为 24，表示一天 24 小时内各小时的 QPS 限制值。默认无限制。</p>
     *
     *
     *
     * <p>- 取值为负值时，表示无限制</p>
     *
     * <p>- 取值为 0 时，表示对应时间不允许迁移</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadQps")
    private List<Integer> readQps;

    /**
     * <p>源下载流量限制。单位为 Byte。如取值不为空，则长度必须为24，表示一天 24 小时内各小时的流量限制值。默认无限制。</p>
     *
     *
     *
     * <p>- 取值为负值时，表示无限制</p>
     *
     * <p>- 取值为 0 时，表示对应时间不允许迁移</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReadRate")
    private List<Integer> readRate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
