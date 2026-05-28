package com.volcengine.model.tls;

import com.volcengine.service.tls.TLSLogClientImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 修复后语义：
 *   1) DEFAULT_REQUEST_TIMEOUT_MS 必须为 static final，禁止运行期改写。
 *   2) setTimeout 不再写入静态字段，跨实例无污染。
 *
 * 反向证据：本用例只断言 final 修饰符与默认值常量；
 *   "实例域兜底"由 TlsClientTimeoutFallbackTest 通过反射调 getRetryPolicy 验证。
 */
public class TlsClientTimeoutIsolationTest {

    @Test
    public void defaultRequestTimeoutMsIsStaticFinal() throws NoSuchFieldException {
        Field f = TLSLogClientImpl.class.getField("DEFAULT_REQUEST_TIMEOUT_MS");
        int mods = f.getModifiers();
        assertTrue("DEFAULT_REQUEST_TIMEOUT_MS 必须 static", Modifier.isStatic(mods));
        assertTrue("DEFAULT_REQUEST_TIMEOUT_MS 必须 final，禁止 setTimeout 改写", Modifier.isFinal(mods));
    }

    @Test
    public void defaultRequestTimeoutMsValueLocked() {
        // 锁定 90s 默认值，防止悄悄变更上线
        assertEquals(90_000, TLSLogClientImpl.DEFAULT_REQUEST_TIMEOUT_MS);
    }
}
