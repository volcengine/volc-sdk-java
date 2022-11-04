package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListSpaceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSpace spaces;

    @Data
    public static class ListSpace {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "TotalCount")
        int totalCount;
        @JSONField(name = "Spaces")
        List<Space> spaces;
    }
}
