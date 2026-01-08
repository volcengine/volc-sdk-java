package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeAlarmContentTemplatesRequest {
    @JSONField(name = PROJECT_ID)
    private String projectId;
    @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
    private String alarmContentTemplateId;
    @JSONField(name = ALARM_CONTENT_TEMPLATE_NAME)
    private String alarmContentTemplateName;
    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;
    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;

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
     * @return 告警内容模板 ID
     */
    public String getAlarmContentTemplateId() {
        return alarmContentTemplateId;
    }

    /**
     * @param alarmContentTemplateId 告警内容模板 ID
     */
    public void setAlarmContentTemplateId(String alarmContentTemplateId) {
        this.alarmContentTemplateId = alarmContentTemplateId;
    }

    /**
     * @return 告警内容模板名称
     */
    public String getAlarmContentTemplateName() {
        return alarmContentTemplateName;
    }

    /**
     * @param alarmContentTemplateName 告警内容模板名称
     */
    public void setAlarmContentTemplateName(String alarmContentTemplateName) {
        this.alarmContentTemplateName = alarmContentTemplateName;
    }

    /**
     * @return 分页查询时的页码。默认为 1
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 分页查询时的页码。默认为 1
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 分页大小。默认为 20，最大为 100
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 分页大小。默认为 20，最大为 100
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.projectId == null || this.projectId.isEmpty()) {
            return false;
        }
        return true;
    }
}