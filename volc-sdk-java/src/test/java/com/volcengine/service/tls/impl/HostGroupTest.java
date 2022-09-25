package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HostGroupTest extends BaseTest {
    @Test
    public void test() {
        String prefix = "test-group";
        String separator = "-";
        try {
            //create host group
            CreateHostGroupRequest createHostGroupRequest = new CreateHostGroupRequest();
            createHostGroupRequest.setHostGroupName(prefix + separator + System.currentTimeMillis());
            createHostGroupRequest.setHostGroupType("IP");
            createHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.1", "127.0.0.1"));
            CreateHostGroupResponse createHostGroupResponse = client.createHostGroup(createHostGroupRequest);
            assertTrue(createHostGroupResponse.getHostGroupId().length() > 0);
            System.out.println("create host group success,response:" + createHostGroupResponse);

            Exception exception = assertThrows(LogException.class, () -> {
                client.createHostGroup(createHostGroupRequest);
            });
            String expectedMessage = "MachineGroup " + createHostGroupRequest.getHostGroupName() +
                    " already exist";
            String actualMessage = exception.getMessage();
             assertEquals(expectedMessage, actualMessage);

            //describe host group
            DescribeHostGroupResponse describeHostGroupResponse = client.describeHostGroup(
                    new DescribeHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            Assert.assertEquals(describeHostGroupResponse.getHostGroupHostsRulesInfo().getHostGroupInfo().
                    getHostGroupName(), createHostGroupRequest.getHostGroupName());
            exception = assertThrows(LogException.class, () -> {
                client.describeHostGroup(
                        new DescribeHostGroupRequest("zsq_123_4356"));
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("describe host group success,response:" + describeHostGroupResponse);

            //modify host group
            ModifyHostGroupRequest modifyHostGroupRequest = new ModifyHostGroupRequest();
            modifyHostGroupRequest.setHostGroupId(createHostGroupResponse.getHostGroupId());
            modifyHostGroupRequest.setHostGroupName(createHostGroupRequest.getHostGroupName() + separator
                    + System.currentTimeMillis());
            modifyHostGroupRequest.setHostGroupType("IP");
            modifyHostGroupRequest.setHostIdentifier("auto-label");
            modifyHostGroupRequest.setHostIpList(Arrays.asList("192.168.0.3", "127.0.0.3"));
            ModifyHostGroupResponse modifyHostGroupResponse = client.modifyHostGroup(modifyHostGroupRequest);
            describeHostGroupResponse = client.describeHostGroup(
                    new DescribeHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            Assert.assertEquals(describeHostGroupResponse.getHostGroupHostsRulesInfo().getHostGroupInfo().
                    getHostGroupName(), modifyHostGroupRequest.getHostGroupName());

            exception = assertThrows(LogException.class, () -> {
                modifyHostGroupRequest.setHostGroupName("zsq_1243_456");
                client.modifyHostGroup(modifyHostGroupRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("modify host group success,response:" + modifyHostGroupResponse);


            //describe host groups
            DescribeHostGroupsRequest describeHostGroupsRequest = new DescribeHostGroupsRequest();
            describeHostGroupsRequest.setPageNumber(1);
            describeHostGroupsRequest.setPageSize(10);
            DescribeHostGroupsResponse describeHostGroupsResponse =
                    client.describeHostGroups(describeHostGroupsRequest);
            assertTrue(describeHostGroupsResponse.getTotal() > 0);

            exception = assertThrows(LogException.class, () -> {
                describeHostGroupsRequest.setHostGroupId("zsq_123_456");
                client.describeHostGroups(describeHostGroupsRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("describe host groups success,response:" + describeHostGroupsResponse);

            //describe host
            DescribeHostsRequest describeHostsRequest = new DescribeHostsRequest();
            describeHostsRequest.setHostGroupId(createHostGroupResponse.getHostGroupId());
            describeHostsRequest.setHeartbeatStatus(1);
            DescribeHostsResponse describeHostsResponse = client.describeHosts(describeHostsRequest);
            assertTrue(describeHostsResponse.getTotal() > 0);

            exception = assertThrows(LogException.class, () -> {
                describeHostsRequest.setHostGroupId("zsq_124_356");
                client.describeHosts(describeHostsRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("describe hosts success,response:" + describeHostsResponse);

            //delete host to group
            DeleteHostRequest deleteHostRequest =
                    new DeleteHostRequest(createHostGroupResponse.getHostGroupId(), "192.168.0.3");
            DeleteHostResponse deleteHostResponse = client.deleteHost(deleteHostRequest);
            assertTrue(deleteHostResponse.getRequestId().length() > 0);

            exception = assertThrows(LogException.class, () -> {
                client.deleteHost(deleteHostRequest);
            });
            expectedMessage = String.format("Host %s does not exist in HostGroup %s", deleteHostRequest.getIp(),
                    deleteHostRequest.getHostGroupId());
            actualMessage = exception.getMessage();
             assertEquals(expectedMessage, actualMessage);
            System.out.println("delete host to group success,response:" + deleteHostResponse);


            //delete host group
            DeleteHostGroupResponse deleteHostGroupResponse =
                    client.deleteHostGroup(new DeleteHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            assertTrue(deleteHostGroupResponse.getRequestId().length() > 0);

            exception = assertThrows(LogException.class, () -> {
                client.deleteHostGroup(new DeleteHostGroupRequest(createHostGroupResponse.getHostGroupId()));
            });
            expectedMessage = "HostGroup " + createHostGroupResponse.getHostGroupId()+
            " does not exist";
            actualMessage = exception.getMessage();
             assertEquals(expectedMessage, actualMessage);
            System.out.println("delete host group success,response:" + deleteHostGroupResponse);

        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
