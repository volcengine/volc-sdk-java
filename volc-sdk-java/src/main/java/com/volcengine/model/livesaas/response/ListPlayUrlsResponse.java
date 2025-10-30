package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VidAPIInfo;
import com.volcengine.model.beans.livesaas.VidFailedInfoModel;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListPlayUrlsResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private ListPlayUrlsResponseModel result;

    @Data
    public static class ListPlayUrlsResponseModel {
        @JSONField(name = "FailedList")
        private List<VidFailedInfoModel> FailedList;

        @JSONField(name = "SuccessList")
        private List<VidAPIInfo> SuccessList;
    }
}