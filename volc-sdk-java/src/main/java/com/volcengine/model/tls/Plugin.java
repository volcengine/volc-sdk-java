package com.volcengine.model.tls;

import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class Plugin {
    @JSONField(name = PROCESSORS)
    Map<String, Object> processors;

    /**
     * @return LogCollector插件
     */
    public Map<String, Object> getProcessors() {
        return processors;
    }

    /**
     * @param processors LogCollector插件
     */
    public void setProcessors(Map<String, Object> processors) {
        this.processors = processors;
    }
}
