package com.volcengine.model.ipaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListInstanceRequest {
    @JSONField(name = "product_id")
    String ProductId;
    @JSONField(name = "instance_id")
    String InstanceID;
    @JSONField(name = "host_id")
    String HostID;
    @JSONField(name = "package_id")
    String PackageID;

    @JSONField(name = "status")
    long Status;
    @JSONField(name = "isp")
    long Isp;
    @JSONField(name = "dc")
    String DC;

    @JSONField(name = "tag_id")
    String TagID;
    @JSONField(name = "adb_key_id")
    long AdbKeyID;
    @JSONField(name = "security_group_id")
    long SecurityGroupID;
    @JSONField(name = "sg_bound_st")
    long SGBoundSt;

    @JSONField(name = "instance_id_in")
    String InstanceIDIn;
    @JSONField(name = "status_in")
    String StatusIn;
    @JSONField(name = "tag_id_in")
    String TagIDIn;

    @JSONField(name = "instance_id_like")
    String InstanceIDLike;

    @JSONField(name = "detail")
    boolean Detail;

    @JSONField(name = "is_order_asc")
    boolean IsOrderASC;

    @JSONField(name = "order_by")
    String OrderBy;
    @JSONField(name = "offset")
    long Offset;
    @JSONField(name = "count")
    long Count;
}
