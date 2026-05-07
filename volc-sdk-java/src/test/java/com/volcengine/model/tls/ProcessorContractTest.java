package com.volcengine.model.tls;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.request.CreateIndexRequest;
import com.volcengine.model.tls.request.CreateProcessorRequest;
import com.volcengine.model.tls.request.ModifyIndexRequest;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class ProcessorContractTest {
    @Test
    public void indexRequestsSerializeEnablePhraseIndex() {
        CreateIndexRequest create = new CreateIndexRequest("topic-id", null, null, null, null, null, true);

        ModifyIndexRequest modify = new ModifyIndexRequest("topic-id", null, null, null, null, null, true);

        Assert.assertTrue(JSONObject.toJSONString(create).contains("\"EnablePhraseIndex\":true"));
        Assert.assertTrue(JSONObject.toJSONString(modify).contains("\"EnablePhraseIndex\":true"));
    }

    @Test
    public void createProcessorRequestSerializesServiceContractFields() throws Exception {
        CreateProcessorRequest request = new CreateProcessorRequest();
        setField(request, "projectId", "project-id");
        setField(request, "processorName", "processor-name");
        setField(request, "dslContent", "f_set(\"k\", \"v\")");
        setField(request, "processorType", "ingester");
        setField(request, "processorDSLType", "dsl");
        setField(request, "processorStatus", "enabled");
        setField(request, "failStrategy", "keep_raw");
        setField(request, "timeoutMs", 5000);
        setField(request, "maxQps", 10);

        String body = JSONObject.toJSONString(request);
        Assert.assertTrue(body.contains("\"ProjectId\":\"project-id\""));
        Assert.assertTrue(body.contains("\"ProcessorName\":\"processor-name\""));
        Assert.assertTrue(body.contains("\"ProcessorType\":\"ingester\""));
        Assert.assertTrue(body.contains("\"ProcessorDSLType\":\"dsl\""));
        Assert.assertTrue(body.contains("\"ProcessorStatus\":\"enabled\""));
        Assert.assertTrue(body.contains("\"FailStrategy\":\"keep_raw\""));
        Assert.assertTrue(body.contains("\"TimeoutMs\":5000"));
        Assert.assertTrue(body.contains("\"MaxQps\":10"));
    }

    private void setField(Object target, String name, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }
}
