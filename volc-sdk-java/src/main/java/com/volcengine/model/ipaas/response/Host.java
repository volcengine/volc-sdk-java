package com.volcengine.model.ipaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Host {
    @JSONField(name = "product_id")
    String ProductID;
    @JSONField(name = "package_id")
    String PackageID;
    @JSONField(name = "host_id")
    String HostID;
    @JSONField(name = "package_spec")
    String PackageSpec;
    @JSONField(name = "package_name")
    String PackageName;
    @JSONField(name = "region")
    String Region;
    @JSONField(name = "idc")
    String Idc;
    @JSONField(name = "dc_name")
    String DCName;

    @JSONField(name = "status")
    long Status;
    @JSONField(name = "host_create_at")
    long HostCreateAt;
    @JSONField(name = "expire_at")
    long ExpireAt;
    @JSONField(name = "bandwidth")
    long Bandwidth;
    @JSONField(name = "isp")
    long Isp;

    @JSONField(name = "host_pay_mode")
    String HostPayMode;

    @JSONField(name = "created_at")
    String CreatedAt;
    @JSONField(name = "updated_at")
    String UpdatedAt;
}

