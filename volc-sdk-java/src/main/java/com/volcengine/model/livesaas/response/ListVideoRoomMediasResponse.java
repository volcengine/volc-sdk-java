package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ListVideoRoomMedia;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListVideoRoomMediasResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListVideoRoomMediasResponseBody result;

    @Data
    public static class ListVideoRoomMediasResponseBody {
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "Medias")
        List<ListVideoRoomMedia> Medias;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }
}
