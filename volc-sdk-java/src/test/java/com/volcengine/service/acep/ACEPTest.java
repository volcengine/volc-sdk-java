package com.volcengine.service.acep;

import com.volcengine.model.acep.*;

import com.volcengine.model.acep.v20231030.RequestSystemProperty;
import junit.framework.TestCase;

import java.util.*;

public class ACEPTest  extends TestCase {
    private final ACEPService  service = ACEPService.getInstance();

    {
        String accessKey = "";
        service.setAccessKey(accessKey);
        String secretKey = "";
        service.setSecretKey(secretKey);
    }

    public void testListPod() {
        ListPodQuery query = new ListPodQuery();
        query.setProductId("1591495366954455040");
        try {
            ListPodRes resp = service.listPod(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testCreatePropertyRule(){

        // 强烈建议不要把 VOLC_ACCESSKEY 和 VOLC_SECRETKEY 保存到工程代码里，否则可能导致 AccessKey 泄露，威胁您账号下所有资源的安全。
        // 本示例通过从环境变量中读取 VOLC_ACCESSKEY 和 VOLC_SECRETKEY，来实现 API 访问的身份验证。运行代码示例前，请配置环境变量 VOLC_ACCESSKEY 和 VOLC_SECRETKEY
        ACEPService service = ACEPService.getInstance();

        service.setAccessKey(System.getenv("VOLC_ACCESSKEY"));

        service.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        AddPropertyRuleBody body = new AddPropertyRuleBody();

        // 机型参数规则名称，账户下规则名称唯一，长度不能超过 200 个字符。
        body.setRuleName("Oppo1");

        // 实例 Settings 系统属性，非持久化，立即生效，重启实例后失效；详细信息，参考 [SystemProperty](#systemproperty) 定义。
        List<
                        RequestSystemProperty
                        > OverlayProperty = new ArrayList<>();
        com.volcengine.model.acep.v20231030.RequestSystemProperty OverlayProperty1 =
                new com.volcengine.model.acep.v20231030.RequestSystemProperty();
        OverlayProperty1.setSystemPropertyName("ro.product.model");
        OverlayProperty1.setSystemPropertyValue("A1601");
        OverlayProperty1.setSystemPropertyValueType("string");
        OverlayProperty.add(OverlayProperty1);
        body.setOverlayProperty(OverlayProperty);

        try {
            AddPropertyRuleRes resp = service.addPropertyRule(body);
            System.out.println(resp.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
