package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class AlarmPeriodSetting {
    @JSONField(name = SMS)
    int sms;
    @JSONField(name = PHONE)
    int phone;
    @JSONField(name = EMAIL)
    int email;
    @JSONField(name = GENERAL_WEBHOOK)
    int generalWebhook;

    public AlarmPeriodSetting(int sms, int phone, int email, int generalWebhook) {
        this.sms = sms;
        this.phone = phone;
        this.email = email;
        this.generalWebhook = generalWebhook;
    }

    /**
     * @return 短信告警周期
     */
    public int getSms() {
        return sms;
    }

    /**
     * @param sms 短信告警周期
     */
    public void setSms(int sms) {
        this.sms = sms;
    }

    /**
     * @return 电话告警周期
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone 电话告警周期
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return 邮件告警周期
     */
    public int getEmail() {
        return email;
    }

    /**
     * @param email 邮件告警周期
     */
    public void setEmail(int email) {
        this.email = email;
    }

    /**
     * @return 自定义webhook告警周期
     */
    public int getGeneralWebhook() {
        return generalWebhook;
    }

    /**
     * @param generalWebhook 自定义webhook告警周期
     */
    public void setGeneralWebhook(int generalWebhook) {
        this.generalWebhook = generalWebhook;
    }
}
