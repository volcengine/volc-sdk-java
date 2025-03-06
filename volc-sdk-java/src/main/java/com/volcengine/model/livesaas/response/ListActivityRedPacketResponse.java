package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.beans.livesaas.RedPacketConfig;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;

@Data
public class ListActivityRedPacketResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityRedPacketResponseBody result;

    @Data
    public static class ListActivityRedPacketResponseBody {
        @JSONField(name = "RedPacketList")
        List<RedPacketConfig> RedPacketList;

        @JSONField(name = "PageItemCount")
        Integer PageItemCount;

        @JSONField(name = "PageNo")
        Integer PageNo;

        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}
