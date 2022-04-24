package com.volcengine.service.sercretnumber.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    private List<String> callerNumberDegradeCityList;

    private String callee;

    private String calleeNumber;

    private String calleeNumberPoolNo;

    private String calleeNumberCityCode;

    private int calleeDegradeToCapital;

    private List<String> calleeNumberDegradeCityList;

    private int maxTime;

    private String preVoice;

    private int lastMinutes;

    private String lastVoice;

    private String lastVoiceTo;

    private String userData;
}
