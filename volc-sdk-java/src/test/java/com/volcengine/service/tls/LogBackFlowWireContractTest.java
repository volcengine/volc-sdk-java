package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.request.DescribeLogBackFlowTasksRequest;
import org.apache.http.NameValuePair;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.DESCRIBE_LOG_BACK_FLOW_TASKS;
import static com.volcengine.model.tls.Const.LOG_BACK_FLOW_STATUS_DONE;

public class LogBackFlowWireContractTest {
    @Test
    public void describeUsesCurrentQueryKeysAndRepeatedTopicIds() throws Exception {
        CapturingTLSHttpUtil http = newHttpUtil();
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        TLSLogClientImpl client = new TLSLogClientImpl(http, config);

        DescribeLogBackFlowTasksRequest request = new DescribeLogBackFlowTasksRequest();
        request.setStatus(LOG_BACK_FLOW_STATUS_DONE);
        request.setEtlTaskId("etl-id");
        request.setTopicIDList(Arrays.asList("topic-a", "topic-b"));
        client.describeLogBackFlowTasks(request);

        Assert.assertEquals(DESCRIBE_LOG_BACK_FLOW_TASKS, http.api);
        Assert.assertEquals(Arrays.asList("topic-a", "topic-b"), http.values("TopicIDList"));
        Assert.assertEquals(Arrays.asList(LOG_BACK_FLOW_STATUS_DONE), http.values("Status"));
        Assert.assertEquals(Arrays.asList("etl-id"), http.values("ETLTaskId"));
        Assert.assertTrue(http.values("ScheduleSQLTaskId").isEmpty());
    }

    private CapturingTLSHttpUtil newHttpUtil() {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        ServiceInfo info = ClientConfig.initServiceInfo(config);
        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "GET");
        apiParams.put(Const.Path, DESCRIBE_LOG_BACK_FLOW_TASKS);
        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put(DESCRIBE_LOG_BACK_FLOW_TASKS, new ApiInfo(apiParams));
        return new CapturingTLSHttpUtil(info, infos);
    }

    static class CapturingTLSHttpUtil extends TLSHttpUtil {
        String api;
        List<NameValuePair> params = new ArrayList<>();

        CapturingTLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> infos) {
            super(info, infos);
        }

        @Override
        public RawResponse json(String api, List<NameValuePair> params, String body,
                                Map<String, String> headers) {
            this.api = api;
            this.params = new ArrayList<>(params);
            byte[] response = "{\"LogBackFlowTasks\":[],\"Total\":0}"
                    .getBytes(StandardCharsets.UTF_8);
            return new RawResponse(response, SdkError.SUCCESS.getNumber(), null,
                    new org.apache.http.Header[0], 200);
        }

        List<String> values(String name) {
            List<String> result = new ArrayList<>();
            for (NameValuePair param : params) {
                if (name.equals(param.getName())) {
                    result.add(param.getValue());
                }
            }
            return result;
        }
    }
}
