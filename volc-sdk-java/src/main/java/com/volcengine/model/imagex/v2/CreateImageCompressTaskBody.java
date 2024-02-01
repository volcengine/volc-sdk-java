package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageCompressTaskBody
 */
@lombok.Data
public final class CreateImageCompressTaskBody  {

    /**
     * <p>压缩后文件压缩包的指定名称，默认为随机 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private String output;

    /**
     * <p>压缩方法，取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：ZIP DEFLATE 压缩打包方法</p>
     *
     * <p>	</p>
     *
     * <p>- `1`：仅保存文件，不执行压缩打包</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZipMode")
    private Integer zipMode;

    /**
     * <p>与 `FileList`，二选一。</p>
     *
     * <p>索引文件 StoreUri，为 .txt 文件，该索引文件需上传至指定服务对应存储中。</p>
     *
     * <p>该索引文件内需填写待压缩文件的 StoreUri，每行填写一个，最多可填写 3000 行。总文件大小不超过 45000 MB。若超出限制，则取消压缩打包操作，直接返回错误。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IndexFile")
    private String indexFile;

    /**
     * <p>POST 类型的回调 URL，用于接收相关回调 JSON 类型数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>与`IndexFile`，二选一。</p>
     *
     * <p>压缩文件列表配置，压缩文件 URL 最多为 500 个，总文件大小不超过 45000 MB。若超出限制，则取消压缩打包操作，直接返回错误。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileList")
    private List<CreateImageCompressTaskBodyFileListItem> fileList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
