package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ImportConfig {
    /**
     * 导入类型
     */
    @JSONField(name = IMPORT_TYPE)
    private String importType;

    /**
     * 导入源配置
     */
    @JSONField(name = SOURCE_CONFIG)
    private Map<String, Object> sourceConfig;

    /**
     * 导入目标配置
     */
    @JSONField(name = DESTINATION_CONFIG)
    private Map<String, Object> destinationConfig;
}