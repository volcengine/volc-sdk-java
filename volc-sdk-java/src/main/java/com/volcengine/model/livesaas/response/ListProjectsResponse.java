package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListProjectsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListProjectsResponseBody result;

    @Data
    public static class ListProjectsResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "Projects")
        List<Project> Projects;
    }

    @Data
    public static class Project {
        @JSONField(name = "ProjectName")
        String ProjectName;
        @JSONField(name = "DisplayName")
        String DisplayName;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "ScenarioCount")
        Long ScenarioCount;
        @JSONField(name = "TaskCount")
        Long TaskCount;
    }
}