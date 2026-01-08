package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATE_ID;
import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_AT_GROUPS;
import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_AT_USERS;
import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_INTEGRATION_ID;
import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_INTEGRATION_NAME;
import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_IS_AT_ALL;
import static com.volcengine.model.tls.Const.END_TIME;
import static com.volcengine.model.tls.Const.GENERAL_WEBHOOK_BODY;
import static com.volcengine.model.tls.Const.GENERAL_WEBHOOK_HEADERS;
import static com.volcengine.model.tls.Const.GENERAL_WEBHOOK_METHOD;
import static com.volcengine.model.tls.Const.GENERAL_WEBHOOK_URL;
import static com.volcengine.model.tls.Const.RECEIVER_CHANNELS;
import static com.volcengine.model.tls.Const.RECEIVER_NAMES;
import static com.volcengine.model.tls.Const.RECEIVER_TYPE;
import static com.volcengine.model.tls.Const.START_TIME;
import static com.volcengine.model.tls.Const.WEBHOOK;

@Data
public class Receiver {

    /** 接收者类型. */
    @JSONField(name = RECEIVER_TYPE)
    private String receiverType;

    /** 接收者名称列表. */
    @JSONField(name = RECEIVER_NAMES)
    private List<String> receiverNames;

    /** 通知接收渠道列表. */
    @JSONField(name = RECEIVER_CHANNELS)
    private List<String> receiverChannels;

    /** 可接收信息的开始时间. */
    @JSONField(name = START_TIME)
    private String startTime;

    /** 可接收信息的结束时间. */
    @JSONField(name = END_TIME)
    private String endTime;

    /** 飞书 Webhook 请求地址. */
    @JSONField(name = WEBHOOK)
    private String webhook;

    /** 自定义 Webhook 请求地址. */
    @JSONField(name = GENERAL_WEBHOOK_URL)
    private String generalWebhookUrl;

    /** 自定义 Webhook 请求体. */
    @JSONField(name = GENERAL_WEBHOOK_BODY)
    private String generalWebhookBody;

    /** Webhook @ 的用户列表. */
    @JSONField(name = ALARM_WEBHOOK_AT_USERS)
    private List<String> alarmWebhookAtUsers;

    /** Webhook 是否 @ 所有人. */
    @JSONField(name = ALARM_WEBHOOK_IS_AT_ALL)
    private Boolean alarmWebhookIsAtAll;

    /** Webhook @ 的用户组列表. */
    @JSONField(name = ALARM_WEBHOOK_AT_GROUPS)
    private List<String> alarmWebhookAtGroups;

    /** Webhook 请求方法. */
    @JSONField(name = GENERAL_WEBHOOK_METHOD)
    private String generalWebhookMethod;

    /** Webhook 请求头列表. */
    @JSONField(name = GENERAL_WEBHOOK_HEADERS)
    private List<GeneralWebhookHeaderKV> generalWebhookHeaders;

    /** 告警内容模板 ID. */
    @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
    private String alarmContentTemplateId;

    /** 告警 Webhook 集成 ID. */
    @JSONField(name = ALARM_WEBHOOK_INTEGRATION_ID)
    private String alarmWebhookIntegrationId;

    /** 告警 Webhook 集成名称. */
    @JSONField(name = ALARM_WEBHOOK_INTEGRATION_NAME)
    private String alarmWebhookIntegrationName;

    /**
     * 创建一个空的接收者配置实例.
     */
    public Receiver() {
    }

    /**
     * 获取接收者类型.
     *
     * @return 接收者类型
     */
    public String getReceiverType() {
        return receiverType;
    }

    /**
     * 设置接收者类型.
     *
     * @param newReceiverType 接收者类型
     */
    public void setReceiverType(final String newReceiverType) {
        this.receiverType = newReceiverType;
    }

    /**
     * 获取接收者名称列表.
     *
     * @return 接收者名称列表
     */
    public List<String> getReceiverNames() {
        return receiverNames;
    }

    /**
     * 设置接收者名称列表.
     *
     * @param newReceiverNames 接收者名称列表
     */
    public void setReceiverNames(final List<String> newReceiverNames) {
        this.receiverNames = newReceiverNames;
    }

    /**
     * 获取通知接收渠道列表.
     *
     * @return 通知接收渠道列表
     */
    public List<String> getReceiverChannels() {
        return receiverChannels;
    }

    /**
     * 设置通知接收渠道列表.
     *
     * @param newReceiverChannels 通知接收渠道列表
     */
    public void setReceiverChannels(final List<String> newReceiverChannels) {
        this.receiverChannels = newReceiverChannels;
    }

    /**
     * 获取可接收信息的开始时间.
     *
     * @return 开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置可接收信息的开始时间.
     *
     * @param newStartTime 开始时间
     */
    public void setStartTime(final String newStartTime) {
        this.startTime = newStartTime;
    }

