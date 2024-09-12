package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskBodyTaskDst
 */
@lombok.Data
public final class CreateImageMigrateTaskBodyTaskDst  {

    /**
     * <p>迁移目标服务 ID，请提前[新建服务](https://www.volcengine.com/docs/508/357114#%E6%96%B0%E5%BB%BA%E6%9C%8D%E5%8A%A1)。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>源 Bucket 名称保留规则。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：不保留，迁移后资源访问 URI 中，不保留迁移源的 Bucket 名称。</p>
     *
     * <p>- `false`：（默认）保留，迁移后资源访问 URI 中，会保留迁移源的 Bucket 名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipBucket")
    private Boolean skipBucket;

    /**
     * <p>目标 key 前缀，即保存到到指定目录下。如需多重目录，请使用`/`分割，并以`/`结尾。</p>
     *
     * <p>默认为空，表示迁移到根目录。</p>
     *
     *
     *
     * <p>- 使用非 URL 方式迁移到根目录时：迁移后 存储 Key 与源存储 Bucket 的文件存储 Key 相同。</p>
     *
     * <p>- 使用 Url 方式迁移到根目录时：迁移后存储 Key 与源 URL 中 Path 值相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>同名文件覆盖规则配置。取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：（默认）直接覆盖同名文件</p>
     *
     * <p>- `1`：增加文件名后缀，后缀为 任务 ID</p>
     *
     * <p>- `2`：跳过同名文件，即不做迁移</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>同名文件指文件在对象存储中的访问 Key 相同的文件，调用 veImageX 服务时会用到文件访问 Key。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadConf")
    private Integer uploadConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
