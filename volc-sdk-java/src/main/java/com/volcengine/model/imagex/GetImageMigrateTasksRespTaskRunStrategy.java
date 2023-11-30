package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.util.List;

@Data
public class GetImageMigrateTasksRespTaskRunStrategy {
    @JSONField(name = "ReadQps")
    private List<Integer> readQps;

    @JSONField(name = "ReadRate")
    private List<Integer> readRate;
}

