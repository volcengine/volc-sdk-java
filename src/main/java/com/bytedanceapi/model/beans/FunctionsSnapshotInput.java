package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FunctionsSnapshotInput {
    @JSONField(name = "SnapshotTime")
    double snapshotTime;
}