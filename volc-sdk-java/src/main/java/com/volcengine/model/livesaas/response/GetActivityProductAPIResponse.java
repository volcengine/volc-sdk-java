package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ProductAPIs;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import java.util.Map;

@Data
public class GetActivityProductAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Map<String, ProductAPIs> result;
}
