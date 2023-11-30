package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class QueryUid {
    @JSONField(name = "Uid")
    String Uid;
    @JSONField(name = "DouyinId")
    String DouyinId;
}