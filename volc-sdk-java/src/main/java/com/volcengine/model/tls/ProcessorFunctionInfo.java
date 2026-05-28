package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class ProcessorFunctionInfo {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "FunctionType")
    String functionType;
    @JSONField(name = "MethodSignature")
    String methodSignature;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Samples")
    List<Sample> samples;
    @JSONField(name = "Arguments")
    List<Argument> arguments;

    @Data
    @NoArgsConstructor
    public static class Sample {
        @JSONField(name = "Index")
        Integer index;
        @JSONField(name = "Log")
        List<Map<String, Object>> log;
        @JSONField(name = "Script")
        String script;
        @JSONField(name = "Result")
        List<Map<String, Object>> result;
        @JSONField(name = "Description")
        String description;
    }

    @Data
    @NoArgsConstructor
    public static class Argument {
        @JSONField(name = "Index")
        Integer index;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "ArgumentType")
        String argumentType;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "IsNecessary")
        Boolean necessary;
        @JSONField(name = "DefaultValue")
        String defaultValue;
    }
}
