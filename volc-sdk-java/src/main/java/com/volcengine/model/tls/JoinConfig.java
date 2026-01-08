package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.CONDITION;
import static com.volcengine.model.tls.Const.SET_OPERATION_TYPE;

/**
 * 告警检索分析结果集合操作配置.
 */
@Data
@NoArgsConstructor
public class JoinConfig {

    /** 集合操作条件. */
    @JSONField(name = CONDITION)
    private String condition;

    /** 集合操作类型. */
    @JSONField(name = SET_OPERATION_TYPE)
    private String setOperationType;
}
