package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Ip {
    @JSONField(name = "IP")
    List<String> IP;
    @JSONField(name = "NetworkSegment")
    List<String> NetworkSegment;
}
