package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click2CallRequest {

    private String caller;

    private String callerNumber;

    private String callerNumberPoolNo;

    private String callerNumberCityCode;

    private int callerDegradeToCapital;

    private String callerNumberDegradeCityList;

    private String callee;

    private String calleeNumber;

    private String calleeNumberPoolNo;

    private String calleeNumberCityCode;

    private int calleeDegradeToCapital;

    private String calleeNumberDegradeCityList;

    private int maxTime;

    private String preVoice;

    private int lastMinutes;

    private String lastVoice;

    private String lastVoiceTo;

    private String userData;
}
