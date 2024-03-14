package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageUploadFilesBody
 */
@lombok.Data
public final class DeleteImageUploadFilesBody  {

    /**
     * <p>文件 URI 列表，最多传 1000 个。您可以通过调用[获取服务下的上传文件](https://www.volcengine.com/docs/508/9392)来获取所需的文件 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUris")
    private List<String> storeUris;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
