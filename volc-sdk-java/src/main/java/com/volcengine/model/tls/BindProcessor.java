package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class BindProcessor {
    @JSONField(name = PROCESSOR_ID)
    String processorID;
    @JSONField(name = PROCESSOR_NAME)
    String processorName;
}
