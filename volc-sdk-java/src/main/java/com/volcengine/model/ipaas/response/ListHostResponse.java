package com.volcengine.model.ipaas.response;

//import com.google.gson.annotations.SerializedName;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListHostResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetaData responseMetadata;
    @JSONField(name = "Result")
    HostList result;

    @Data
    public static class HostList {
        @JSONField(name = "total")
        long total;
        @JSONField(name = "row")
        List<Host> hosts;
    }
}

