package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageUploadFilesBody
 */
@lombok.Data
public final class UpdateImageUploadFilesBody  {

    /**
     * <p>更新操作。</p>
     *
     *
     *
     * <p>- 取值为 `0` 表示刷新 URL</p>
     *
     * <p>- 取值为 `1` 表示禁用 URL</p>
     *
     * <p>- 取值为 `2` 表示解禁 URL</p>
     *
     * <p>- 取值为 `4` 表示预热 URL</p>
     *
     * <p>- 取值为 `5` 表示目录刷新</p>
     *
     * <p>- 取值为 `6` 表示样式刷新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private Integer action;

    /**
     * <p>待操作的图片 URL 列表，最多传 100 个。</p>
     *
     *
     *
     * <p>- 当 [Action] 取值为 `5` 时，表示待刷新的目录列表，目录必须以 `/` 结尾，不支持刷新根目录，也不支持海外域名;</p>
     *
     * <p>- 当 [Action] 取值为 `6` 时，表示样式刷新，一次性最多传入 5 个 url，单个 url 最多匹配10万个样式，暂不支持海外使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
