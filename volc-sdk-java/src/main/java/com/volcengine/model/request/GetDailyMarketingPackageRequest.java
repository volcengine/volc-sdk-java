package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDailyMarketingPackageRequest {
    @JSONField(name = "plan_name")
    private String planName;
    @JSONField(name = "customer_package_id")
    private int customerPackageId;
    @JSONField(name = "date")
    private String date;
}
