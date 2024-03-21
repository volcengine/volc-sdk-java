package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageUploadFilesResResult
 */
@lombok.Data
public final class GetImageUploadFilesResResult  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>上传文件信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileObjects")
    private List<GetImageUploadFilesResResultFileObjectsItem> fileObjects;

    /**
     * <p>当前存储状态，取值为：正常、未审核、禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>是否还有下页数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "hasMore")
    private Boolean hasMore;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
