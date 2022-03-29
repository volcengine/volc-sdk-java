package com.volcengine.service.notify.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTaskRequest {
    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "PhoneList")
    private List<PhoneParam> phoneList = new ArrayList<>();

    @JSONField(name = "Resource")
    private String resource;

    @JSONField(name = "StartTime",format="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @JSONField(name = "EndTime",format="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @JSONField(name = "Concurrency")
    private Integer concurrency;

    @Builder.Default
    @JSONField(name = "Start")
    private boolean start = true;

    @Builder.Default
    @JSONField(name = "MaxRingDuration")
    private Integer maxRingDuration = 20;

    @Builder.Default
    @JSONField(name = "RingAgainTimes")
    private Integer ringAgainTimes = 0;

    @Builder.Default
    @JSONField(name = "RingAgainInterval")
    private Integer ringAgainInterval = 5;

    @Builder.Default
    @JSONField(name = "Unique")
    private Boolean unique = Boolean.FALSE;

    @JSONField(name = "ForbidTimeList")
    private List<ForbidTimeItem> forbidTimeList;

    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;

    @JSONField(name = "NumberList")
    private List<String> numberList;

    //0整个号码池, 1指定的号码
    @JSONField(name = "SelectNumberType")
    private Integer selectNumberType;

    //0录音文件, 1TTS模板，3TTS
    @Builder.Default
    @JSONField(name = "Type")
    private Integer type = 0;
}
