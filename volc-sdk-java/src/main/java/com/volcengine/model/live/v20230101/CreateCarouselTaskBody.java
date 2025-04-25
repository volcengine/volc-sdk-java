package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskBody
 */
@lombok.Data
public final class CreateCarouselTaskBody  {

    /**
     * <p>轮播任务的名称，用于标识任务。支持由中文、大小写字母（A - Z、a - z）和数字（0 - 9）组成。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 此名称不能与其他正在运行中的任务名称重复。</p>
     *
     * <p>- 启动的任务不允许使用重复的名称。</p>
     *
     * <p>:::</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>轮播规则，用于指定轮播播放的素材和行为等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private CreateCarouselTaskBodyRule rule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
