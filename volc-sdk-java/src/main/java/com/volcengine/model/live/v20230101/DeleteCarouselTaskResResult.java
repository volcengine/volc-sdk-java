package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCarouselTaskResResult
 */
@lombok.Data
public final class DeleteCarouselTaskResResult  {

    /**
     * <p>删除任务的操作结果信息，返回任务是否成功删除以及相关的 Mesos ID 和操作影响记录数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private String data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
