package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ALIAS;
import static com.volcengine.model.tls.Const.REGION;
import static com.volcengine.model.tls.Const.ROLE_TRN;
import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@NoArgsConstructor
public class TargetResource {

    /** 目标资源别名. */
    @JSONField(name = ALIAS)
    private String alias;

    /** 目标日志主题 ID. */
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /** 目标地域. */
    @JSONField(name = REGION)
    private String region;

    /** 目标资源使用的角色 TRN. */
    @JSONField(name = ROLE_TRN)
    private String roleTrn;

    /**
     * 使用别名、日志主题 ID 与地域构造目标资源.
     *
     * @param aliasValue  目标资源别名
     * @param topicIdValue 目标日志主题 ID
     * @param regionValue  目标地域
     */
    public TargetResource(final String aliasValue,
                          final String topicIdValue,
                          final String regionValue) {
        this.alias = aliasValue;
        this.topicId = topicIdValue;
        this.region = regionValue;
    }

    /**
     * 使用别名、日志主题 ID、地域与角色 TRN 构造目标资源.
     *
     * @param aliasValue  目标资源别名
     * @param topicIdValue 目标日志主题 ID
     * @param regionValue  目标地域
     * @param roleTrnValue 角色 TRN
     */
    public TargetResource(final String aliasValue, final String topicIdValue,
                          final String regionValue, final String roleTrnValue) {
        this.alias = aliasValue;
        this.topicId = topicIdValue;
        this.region = regionValue;
        this.roleTrn = roleTrnValue;
    }
}
