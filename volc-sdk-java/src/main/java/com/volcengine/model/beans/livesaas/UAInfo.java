package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.livesaas.response.UpdateProductCardResponse;
import lombok.Data;

import java.util.List;

@Data
public class UAInfo {
    @JSONField(name = "UAInfos")
    List<UAInfoMsg> UAInfos;
}
