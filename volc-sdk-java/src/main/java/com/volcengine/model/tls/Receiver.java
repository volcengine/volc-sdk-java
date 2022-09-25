package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class Receiver {
    @JSONField(name=RECEIVER_TYPE)
    String receiverType;
    @JSONField(name=RECEIVER_NAMES)
    List<String> receiverNames;
    @JSONField(name=RECEIVER_CHANNELS)
    List<String> receiverChannels;
    @JSONField(name=START_TIME)
    String startTime;
    @JSONField(name=END_TIME)
    String endTime;
}
