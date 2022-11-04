package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetDataProjectWithBindWidthAndFlowResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetDataProject getDataProject;

    @Data
    public static class GetDataProject {
        @JSONField(name = "TotalUp")
        int totalUp;
        @JSONField(name = "TotalDown")
        int totalDown;

        @JSONField(name = "DataUp")
        List<GetStreamDataResponse.DataProject> dataUp;
        @JSONField(name = "DataDown")
        List<GetStreamDataResponse.DataProject> dataDown;

    }
}
