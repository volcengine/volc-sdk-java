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
     * <p>- 指定时，为 URL 文件所在压缩包中的别名。输入规则如下所示：</p>
     *
     * <p>	- 支持汉字、字母、数字及符号`-`、`_`和`.`；</p>
     *
     * <p>	- 不能以`-`、`_`和`.`开头；</p>
     *
     * <p>	- 长度不得超过 100 个字符。</p>
     *
     * <p>- 不指定时，若能提取原文件名称时，则以 URL 原文件名称；否则，使用随机名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Alias")
    private String alias;

    /**
     * <p>指定源文件在压缩包中的文件夹，不传时则将该资源存储至一级目录下。输入规则如下所示：</p>
     *
     *
     *
     * <p>- 支持汉字、字母、数字及符号`-`、`_`和`.`；</p>
     *
     * <p>- 不能以`-`、`_`和`.`开头；</p>
     *
     * <p>- 不能以`/`结尾。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 建议命名长度不超过 256 个字节。</p>
     *
     * <p>- 建议您在命名中仅使用 `-`、`_` 和 `.` 这三种符号。如果您使用了其他符号，可能因操作系统不支持导致处理异常。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Folder")
    private String folder;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
