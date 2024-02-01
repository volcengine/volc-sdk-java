package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CommitImageUploadResResult
 */
@lombok.Data
public final class CommitImageUploadResResult  {

    /**
     * <p>运行结果，数组长度对应上传的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Results")
    private List<CommitImageUploadResResultResultsItem> results;

    /**
     * <p>JSON 序列化之后的图片信息，结构体请参考 [ImageInfo](#imageinfo) 的 Array。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PluginResult")
    private List<CommitImageUploadResResultPluginResultItem> pluginResult;

    /**
     * <p>请求的唯一标识 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
