package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageUploadFilesResResult
 */
@lombok.Data
public final class DeleteImageUploadFilesResResult  {

    /**
     * <p>成功删除的文件 Uri 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeletedFiles")
    private List<String> deletedFiles;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
