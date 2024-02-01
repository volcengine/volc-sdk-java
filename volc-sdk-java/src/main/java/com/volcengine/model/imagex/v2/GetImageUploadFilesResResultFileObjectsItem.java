package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUploadFilesResResultFileObjectsItem
 */
@lombok.Data
public final class GetImageUploadFilesResResultFileObjectsItem  {

    /**
     * <p>文件 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>文件修改时间，文件修改时的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastModified")
    private String lastModified;

    /**
     * <p>文件字节数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Integer fileSize;

    /**
     * <p>分页标志。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private Long marker;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
