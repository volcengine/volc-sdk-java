package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.MenuMsgAPI;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import java.util.List;

@Data
public class GetActivityMenuAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<MenuMsgAPI> result;
}