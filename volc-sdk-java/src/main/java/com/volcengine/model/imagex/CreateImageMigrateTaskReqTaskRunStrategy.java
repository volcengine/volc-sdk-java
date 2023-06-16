package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateImageMigrateTaskReqTaskRunStrategy {
    @JSONField(name = "ReadQps")
    List<Integer> readQps;

    @JSONField(name = "ReadRate")
    List<Integer> readRate;
}

