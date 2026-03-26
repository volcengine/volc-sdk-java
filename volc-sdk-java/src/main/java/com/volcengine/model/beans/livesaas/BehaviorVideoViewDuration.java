package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BehaviorVideoViewDuration {
    @JSONField(name = "Preview")
    Long Preview;
    @JSONField(name = "Live")
    Long Live;
    @JSONField(name = "Replay")
    Long Replay;
    @JSONField(name = "Total")
    Long Total;
}
