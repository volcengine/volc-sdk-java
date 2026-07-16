package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.SCRIPT;
import static com.volcengine.model.tls.Const.TARGET_RESOURCES;

@Data
@NoArgsConstructor
public class LogBackFlowETLTaskInfo {
    @JSONField(name = SCRIPT)
    private String script;
    @JSONField(name = TARGET_RESOURCES)
    private List<TargetResource> targetResources;
}
