package com.volcengine.model.tls.request;

import com.volcengine.model.tls.TagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DescribeProjectsRequest {
    //start from 1 default 1
    Integer pageNumber;
    //default 20 max 100
    Integer pageSize;
    /**
     * project id and name in request only accept one,not support
     * query by project id and name at same time
     */
    String projectId;
    String projectName;
    /**
     * when query by project name it affects,true means exact match and
     * false means fuzzy match
     */
    Boolean isFullName;

    String IamProjectName;

    List<TagInfo> Tags;

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
     * @return 日志主题所属的日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志主题所属的日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 日志主题名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName 日志主题名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return 根据 ProjectName 筛选时，是否精确匹配
     */
    public Boolean getFullName() {
        return isFullName;
    }

    /**
     * @param fullName 根据 ProjectName 筛选时，是否精确匹配
     */
    public void setFullName(Boolean fullName) {
        isFullName = fullName;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        return true;
    }
}
