package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageMigrateTaskBodyTaskSource
 */
@lombok.Data
public final class CreateImageMigrateTaskBodyTaskSource  {

    /**
     * <p>迁移云服务商。取值如下所示：</p>
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
     * <p>仅当`Vendor` 非 `URL`时，为必填。</p>
     *
     *
     *
     * <p>Access Key，与 Secret Key 同时填写，为了保证有访问源数据桶的权限。</p>
     *
     *
     *
     * <p>- 请参考[云数据迁移准备](https://www.volcengine.com/docs/508/129213)获取对应阿里云OSS、腾讯云COS、七牛云KODO、百度云BOS、华为云OBS、 优刻得（Ucloud File)、AWS国际站的账号 AK/SK。</p>
     *
     * <p>- 对于其他 S3 协议存储的AK/SK，请根据其具体源站信息填写。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AK")
    private String aK;

    /**
     * <p>仅当`Vendor` 非 `URL`时，为必填。</p>
     *
     *
     *
     * <p>Secret Key，与 Access Key 同时填写，为了保证有访问源数据桶的权限。</p>
     *
     *
     *
     * <p>- 请参考[云数据迁移准备](https://www.volcengine.com/docs/508/129213)获取对应阿里云OSS、腾讯云COS、七牛云KODO、百度云BOS、华为云OBS、 优刻得（Ucloud File)、AWS国际站的账号 AK/SK。</p>
     *
     * <p>- 对于其他 S3 协议存储的AK/SK，请根据其具体源站信息填写。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SK")
    private String sK;

    /**
     * <p>仅当`Vendor` 非 `URL/OSS/KODO/AWS`时，为必填。</p>
     *
     *
     *
     * <p>Bucket 所在地区。</p>
     *
     * <p>- 请参考[云数据迁移准备](https://www.volcengine.com/docs/508/129213)获取对应阿里云OSS、腾讯云COS、七牛云KODO、百度云BOS、华为云OBS、 优刻得（Ucloud File)、AWS国际站的 Bucket 地区。</p>
     *
     * <p>- 对于其他 S3 协议存储的 Bucket 地区，请根据其具体源站信息填写。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>- 仅当`Vendor`为`URL`时，需填写 URL 列表文件地址（公网 URL 地址）。</p>
     *
     * <p>	 :::tip</p>
     *
     * <p>	支持指定迁移文件和转码后迁移文件进行重命名，详见 [URL 列表迁移文件说明](https://www.volcengine.com/docs/508/1263268)。</p>
     *
     * <p>	 :::</p>
     *
     * <p>- 当`Vendor`为其他时，需填写对应云服务商所需迁移数据的 Bucket 名称。您可参考[云数据迁移准备](https://www.volcengine.com/docs/508/129213)获取对应阿里云OSS、腾讯云COS、七牛云KODO、百度云BOS、华为云OBS、 优刻得（Ucloud File)、AWS国际站的 Bucket 名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>仅当`Vendor`为`S3`时，为必填。</p>
     *
     *
     *
     * <p>S3 协议 Endpoint，需以`http://`或`https://`开头。请根据源站信息填写。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>仅当`Vendor` 非 `URL`时，为选填。</p>
     *
     *
     *
     * <p>迁移源云服务商 CDN 域名，若不为空将使用该 CDN 域名下载三方云厂商的资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnHost")
    private String cdnHost;

    /**
     * <p>是否丢弃源 Header。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：丢弃源 Header</p>
     *
     * <p>- `false`：（默认）保留源 Header</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipHeader")
    private Boolean skipHeader;

    /**
     * <p>仅迁移匹配的前缀列表文件。文件路径前缀无需包含桶名称，但需要完整路径。</p>
     *
     * <p>默认为空，表示对该存储 Bucket 内资源执行全量迁移。若不为空，表示仅做部分迁移，即指定迁移的文件路径前缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private List<String> prefix;

    /**
     * <p>仅迁移匹配的正则表达式列表的文件。默认为空，表示对该存储 Bucket 内资源执行全量迁移。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 多条正则表达式之间是"或"的关系，即源文件匹配任何一条正则表达式即视为符合迁移条件。</p>
     *
     * <p>- 正则过滤规则需要遍历源桶中的全部文件，如果源桶中文件数量较多会降低迁移速度。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Regex")
    private List<String> regex;

    /**
     * <p>迁移文件起始时间点。仅迁移该查询时间段内新增或变更的文件。默认为空。</p>
     *
     *
     *
     * <p>日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStart")
    private String timeStart;

    /**
     * <p>迁移文件结束时间点。默认为空。仅迁移该查询时间段内新增或变更的文件。</p>
     *
     *
     *
     * <p>日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeEnd")
    private String timeEnd;

    /**
     * <p>仅当 `Vendor` 取值 `COS` 时，为选填。不为空，表示使用桶清单方式进行数据迁移；若为空，将遍历指定 `Bucket` 内的文件后再进行迁移。</p>
     *
     *
     *
     * <p>桶清单 csv 文件在第三方云存储 Bucket 中的存储目录路径。该路径不携带域名和 csv 清单文件信息，需要以`/`结尾。您可参考[获取桶清单文件存储路径](https://www.volcengine.com/docs/508/1347855#%E8%8E%B7%E5%8F%96%E6%A1%B6%E6%B8%85%E5%8D%95%E6%96%87%E4%BB%B6%E5%AD%98%E5%82%A8%E8%B7%AF%E5%BE%84)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BucketInventoryDir")
    private String bucketInventoryDir;

    /**
     * <p>仅当 `BucketInventoryDir` 不为空时，为必填。</p>
     *
     *
     *
     * <p>桶清单文件的表头信息，需要传入实际桶清单文件内每列数据对应字段名称，并遵循原文件所在位置。您可参考[获取桶清单文件解析位置](https://www.volcengine.com/docs/508/1347855#%E8%8E%B7%E5%8F%96%E6%A1%B6%E6%B8%85%E5%8D%95%E6%96%87%E4%BB%B6%E8%A7%A3%E6%9E%90%E4%BD%8D%E7%BD%AE)获取解析 csv 文件所需的字段信息。</p>
     *
     *
     *
     * <p>- Key ：【必填】表示待迁移的资源存储 Key。</p>
     *
     * <p>- Size ：【推荐】表示待迁移的资源大小。</p>
     *
     * <p>- ETag ：【可选】表示待迁移资源的 ETag 值。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>veImageX 按照该字段顺序对 csv 文件进行解析，获取待迁移文件详细信息。若位置填写错误，可能导致迁移失败。</p>
     *
     * <p>:::</p>
     *
     *
     *
     * <p>示例：</p>
     *
     * <p>1. 若 csv 文件内 Key、Size和 ETag 分别位于整张数据表的第 3 列、第 4 列和第 6 列。那么，此时 `BucketInventorySchema取值应为` `["", "", "Key", "Size", "", "ETag"]`；</p>
     *
     * <p>2. 若 csv 文件内 Key、Size和 ETag 分别位于整张数据表的第 2 列、第 4 列和第 5 列。那么，此时 `BucketInventorySchema取值应为` `["", "Key", "", "Size", "ETag", ""]`。</p>
     *
     * <p>:::warning</p>
     *
     * <p>csv 文件内数据的位置可能会因为您配置桶清单时选择的清单内容而产生差异，具体请以实际为准。</p>
     *
     * <p>:::</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BucketInventorySchema")
    private List<String> bucketInventorySchema;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
