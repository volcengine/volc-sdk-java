package com.volcengine.model.tls.request;

import com.volcengine.model.tls.pb.PutLogRequest;
import org.junit.Assert;
import org.junit.Test;

public class PutLogsRequestTest {
    private PutLogRequest.LogGroup buildGroup(int count) {
        PutLogRequest.LogGroup.Builder builder = PutLogRequest.LogGroup.newBuilder();
        for (int i = 0; i < count; i++) {
            builder.addLogs(PutLogRequest.Log.newBuilder().build());
        }
        return builder.build();
    }

    @Test
    public void testLogGroupCountValidation() {
        PutLogRequest.LogGroupList okList = PutLogRequest.LogGroupList.newBuilder()
                .addLogGroups(buildGroup(10000))
                .build();
        PutLogsRequest okRequest = new PutLogsRequest(okList, "topic");
        Assert.assertTrue(okRequest.CheckValidation());

        PutLogRequest.LogGroupList badList = PutLogRequest.LogGroupList.newBuilder()
                .addLogGroups(buildGroup(10001))
                .build();
        PutLogsRequest badRequest = new PutLogsRequest(badList, "topic");
        Assert.assertFalse(badRequest.CheckValidation());
    }
}
