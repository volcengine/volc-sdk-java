package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityReservationResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityReservationResponseBody result;

    @Data
    public static class GetActivityReservationResponseBody {
        @JSONField(name = "ActivityID")
        Long ActivityID;
        @JSONField(name = "Total")
        Long Total;
        @JSONField(name = "Page")
        Long Page;
        @JSONField(name = "Items")
        List<ActivityReservation> Items;
    }

    @Data
    public static class ActivityReservation {
        @JSONField(name = "TelReserve")
        String TelReserve;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "UserDevice")
        String UserDevice;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Source")
        Integer Source;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "IpAddress")
        String IpAddress;
        @JSONField(name = "SubmitTime")
        Long SubmitTime;
        @JSONField(name = "UserId")
        Long UserId;
    }
}