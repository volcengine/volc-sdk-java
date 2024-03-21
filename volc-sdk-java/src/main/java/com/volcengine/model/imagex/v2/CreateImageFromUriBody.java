package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageFromUriBody
 */
@lombok.Data
public final class CreateImageFromUriBody  {

    /**
     * <p>待复制资源对应的服务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriServiceId")
    private String oriServiceId;

    /**
     * <p>待复制资源对应的存储 URI。您可在控制台的资源管理页面，获取[上传文件的存储 URI](https://www.volcengine.com/docs/508/1205054)；或者调用 [GetImageStorageFiles](https://www.volcengine.com/docs/508/1158308) 获取指定服务下的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>复制后资源的存储 Key。缺省情况下与源存储的资源存储 Key 相同。自定义规则如下所示：</p>
     *
     *
     *
     * <p>- 不支持空格。</p>
     *
     * <p>- 不支持以`/`开头或结尾，不支持`/`连续出现，Key 值最大长度限制为 180 个字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstKey")
    private String dstKey;

    /**
     * <p>是否保留目标存储中的同名文件，取值如下所示：</p>
     *
     * <p>- `false`：不保留目标存储中的同名文件，直接覆盖。</p>
     *
     * <p>- `true`：保留目标存储中的同名文件，不覆盖。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipDuplicate")
    private Boolean skipDuplicate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
