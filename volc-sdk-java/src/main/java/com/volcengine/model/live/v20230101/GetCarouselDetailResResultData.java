package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCarouselDetailResResultData
 */
@lombok.Data
public final class GetCarouselDetailResResultData  {

    /**
     * <p>最新的播放列表修改序列号，每次成调用 `UpdateCarouselTask` 接口更新任务，此值都会加 `1`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastOperationIndex")
    private Integer lastOperationIndex;

    /**
     * <p>当前实际生效的播放列表序列号，表示任务目前按照该版本的素材列表在播放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastSuccessOperationIndex")
    private Integer lastSuccessOperationIndex;

    /**
     * <p>当前播放或最后一次播放的素材信息，以 JSON 字符串的形式返回。此字段包含素材的详细信息，例如素材名称、播放位置等，便于用户获取播放相关的具体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayInfo")
    private String playInfo;

    /**
     * <p>轮播任务的播放规则，以下是部分关键参数：</p>
     *
     *
     *
     * <p>- `Loop`：是否循环播放，及其循环次数。</p>
     *
     * <p>- `Mode`：播放模式（普通模式/转码模式）。</p>
     *
     * <p>- `Output`：推流参数，包括 `Audio`（音频参数）、`Video`（视频参数）和 `Url`（推流地址）。</p>
     *
     * <p>- `Source`：轮播素材列表，包括每个素材的 `ID`、`Type`（类型，如 `vod`）、`Url`（播放地址）等信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private String rule;

    /**
     * <p>任务的当前状态。支持以下取值：</p>
     *
     *
     *
     * <p>- `pending`：任务等待调度中；</p>
     *
     * <p>- `prepare`：任务初始化中；</p>
     *
     * <p>- `running`：任务运行中；</p>
     *
     * <p>- `prestop`：任务停止中；</p>
     *
     * <p>- `done`：任务已经停止。</p>
     *
     *
     *
     * <p>该字段用于指示任务生命周期中的当前阶段，通常用于监控或查询任务执行的进展情况。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
