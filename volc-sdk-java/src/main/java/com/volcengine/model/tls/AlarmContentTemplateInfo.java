package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATE_ID;
import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATE_NAME;
import static com.volcengine.model.tls.Const.CREATE_TIME;
import static com.volcengine.model.tls.Const.DING_TALK_CONTENT;
import static com.volcengine.model.tls.Const.EMAIL_CONTENT;
import static com.volcengine.model.tls.Const.LARK_CONTENT;
import static com.volcengine.model.tls.Const.MODIFY_TIME;
import static com.volcengine.model.tls.Const.SMS_CONTENT;
import static com.volcengine.model.tls.Const.VMS_CONTENT;
import static com.volcengine.model.tls.Const.WEBHOOK_CONTENT;
import static com.volcengine.model.tls.Const.WE_CHAT_CONTENT;

@Data
@NoArgsConstructor
public class AlarmContentTemplateInfo {

    /** 告警内容模板 ID. */
    @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
    private String alarmContentTemplateId;

    /** 告警内容模板名称. */
    @JSONField(name = ALARM_CONTENT_TEMPLATE_NAME)
    private String alarmContentTemplateName;

    /** 短信告警内容. */
    @JSONField(name = SMS_CONTENT)
    private String smsContent;

    /** 语音告警内容. */
    @JSONField(name = VMS_CONTENT)
    private String vmsContent;

    /** 邮件告警内容. */
    @JSONField(name = EMAIL_CONTENT)
    private String emailContent;

    /** Webhook 告警内容. */
    @JSONField(name = WEBHOOK_CONTENT)
    private String webhookContent;

    /** 钉钉告警内容. */
    @JSONField(name = DING_TALK_CONTENT)
    private String dingTalkContent;

    /** 飞书告警内容. */
    @JSONField(name = LARK_CONTENT)
    private String larkContent;

    /** 微信告警内容. */
    @JSONField(name = WE_CHAT_CONTENT)
    private String weChatContent;

    /** 创建时间. */
    @JSONField(name = CREATE_TIME)
    private String createTime;

    /** 修改时间. */
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;
}
