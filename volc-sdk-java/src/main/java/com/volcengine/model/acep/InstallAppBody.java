package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * InstallAppBody
 */
@lombok.Data
public final class InstallAppBody  {

    /**
     * <p>应用 ID，可通过调用 [ListApp](https://www.volcengine.com/docs/6394/1226894) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用版本 ID，可通过调用 [ListApp](https://www.volcengine.com/docs/6394/1226894) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionId")
    private String versionId;

    /**
     * <p>业务 ID。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如不指定 `PodIdList` 及 `TagIdList`，则安装应用到业务下的所有实例。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>指定实例 ID 列表进行应用安装。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>指定标签 ID 列表进行应用安装。可通过 [ListTag](https://www.volcengine.com/docs/6394/1221497) 获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagIdList")
    private List<String> tagIdList;

    /**
     * <p>应用安装类型：</p>
     *
     *
     *
     * <p>- `0`：（默认）机身存储独立安装（非共享）</p>
     *
     * <p>- `1`：共享安装</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallType")
    private Integer installType;

    /**
     * <p>镜像存储路径, 和ImageId共同使用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AbsolutePath")
    private String absolutePath;

    /**
     * <p>应用镜像ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
