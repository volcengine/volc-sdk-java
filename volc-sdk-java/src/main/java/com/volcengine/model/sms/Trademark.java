package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Trademark {
    @JSONField(name = "trademarkCn")
    public String trademarkCn;
    @JSONField(name = "trademarkEn")
    public String trademarkEn;
    @JSONField(name = "trademarkNumber")
    public String trademarkNumber;
    @JSONField(name = "trademarkFileList")
    public List<SignAuthFile> trademarkFileList;

    public Trademark() {

    }

    public Trademark(String trademarkCn, String trademarkEn, String trademarkNumber, List<SignAuthFile> trademarkFileList) {
        this.trademarkCn = trademarkCn;
        this.trademarkEn = trademarkEn;
        this.trademarkNumber = trademarkNumber;
        this.trademarkFileList = trademarkFileList;
    }
}
