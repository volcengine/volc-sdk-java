package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContainerRule {
    @JSONField(name=STREAM)
    String stream;
    @JSONField(name=CONTAINER_NAME_REGEX)
    String containerNameRegex;
    @JSONField(name=INCLUDE_CONTAINER_LABEL_REGEX)
    Map<String, String> includeContainerLabelRegex;
    @JSONField(name=EXCLUDE_CONTAINER_LABEL_REGEX)
    Map<String, String> excludeContainerLabelRegex;
    @JSONField(name=INCLUDE_CONTAINER_ENV_REGEX)
    Map<String, String> includeContainerEnvRegex;
    @JSONField(name=EXCLUDE_CONTAINER_ENV_REGEX)
    Map<String, String> excludeContainerEnvRegex;
    @JSONField(name=ENV_TAG)
    Map<String, String> envTag;
    @JSONField(name=KUBERNETES_RULE)
    KubernetesRule kubernetesRule;
}
