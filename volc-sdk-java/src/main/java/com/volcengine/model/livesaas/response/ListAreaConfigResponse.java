package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Area;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListAreaConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAreaConfigResponseBody result;

    @Data
    public static class ListAreaConfigResponseBody {
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "Areas")
        List<Area> Areas;
    }
}
