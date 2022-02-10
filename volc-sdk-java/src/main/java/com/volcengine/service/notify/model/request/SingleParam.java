package com.volcengine.service.notify.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SingleParam {
    @JSONField(name = "Resource")
    private String resource;

    @JSONField(name = "RingAgainTimes")
    private Integer ringAgainTimes = 0;

    @JSONField(name = "RingAgainInterval")
    private Integer ringAgainInterval = 5;

    @JSONField(name = "NumberPoolNo")
    private String numberPoolNo;

    @JSONField(name = "NumberList")
    private List<String> numberList;

    @JSONField(name = "NumberType")
    private Integer numberType = 0;

    @JSONField(name = "Phone")
    private String phone;

    @JSONField(name = "PhoneParam")
    private Map<String, Object> phoneParam;

    @JSONField(name = "Ext")
    private String ext;

    @JSONField(name = "TriggerTime",format="yyyy-MM-dd HH:mm:ss")
    private Date triggerTime;

    @JSONField(name = "TtsContent")
    private String ttsContent;

    //0录音文件, 1TTS模板，3TTS
    @JSONField(name = "Type")
    private Integer type = 0;

    @JSONField(name = "SingleOpenId")
    private String singleOpenId;
}
