package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyHLClipsParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyHLClipsParam  {

    /**
     * <p>是否启用高光片段提取。默认值为 `false`。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>是否生成高光片段视频素材，仅当 `HLClipsParam.Enable` 为 `true` 时生效，默认值为 `false`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>若 `Enable` 为 `true`，且 `OutputHLClips` 为 `false`，则回调仅包含高光片段信息，您可以根据片段信息，自行剪辑视频素材。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputHLClips")
    private Boolean outputHLClips;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
