package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetVendorBucketsBody
 */
@lombok.Data
public final class GetVendorBucketsBody  {

    /**
     * <p>服务商。取值如下所示：</p>
     *
     *
     *
     * <p>- `OSS`：阿里云</p>
     *
     * <p>- `COS`：腾讯云</p>
     *
     * <p>- `KODO`：七牛云</p>
     *
     * <p>- `BOS`：百度云</p>
     *
     * <p>- `OBS`：华为云</p>
     *
     * <p>- `Ucloud`：Ucloud file</p>
     *
     * <p>- `AWS`：AWS 国际站</p>
     *
     * <p>- `S3`：其他 S3 协议存储</p>
     *
     * <p>- `URL`：以上传 URL 列表的方式迁移</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vendor")
    private String vendor;

    /**
     * <p>Bucket 所在地区。仅当`Vendor` 非 `URL/OSS/KODO/AWS` 时为必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>Access Key。是与 Secret Key 同时填写的，为了保证有访问源数据桶的权限。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AK")
    private String aK;

    /**
     * <p>Secret Key。是与 Access Key 同时填写的，为了保证有访问源数据桶的权限。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SK")
    private String sK;

    /**
     * <p>S3 协议 Endpoint，需以`http://`或`https://`开头。仅当`Vendor`为`S3`时必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
