package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageUploadFilesResResult
 */
@lombok.Data
public final class DeleteImageUploadFilesResResult  {

    /**
     * <p>文件成功删除的 URI 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeletedFiles")
    private List<String> deletedFiles;

    /**
     * <p>文件不存在的无效 URI 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InvaildFiles")
    private List<String> invaildFiles;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
