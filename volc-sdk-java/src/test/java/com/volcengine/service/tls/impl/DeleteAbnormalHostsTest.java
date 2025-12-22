package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateHostGroupRequest;
import com.volcengine.model.tls.request.DeleteAbnormalHostsRequest;
import com.volcengine.model.tls.request.DeleteHostGroupRequest;
import com.volcengine.model.tls.response.CreateHostGroupResponse;
import com.volcengine.model.tls.response.DeleteAbnormalHostsResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DeleteAbnormalHostsTest extends BaseTest {
    @Test
    public void testDeleteAbnormalHosts() throws Exception {
        String hostGroupName = "tls-java-sdk-test-abnormal-hosts-" + System.currentTimeMillis();
        String hostGroupType = "Label";
        String hostIdentifier = "none";

        CreateHostGroupRequest createHostGroupRequest = new CreateHostGroupRequest();
        createHostGroupRequest.setHostGroupName(hostGroupName);
        createHostGroupRequest.setHostGroupType(hostGroupType);
        createHostGroupRequest.setHostIdentifier(hostIdentifier);

        try {
            CreateHostGroupResponse createHostGroupResponse = client.createHostGroup(createHostGroupRequest);

            DeleteAbnormalHostsRequest deleteAbnormalHostsRequest = new DeleteAbnormalHostsRequest(createHostGroupResponse.getHostGroupId());
            DeleteAbnormalHostsResponse deleteAbnormalHostsResponse = client.deleteAbnormalHosts(deleteAbnormalHostsRequest);
            assertNotNull(deleteAbnormalHostsResponse.getRequestId());

            // Clean up
            client.deleteHostGroup(new DeleteHostGroupRequest(createHostGroupResponse.getHostGroupId()));
        } catch (LogException e) {
            // ignore
        }
    }
}
