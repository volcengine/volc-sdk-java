package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePlayURLResResultURLListItemSubStreamURLItem
 */
@lombok.Data
public final class GeneratePlayURLResResultURLListItemSubStreamURLItem  {

    /**
     * <p>子流转码后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>地址标签。包括 `drm`、`hls加密`等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tag")
    private String tag;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
