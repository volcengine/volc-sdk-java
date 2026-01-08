package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_ID;
import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_NAME;
import static com.volcengine.model.tls.Const.CREATE_TIME;
import static com.volcengine.model.tls.Const.IAM_PROJECT_NAME;
import static com.volcengine.model.tls.Const.MODIFY_TIME;
import static com.volcengine.model.tls.Const.NOTICE_RULES;
import static com.volcengine.model.tls.Const.NOTIFY_TYPE;
import static com.volcengine.model.tls.Const.RECEIVERS;


@Data
@NoArgsConstructor
public class AlarmNotifyGroupInfo {

    /** 告警通知组名称. */
    @JSONField(name = ALARM_NOTIFY_GROUP_NAME)
    private String alarmNotifyGroupName;

    /** 告警通知组 ID. */
    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    private String alarmNotifyGroupId;

    /** 告警通知方式列表. */
    @JSONField(name = NOTIFY_TYPE)
    private List<String> notifyType;

    /** 告警接收人列表. */
    @JSONField(name = RECEIVERS)
    private List<Receiver> receivers;

    /** 告警通知组创建时间. */
    @JSONField(name = CREATE_TIME)
    private String createTime;

    /** 告警通知组修改时间. */
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;

    /** IAM 项目名称. */
    @JSONField(name = IAM_PROJECT_NAME)
    private String iamProjectName;

    /** 通知规则列表. */
    @JSONField(name = NOTICE_RULES)
    private List<NoticeRule> noticeRules;
}
