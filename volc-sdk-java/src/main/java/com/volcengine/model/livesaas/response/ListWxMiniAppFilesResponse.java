package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.WxMiniAppFile;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListWxMiniAppFilesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListWxMiniAppFilesResponseBody result;

    @Data
    public static class ListWxMiniAppFilesResponseBody {
        @JSONField(name = "Configs")
        List<WxMiniAppFile> Configs;
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "MaxCount")
        Long MaxCount;
        @JSONField(name = "AddedCount")
        Long AddedCount;
    }
}

