package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetActivityReservationAPIV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityReservationAPIV2ResponseBody result;

    @Data
    public static class GetActivityReservationAPIV2ResponseBody {
        @JSONField(name = "Page")
        Long Page;
        @JSONField(name = "Items")
        List<ActivityReservationAPI> Items;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    public static class ActivityReservationAPI {
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "SubmitTime")
        Long SubmitTime;
        @JSONField(name = "UserDevice")
        String UserDevice;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "IpAddress")
        String IpAddress;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Channel")
        String Channel;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "TelReserve")
        String TelReserve;
    }
}