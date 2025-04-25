package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskResResultData
 */
@lombok.Data
public final class UpdateCarouselTaskResResultData  {

    /**
     * <p>当前生效的任务配置序列号，用于标识最新的任务修改记录。每次任务配置更新后，该值会递增。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OptID")
    private Integer optID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
