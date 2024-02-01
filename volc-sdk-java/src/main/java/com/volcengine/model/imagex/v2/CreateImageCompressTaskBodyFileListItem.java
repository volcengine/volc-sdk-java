package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageCompressTaskBodyFileListItem
 */
@lombok.Data
public final class CreateImageCompressTaskBodyFileListItem  {

    /**
     * <p>公网可访问的待压缩文件 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>- 指定时，为 URL 文件所在压缩包中的别名。</p>
     *
     * <p>- 不指定时，若能提取原文件名称时，则以 URL 原文件名称；否则，使用随机名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Alias")
    private String alias;

    /**
     * <p>URL 对应资源在压缩包中的文件夹，不传时则将该资源存储至一级目录下。不能以`/`结尾。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Folder")
    private String folder;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
