package com.volcengine.model.ipaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListHostRequest {

    @JSONField(name = "product_id")
    String ProductId;
    @JSONField(name = "package_id")
    String PackageID;
    @JSONField(name = "host_id")
    String HostID;
    @JSONField(name = "host_id_in")
    String HostIDIn;

    @JSONField(name = "instance_no")
    String InstanceNo;
    @JSONField(name = "instance_id")
    String InstanceID;
    @JSONField(name = "instance_id_in")
    String InstanceIDIn;
    @JSONField(name = "status")
    long Status;
    @JSONField(name = "region")
    String Region;
    @JSONField(name = "dc_in")
    String DcIn;

    @JSONField(name = "isp")
    long Isp;

    @JSONField(name = "host_create_after")
    long HostCreateAfter;
    @JSONField(name = "offset")
    long Offset;
    @JSONField(name = "count")
    long Count;

    @JSONField(name = "detail")
    boolean Detail;
    @JSONField(name = "is_desc")
    boolean IsDesc;

    @JSONField(name = "order_by")
    String OrderBy;
}
