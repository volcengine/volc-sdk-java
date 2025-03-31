package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageUploadFilesBody
 */
@lombok.Data
public final class DeleteImageUploadFilesBody  {

    /**
     * <p>待删除文件的存储 URI 列表，最多传 1000 个。您可以通过调用[获取服务下的上传文件](https://www.volcengine.com/docs/508/9392)来获取所需的文件 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUris")
    private List<String> storeUris;

    /**
     * <p>待删除文件的存储版本 ID。传值时需要和 `StoreUris` 一一对应。您可在 veImageX 控制台资源管理查看文件版本号，或调用 [GetImageStorageVersionFiles](https://www.volcengine.com/docs/508/1359366) 查询服务下所有文件的版本信息。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>当删除文件未指定 StoreVersions，那么删除逻辑将根据版本控制的状态产生以下差异。</p>
     *
     * <p>- 若此时版本控制为未开启，则 StoreUris 对应文件将被永久删除，不可恢复。</p>
     *
     * <p>- 若此时版本控制为开启，则 StoreUris 对应文件未被真正删除，该文件可以被恢复，同时将增加一个[删除标记](https://www.volcengine.com/docs/508/1359410)用于标识该文件为删除状态。</p>
     *
     * <p>- 若此时版本控制为暂停，则根据版本 ID 是否为 null 而有以下差异：</p>
     *
     * <p>	- 若文件的版本 ID 为 null，则 StoreUris 对应文件被真正删除，不可恢复，同时将增加一个[删除标记](https://www.volcengine.com/docs/508/1359410)用于标识该文件为删除状态。</p>
     *
     * <p>	- 若文件的版本 ID 不为 null，则 StoreUris 对应文件未被真正删除，而是转换为历史版本保留。该文件可以被恢复，同时将增加一个[删除标记](https://www.volcengine.com/docs/508/1359410)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreVersions")
    private List<String> storeVersions;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
