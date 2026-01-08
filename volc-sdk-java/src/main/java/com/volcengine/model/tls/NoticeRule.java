package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.HAS_END_NODE;
import static com.volcengine.model.tls.Const.HAS_NEXT;
import static com.volcengine.model.tls.Const.RECEIVER_INFOS;
import static com.volcengine.model.tls.Const.RULE_NODE;

@Data
@NoArgsConstructor
public class NoticeRule {

    /** 是否存在下一条规则. */
    @JSONField(name = HAS_NEXT)
    private Boolean hasNext;

    /** 规则节点. */
    @JSONField(name = RULE_NODE)
    private RuleNode ruleNode;

    /** 是否存在结束节点. */
    @JSONField(name = HAS_END_NODE)
    private Boolean hasEndNode;

    /** 告警接收人信息列表. */
    @JSONField(name = RECEIVER_INFOS)
    private List<Receiver> receiverInfos;

    /**
     * 构造通知规则.
     *
     * @param hasNextValue      是否存在下一条规则
     * @param ruleNodeValue     规则节点
     * @param hasEndNodeValue   是否存在结束节点
     * @param receiverInfosValue 告警接收人信息列表
     */
    public NoticeRule(final Boolean hasNextValue,
                      final RuleNode ruleNodeValue,
                      final Boolean hasEndNodeValue,
                      final List<Receiver> receiverInfosValue) {
        this.hasNext = hasNextValue;
        this.ruleNode = ruleNodeValue;
        this.hasEndNode = hasEndNodeValue;
        this.receiverInfos = receiverInfosValue;
    }
}
