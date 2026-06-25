package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VodReorderMediaIdIndex {
    @JSONField(name = "MediaId")
    Long MediaId;
    @JSONField(name = "Index")
    Integer Index;
}
