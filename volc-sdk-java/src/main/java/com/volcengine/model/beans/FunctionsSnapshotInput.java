package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionsSnapshotInput {
    @JSONField(name = "SnapshotTime")
    double snapshotTime;
}