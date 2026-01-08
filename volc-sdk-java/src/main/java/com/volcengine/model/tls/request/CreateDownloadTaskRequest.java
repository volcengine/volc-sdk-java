package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.LogContextInfos;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateDownloadTaskRequest {
    @JSONField(name = TASK_NAME)
    String taskName;

    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = QUERY)
    String query;

    @JSONField(name = START_TIME)
    Long startTime;

    @JSONField(name = END_TIME)
    Long endTime;

    @JSONField(name = DATA_FORMAT)
    String dataFormat;

    @JSONField(name = SORT)
    String sort;

    @JSONField(name = LIMIT)
    Integer limit;

    @JSONField(name = COMPRESSION)
    String compression;

    @JSONField(name = TASK_TYPE)
    Integer taskType;

    @JSONField(name = ALLOW_INCOMPLETE)
    Boolean allowIncomplete;

    @JSONField(name = LOG_CONTEXT_INFOS)
    LogContextInfos logContextInfos;

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        // 对齐服务端 CreateDownloadTaskReq 结构体的 binding:"required" 字段
        if (this.topicId == null || this.taskName == null || this.taskType == null
                || this.startTime == null || this.endTime == null
                || this.dataFormat == null || this.compression == null) {
            return false;
        }
        return true;
    }

    /**
     * @param startTime 查询开始时间点，单位为秒级 Unix 时间戳
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * @param endTime 查询结束时间点，单位为秒级 Unix 时间戳
     */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return 下载任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName 下载任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return 日志所在日志主题的 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志所在日志主题的 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 检索分析语句，语句长度最大为 4KiB
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query 检索分析语句，语句长度最大为 4KiB
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return 导出的文件格式，支持：csv、json、jsonl
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * @param dataFormat 导出的文件格式，支持设置为：csv、json、jsonl
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * @return 仅检索不分析时，日志的排序方式，生序asc降序desc
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort 仅检索不分析时，日志的排序方式，生序asc降序desc
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * @return 下载的原始日志条数，或分析结果的行数
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * @param limit 下载的原始日志条数，或分析结果的行数
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return 导出文件的压缩类型，支持 gzip、zip、none
     */
    public String getCompression() {
        return compression;
    }

    /**
     * @param compression 导出文件的压缩类型，支持 gzip、zip、none
     */
    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * @param startTime 查询开始时间点，单位为秒级 Unix 时间戳
     */
    @Deprecated
    public void setStartTime(BigInteger startTime) {
        this.startTime = startTime.longValue();
    }

    /**
     * @param endTime 查询结束时间点，单位为秒级 Unix 时间戳
     */
    @Deprecated
    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime.longValue();
    }
}
