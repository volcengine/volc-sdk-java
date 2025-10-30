package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VidFailedInfoModel;
import com.volcengine.model.beans.livesaas.VidAPIInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListPlayUrlsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListPlayUrlsAPIResponseModel result;

    @Data
    public static class ListPlayUrlsAPIResponseModel {
        @JSONField(name = "FailedList")
        List<VidFailedInfoModel> FailedList;
        @JSONField(name = "SuccessList")
        List<VidAPIInfo> SuccessList;
    }
}