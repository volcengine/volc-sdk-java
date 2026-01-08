package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.CHILDREN;
import static com.volcengine.model.tls.Const.TYPE;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
public class RuleNode {

    /** 规则节点类型. */
    @JSONField(name = TYPE)
    private String type;

    /** 规则取值列表. */
    @JSONField(name = VALUE)
    private List<String> value;

    /** 子规则节点列表. */
    @JSONField(name = CHILDREN)
    private List<RuleNode> children;

    /**
     * 构造规则节点.
     *
     * @param typeValue    规则节点类型
     * @param valueList    规则取值列表
     * @param childrenList 子规则节点列表
     */
    public RuleNode(final String typeValue, final List<String> valueList,
                    final List<RuleNode> childrenList) {
        this.type = typeValue;
        this.value = valueList;
        this.children = childrenList;
    }
}
