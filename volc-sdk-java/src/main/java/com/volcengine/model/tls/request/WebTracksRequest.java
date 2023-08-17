package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.LOGS;
import static com.volcengine.model.tls.Const.SOURCE;

@Data
@NoArgsConstructor
public class WebTracksRequest {
    @JSONField(serialize = false)
    String topicId;

    @JSONField(serialize = false)
    String projectId;

    @JSONField(serialize = false)
    String compressType;

    @JSONField(name = LOGS)
    List<Map<String, String>> logs;

    @JSONField(name = SOURCE)
    String source;

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 请求体的压缩格式支持lz4。默认不压缩
     */
    public String getCompressType() {
        return compressType;
    }

    /**
     * @param compressType 请求体的压缩格式支持lz4。默认不压缩
     */
    public void setCompressType(String compressType) {
        this.compressType = compressType;
    }

    /**
     * @return 日志内容
     */
    public List<Map<String, String>> getLogs() {
        return logs;
    }

    /**
     * @param logs 日志内容
     */
    public void setLogs(List<Map<String, String>> logs) {
        this.logs = logs;
    }

    /**
     * @return 日志来源
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source 日志来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.projectId == null || this.logs == null) {
            return false;
        }
        return true;
    }
}
