package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetPodPropertyQuery
 */
@lombok.Data
public final class GetPodPropertyQuery  {

    /**
     * <p>实例所属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>筛选条件，secure 类型 setting 名称列表，多个属性名称以英文逗号分隔；可查询的 setting 名称，参考 [云手机实例属性列表](https://www.volcengine.com/docs/6394/671880#settings-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSecureNameList")
    private String settingSecureNameList;

    /**
     * <p>筛选条件，global 类型 setting 名称列表，多个属性名称以英文逗号分隔；可查询的 setting 名称，参考 [云手机实例属性列表](https://www.volcengine.com/docs/6394/671880#settings-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingGlobalNameList")
    private String settingGlobalNameList;

    /**
     * <p>筛选条件，system 类型 setting 名称列表，多个属性名称以英文逗号分隔；可查询的 setting 名称，参考 [云手机实例属性列表](https://www.volcengine.com/docs/6394/671880#settings-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SettingSystemNameList")
    private String settingSystemNameList;

    /**
     * <p>筛选条件，非持久化属性列表，多个属性名称以英文逗号分隔；可查询的非持久化属性，参考 [云手机实例属性列表](https://www.volcengine.com/docs/6394/671880#system-properties-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PropertyNameList")
    private String propertyNameList;

    /**
     * <p>筛选条件，持久化属性列表，多个属性名称以英文逗号分隔；可查询的持久化属性，参考 [云手机实例属性列表](https://www.volcengine.com/docs/6394/671880#system-properties-%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PersistPropertyNameList")
    private String persistPropertyNameList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
