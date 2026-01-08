package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.Receiver;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyAlarmNotifyGroupRequest {
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    String alarmNotifyGroupId;
    @JSONField(name = ALARM_NOTIFY_GROUP_NAME)
    String alarmNotifyGroupName;
    @JSONField(name = NOTIFY_TYPE)
    List<String> notifyType;
    @JSONField(name = RECEIVERS)
    List<Receiver> receivers;

    /**
     * @param alarmNotifyGroupId   告警通知组 ID
     * @param alarmNotifyGroupName 告警通知组名称
     * @param notifyType           告警通知的类型 Trigger告警触发、Recovery告警恢复
     * @param receivers            接收告警的 IAM 用户列表
     */
    public ModifyAlarmNotifyGroupRequest(String alarmNotifyGroupId, String alarmNotifyGroupName, List<String> notifyType, List<Receiver> receivers) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
        this.alarmNotifyGroupName = alarmNotifyGroupName;
        this.notifyType = notifyType;
        this.receivers = receivers;
    }

    /**
     * @return 告警通知组 ID
     */
    public String getAlarmNotifyGroupId() {
        return alarmNotifyGroupId;
    }

    /**
     * @param alarmNotifyGroupId 告警通知组 ID
     */
    public void setAlarmNotifyGroupId(String alarmNotifyGroupId) {
        this.alarmNotifyGroupId = alarmNotifyGroupId;
    }

    /**
     * @return 告警通知组名称
     */
    public String getAlarmNotifyGroupName() {
        return alarmNotifyGroupName;
    }

    /**
     * @param alarmNotifyGroupName 告警通知组名称
     */
    public void setAlarmNotifyGroupName(String alarmNotifyGroupName) {
        this.alarmNotifyGroupName = alarmNotifyGroupName;
    }

    /**
     * @return 告警通知的类型 Trigger告警触发、Recovery告警恢复
     */
    public List<String> getNotifyType() {
        return notifyType;
    }

    /**
     * @param notifyType 告警通知的类型 Trigger告警触发、Recovery告警恢复
     */
    public void setNotifyType(List<String> notifyType) {
        this.notifyType = notifyType;
    }

    /**
     * @return 接收告警的 IAM 用户列表
     */
    public List<Receiver> getReceivers() {
        return receivers;
    }

    /**
     * @param receivers 接收告警的 IAM 用户列表
     */
    public void setReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.alarmNotifyGroupId == null || this.alarmNotifyGroupId.isEmpty()) {
            return false;
        }
        return true;
    }
}
