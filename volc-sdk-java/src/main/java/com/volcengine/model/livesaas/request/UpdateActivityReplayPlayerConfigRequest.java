package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ReplayPlayerConfig;
import lombok.Data;

@Data
public class UpdateActivityReplayPlayerConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ReplayPlayerConfig")
    ReplayPlayerConfig ReplayPlayerConfig;
}