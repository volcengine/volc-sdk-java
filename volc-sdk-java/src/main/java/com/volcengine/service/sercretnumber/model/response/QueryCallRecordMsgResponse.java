package com.volcengine.service.sercretnumber.model.response;

import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class QueryCallRecordMsgResponse {

    private ResponseMetadata responseMetadata;

    private List<QueryCallRecordMsg> result;

    @Data
    public static class QueryCallRecordMsg {

        private String accountId;

        private String callId;

        private Integer serviceType;

        private Integer subServiceType;

        private String caller;

        private String callerCountryIsoCode;

        private String callerProvinceCode;

        private String callerCityCode;

        private String callee;

        private String calleeCountryIsoCode;

        private String calleeProvinceCode;

        private String calleeCityCode;

        private Long beginCallTime;

        private Long endTime;

        private Integer releaseType;

        private Integer callDuration;

        private Integer callResult;

        private Integer audioRecordFlag;

        private Long cdrCreateTime;

        private String userData;

        private Integer callType;

        private String callerShowNumber;

        private String callerShowNumberPoolNo;

        private String calleeShowNumber;

        private String calleeShowNumberPoolNo;

        private Long callerCallingTime;

        private Long callerRingingTime;

        private Integer callerDuration;

    }
}
