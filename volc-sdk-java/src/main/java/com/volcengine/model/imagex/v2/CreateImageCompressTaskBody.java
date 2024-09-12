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
     * <p>文件的处理方式，取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：使用 ZIP DEFLATE 压缩方法，将文件进行压缩并打包为 ZIP 包。该方式适用于需要长期存储大量未经压缩的文件的场景，以节省存储空间。但需注意的是，若文件本身已经过压缩处理，将会因为文件的可压缩空间有限，导致该方式的压缩效果不明显。</p>
     *
     * <p>- `1`：仅将文件打包为 ZIP 包，但不执行压缩操作。该方式适用于快速整理文件而无需节省存储空间的场景。例如已经过压缩的文件的打包存储，以便于传输或归档。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ZipMode")
    private Integer zipMode;

    /**
     * <p>与 `FileList`为二选一，必填。<br></p>
     *
     * <p>索引文件的 StoreUri，为 .txt 文件，该索引文件需上传至指定服务对应存储中。<br></p>
     *
     * <p>该索引文件内需填写待压缩文件的地址，每行填写一个，最多可填写 3000 行。压缩前文件的总大小不超过 45000 MB。若超出限制，则取消压缩打包操作，致使打包任务失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IndexFile")
    private String indexFile;

    /**
     * <p>POST 类型的回调 URL，用于接收相关回调 JSON 类型数据。回调参数请参考[回调内容](#%E5%9B%9E%E8%B0%83%E5%86%85%E5%AE%B9)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>与`IndexFile`为二选一，必填。<br></p>
     *
     * <p>压缩文件列表配置，最多可支持 3000 个文件，压缩前文件的总大小不得超过 45000 MB。若超出限制，则取消压缩打包操作，致使打包任务失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileList")
    private List<CreateImageCompressTaskBodyFileListItem> fileList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
