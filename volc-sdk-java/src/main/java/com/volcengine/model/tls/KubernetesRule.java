package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class KubernetesRule {
    @JSONField(name = NAMESPACE_NAME_REGEX)
    String namespaceNameRegex;
    @JSONField(name = WORKLOAD_TYPE)
    String workloadType;
    @JSONField(name = WORKLOAD_NAME_REGEX)
    String workloadNameRegex;
    @JSONField(name = INCLUDE_POD_LABEL_REGEX)
    Map<String, String> includePodLabelRegex;
    @JSONField(name = EXCLUDE_POD_LABEL_REGEX)
    Map<String, String> excludePodLabelRegex;
    @JSONField(name = POD_NAME_REGEX)
    String podNameRegex;
    @JSONField(name = LABEL_TAG)
    Map<String, String> labelTag;
}