    /**
     * 获取可接收信息的结束时间.
     *
     * @return 结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置可接收信息的结束时间.
     *
     * @param newEndTime 结束时间
     */
    public void setEndTime(final String newEndTime) {
        this.endTime = newEndTime;
    }

    /**
     * 获取飞书 Webhook 请求地址.
     *
     * @return Webhook 请求地址
     */
    public String getWebhook() {
        return webhook;
    }

    /**
     * 设置飞书 Webhook 请求地址.
     *
     * @param newWebhook Webhook 请求地址
     */
    public void setWebhook(final String newWebhook) {
        this.webhook = newWebhook;
    }

    /**
     * @return 自定义接口回调地址
     */
    public String getGeneralWebhookUrl() {
        return generalWebhookUrl;
    }

    /**
     * @param generalWebhookUrl 自定义接口回调地址
     */
    public void setGeneralWebhookUrl(String generalWebhookUrl) {
        this.generalWebhookUrl = generalWebhookUrl;
    }

    /**
     * @return 自定义WebHook请求体
     */
    public String getGeneralWebhookBody() {
        return generalWebhookBody;
    }

    /**
     * @param generalWebhookBody 自定义WebHook请求体
     */
    public void setGeneralWebhookBody(String generalWebhookBody) {
        this.generalWebhookBody = generalWebhookBody;
    }

    /**
     * @return 通过Webhook集成配置发送通知时需要提醒的用户名
     */
    public List<String> getAlarmWebhookAtUsers() {
        return alarmWebhookAtUsers;
    }

    /**
     * @param alarmWebhookAtUsers 通过Webhook集成配置发送通知时需要提醒的用户名
     */
    public void setAlarmWebhookAtUsers(List<String> alarmWebhookAtUsers) {
        this.alarmWebhookAtUsers = alarmWebhookAtUsers;
    }

    /**
     * @return 通过Webhook集成配置发送通知时是否提醒所有人
     */
    public Boolean getAlarmWebhookIsAtAll() {
        return alarmWebhookIsAtAll;
    }

    /**
     * @param alarmWebhookIsAtAll 通过Webhook集成配置发送通知时是否提醒所有人
     */
    public void setAlarmWebhookIsAtAll(Boolean alarmWebhookIsAtAll) {
        this.alarmWebhookIsAtAll = alarmWebhookIsAtAll;
    }

    /**
     * @return 通过Webhook集成配置发送通知时需要提醒的用户组名称
     */
    public List<String> getAlarmWebhookAtGroups() {
        return alarmWebhookAtGroups;
    }

    /**
     * @param alarmWebhookAtGroups 通过Webhook集成配置发送通知时需要提醒的用户组名称
     */
    public void setAlarmWebhookAtGroups(List<String> alarmWebhookAtGroups) {
        this.alarmWebhookAtGroups = alarmWebhookAtGroups;
    }

    /**
     * @return 自定义接口回调方法
     */
    public String getGeneralWebhookMethod() {
        return generalWebhookMethod;
    }

    /**
     * @param generalWebhookMethod 自定义接口回调方法
     */
    public void setGeneralWebhookMethod(String generalWebhookMethod) {
        this.generalWebhookMethod = generalWebhookMethod;
    }

    /**
     * @return 自定义接口回调请求头
     */
    public List<GeneralWebhookHeaderKV> getGeneralWebhookHeaders() {
        return generalWebhookHeaders;
    }

    /**
     * @param generalWebhookHeaders 自定义接口回调请求头
     */
    public void setGeneralWebhookHeaders(List<GeneralWebhookHeaderKV> generalWebhookHeaders) {
        this.generalWebhookHeaders = generalWebhookHeaders;
    }

    /**
     * @return 告警内容模版ID
     */
    public String getAlarmContentTemplateId() {
        return alarmContentTemplateId;
    }

    /**
     * @param alarmContentTemplateId 告警内容模版ID
     */
    public void setAlarmContentTemplateId(String alarmContentTemplateId) {
        this.alarmContentTemplateId = alarmContentTemplateId;
    }

    /**
     * @return 告警Webhook集成配置的ID
     */
    public String getAlarmWebhookIntegrationId() {
        return alarmWebhookIntegrationId;
    }

    /**
     * @param alarmWebhookIntegrationId 告警Webhook集成配置的ID
     */
    public void setAlarmWebhookIntegrationId(String alarmWebhookIntegrationId) {
        this.alarmWebhookIntegrationId = alarmWebhookIntegrationId;
    }

    /**
     * @return 告警Webhook集成配置的名称
     */
    public String getAlarmWebhookIntegrationName() {
        return alarmWebhookIntegrationName;
    }

    /**
     * @param alarmWebhookIntegrationName 告警Webhook集成配置的名称
     */
    public void setAlarmWebhookIntegrationName(String alarmWebhookIntegrationName) {
        this.alarmWebhookIntegrationName = alarmWebhookIntegrationName;
    }
}
