package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSettingRuleHistoryResResultRecordsItem
 */
@lombok.Data
public final class GetImageSettingRuleHistoryResResultRecordsItem  {

    /**
     * <p>修改时间，即修改规则的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifiedAt")
    private String modifiedAt;

    /**
     * <p>修改人，即修改规则的当前账号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Modifier")
    private String modifier;

    /**
     * <p>修改信息，如：新增规则、删除规则、调整优先级。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModifyMsg")
    private String modifyMsg;

    /**
     * <p>新规则内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NewInfo")
    private GetImageSettingRuleHistoryResResultRecordsItemNewInfo newInfo;

    /**
     * <p>旧规则内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OldInfo")
    private GetImageSettingRuleHistoryResResultRecordsItemOldInfo oldInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
