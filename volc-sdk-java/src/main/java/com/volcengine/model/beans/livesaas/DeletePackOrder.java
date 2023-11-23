package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeletePackOrder {
    @JSONField(name = "OrderId")
    String OrderId;
    @JSONField(name = "Uid")
    String Uid;
}