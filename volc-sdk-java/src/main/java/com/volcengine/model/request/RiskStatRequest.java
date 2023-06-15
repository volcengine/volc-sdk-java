package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

public class RiskStatRequest {
    @Data
    public static class CommonProductStatisticsReq {
    @JSONField(name = "Product")
	String product;
    @JSONField(name = "UnitType")
	String unitType;
    @JSONField(name = "Parameters")
	String parameters;
	@JSONField(name = "AppId")
    int appId;
    @JSONField(name = "Service")
	String service;
    }

    @Data
    public static class CommonProductStatisticsParams {
        @JSONField(name = "start_date")
        String startDate;
        @JSONField(name = "end_date")
        String endDate;
        @JSONField(name = "need_app_detail")
        boolean needAppDetail;
        @JSONField(name =  "operate_time")
        long operateTime;
    }

    @Data
    public static class SimpleProductStatisticsParams extends CommonProductStatisticsParams {
        @JSONField(name = "need_service_detail")
        boolean needServiceDetail;
    }

    @Data
    public static class ContentProductStatisticsParams extends CommonProductStatisticsParams {
        @JSONField(name = "biztype")
        String biztype;
        @JSONField(name = "need_biz_type_detail")
        boolean needBizTypeDetail;
        @JSONField(name = "risk_type")
        String riskType;
        @JSONField(name = "need_risk_type_detail")
        boolean needRiskTypeDetail;
    }
}
