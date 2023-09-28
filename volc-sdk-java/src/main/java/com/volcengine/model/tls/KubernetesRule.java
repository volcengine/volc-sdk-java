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

    /**
     * @return 待采集的 Kubernetes Namespace 名称，不指定 Namespace 名称时表示采集全部容器
     */
    public String getNamespaceNameRegex() {
        return namespaceNameRegex;
    }

    /**
     * @param namespaceNameRegex 待采集的 Kubernetes Namespace 名称，不指定 Namespace 名称时表示采集全部容器
     */
    public void setNamespaceNameRegex(String namespaceNameRegex) {
        this.namespaceNameRegex = namespaceNameRegex;
    }

    /**
     * @return 通过工作负载的类型指定采集的容器，仅支持选择一种类型
     */
    public String getWorkloadType() {
        return workloadType;
    }

    /**
     * @param workloadType 通过工作负载的类型指定采集的容器，仅支持选择一种类型
     */
    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    /**
     * @return 通过工作负载的名称指定待采集的容器
     */
    public String getWorkloadNameRegex() {
        return workloadNameRegex;
    }

    /**
     * @param workloadNameRegex 通过工作负载的名称指定待采集的容器
     */
    public void setWorkloadNameRegex(String workloadNameRegex) {
        this.workloadNameRegex = workloadNameRegex;
    }

    /**
     * @return Pod Label 白名单用于指定待采集的容器
     */
    public Map<String, String> getIncludePodLabelRegex() {
        return includePodLabelRegex;
    }

    /**
     * @param includePodLabelRegex Pod Label 白名单用于指定待采集的容器
     */
    public void setIncludePodLabelRegex(Map<String, String> includePodLabelRegex) {
        this.includePodLabelRegex = includePodLabelRegex;
    }

    /**
     * @return 通过 Pod Label 黑名单指定不采集的容器，不启用表示采集全部容器
     */
    public Map<String, String> getExcludePodLabelRegex() {
        return excludePodLabelRegex;
    }

    /**
     * @param excludePodLabelRegex 通过 Pod Label 黑名单指定不采集的容器，不启用表示采集全部容器
     */
    public void setExcludePodLabelRegex(Map<String, String> excludePodLabelRegex) {
        this.excludePodLabelRegex = excludePodLabelRegex;
    }

    /**
     * @return Pod名称用于指定待采集的容器
     */
    public String getPodNameRegex() {
        return podNameRegex;
    }

    /**
     * @param podNameRegex Pod名称用于指定待采集的容器
     */
    public void setPodNameRegex(String podNameRegex) {
        this.podNameRegex = podNameRegex;
    }

    /**
     * @return 是否将 Kubernetes Label 作为日志标签，添加到原始日志数据中
     */
    public Map<String, String> getLabelTag() {
        return labelTag;
    }

    /**
     * @param labelTag 是否将 Kubernetes Label 作为日志标签，添加到原始日志数据中
     */
    public void setLabelTag(Map<String, String> labelTag) {
        this.labelTag = labelTag;
    }
}
