package com.volcengine.model.tls.request;

public class DescribeProjectRequest {
    private String projectId;

    public DescribeProjectRequest(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }
}
