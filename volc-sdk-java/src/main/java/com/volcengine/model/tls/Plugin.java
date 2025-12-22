package com.volcengine.model.tls;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class Plugin {
    @JSONField(name = PROCESSORS)
    List<Map<String, Object>> processors;

    /**
     * @return LogCollector插件
     */
    public List<Map<String, Object>> getProcessors() {
        return processors;
    }

    /**
     * @param processors LogCollector插件
     */
    public void setProcessors(List<Map<String, Object>> processors) {
        this.processors = processors;
    }
}
