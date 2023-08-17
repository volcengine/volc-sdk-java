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
    @JSONField(name = STREAM)
    String stream;
    @JSONField(name = CONTAINER_NAME_REGEX)
    String containerNameRegex;
    @JSONField(name = INCLUDE_CONTAINER_LABEL_REGEX)
    Map<String, String> includeContainerLabelRegex;
    @JSONField(name = EXCLUDE_CONTAINER_LABEL_REGEX)
    Map<String, String> excludeContainerLabelRegex;
    @JSONField(name = INCLUDE_CONTAINER_ENV_REGEX)
    Map<String, String> includeContainerEnvRegex;
    @JSONField(name = EXCLUDE_CONTAINER_ENV_REGEX)
    Map<String, String> excludeContainerEnvRegex;
    @JSONField(name = ENV_TAG)
    Map<String, String> envTag;
    @JSONField(name = KUBERNETES_RULE)
    KubernetesRule kubernetesRule;

    /**
     * @return 采集模式
     */
    public String getStream() {
        return stream;
    }

    /**
     * @param stream 采集模式
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * @return 待采集的容器名称
     */
    public String getContainerNameRegex() {
        return containerNameRegex;
    }

    /**
     * @param containerNameRegex 待采集的容器名称
     */
    public void setContainerNameRegex(String containerNameRegex) {
        this.containerNameRegex = containerNameRegex;
    }

    /**
     * @return Label 指定待采集的容器，不启用白名单时指定采集全部容器
     */
    public Map<String, String> getIncludeContainerLabelRegex() {
        return includeContainerLabelRegex;
    }

    /**
     * @param includeContainerLabelRegex Label 指定待采集的容器，不启用白名单时指定采集全部容器
     */
    public void setIncludeContainerLabelRegex(Map<String, String> includeContainerLabelRegex) {
        this.includeContainerLabelRegex = includeContainerLabelRegex;
    }

    /**
     * @return 容器 Label 黑名单用于指定不采集的容器范围，不启用黑名单时表示采集全部容器
     */
    public Map<String, String> getExcludeContainerLabelRegex() {
        return excludeContainerLabelRegex;
    }

    /**
     * @param excludeContainerLabelRegex 容器 Label 黑名单用于指定不采集的容器范围，不启用黑名单时表示采集全部容器
     */
    public void setExcludeContainerLabelRegex(Map<String, String> excludeContainerLabelRegex) {
        this.excludeContainerLabelRegex = excludeContainerLabelRegex;
    }

    /**
     * @return 容器环境变量白名单通过容器环境变量指定待采集的容器，不启用白名单时表示指定采集全部容器
     */
    public Map<String, String> getIncludeContainerEnvRegex() {
        return includeContainerEnvRegex;
    }

    /**
     * @param includeContainerEnvRegex 容器环境变量白名单通过容器环境变量指定待采集的容器，不启用白名单时表示指定采集全部容器
     */
    public void setIncludeContainerEnvRegex(Map<String, String> includeContainerEnvRegex) {
        this.includeContainerEnvRegex = includeContainerEnvRegex;
    }

    /**
     * @return 容器环境变量黑名单用于指定不采集的容器范围，不启用黑名单时表示采集全部容器
     */
    public Map<String, String> getExcludeContainerEnvRegex() {
        return excludeContainerEnvRegex;
    }

    /**
     * @param excludeContainerEnvRegex 容器环境变量黑名单用于指定不采集的容器范围，不启用黑名单时表示采集全部容器
     */
    public void setExcludeContainerEnvRegex(Map<String, String> excludeContainerEnvRegex) {
        this.excludeContainerEnvRegex = excludeContainerEnvRegex;
    }

    /**
     * @return 是否将环境变量作为日志标签，添加到原始日志数据中
     */
    public Map<String, String> getEnvTag() {
        return envTag;
    }

    /**
     * @param envTag 是否将环境变量作为日志标签，添加到原始日志数据中
     */
    public void setEnvTag(Map<String, String> envTag) {
        this.envTag = envTag;
    }

    /**
     * @return Kubernetes 容器的采集规则
     */
    public KubernetesRule getKubernetesRule() {
        return kubernetesRule;
    }

    /**
     * @param kubernetesRule Kubernetes 容器的采集规则
     */
    public void setKubernetesRule(KubernetesRule kubernetesRule) {
        this.kubernetesRule = kubernetesRule;
    }
}
