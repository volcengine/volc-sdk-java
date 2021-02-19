package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityAPIResultBean result;

    @Data
    public static class GetActivityAPIResultBean {
        @JSONField(name = "Id")
        Long id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "LiveTime")
        Long liveTime;
        @JSONField(name = "Status")
        Integer status;
        @JSONField(name = "ViewUrl")
        String viewUrl;
        @JSONField(name = "IsPageViewEnable")
        Integer isPageViewEnable;
        @JSONField(name = "IsLockPreview")
        Integer isLockPreview;
    }
}
